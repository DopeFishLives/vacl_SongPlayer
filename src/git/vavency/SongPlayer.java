package git.vavency;

import java.util.concurrent.TimeUnit;
import org.lwjgl.openal.*;

import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.stb.STBVorbis.*;
import static org.lwjgl.system.MemoryStack.stackMallocInt;
import static org.lwjgl.system.MemoryStack.stackPop;
import static org.lwjgl.system.MemoryStack.stackPush;
//import static org.lwjgl.system.libc.Stdlib.free;

public class SongPlayer
{
    private int spd;
    private Song sng = new Song(null, null);





    public void setSpeed(int speed)
    {
        this.spd = speed;
    }

    public void setSong(final Song song)
    {
        this.sng = song;
    }

    public void play()
    {
        //OpenAL setup
        String defaultDeviceName = alcGetString(0, ALC_DEFAULT_DEVICE_SPECIFIER); //Getting the device
        long device = alcOpenDevice(defaultDeviceName); //Open the device.

        int[] atributes = {0}; //Set atributes
        long context = alcCreateContext(device, atributes); //Makes a context
        alcMakeContextCurrent(context);

        ALCCapabilities alcCapabilities = ALC.createCapabilities(device);
        ALCapabilities alCapabilities = AL.createCapabilities(alcCapabilities);

        if(alCapabilities.OpenAL10)
        {
            for(int i=0; i<sng.size();i++)
            {
                System.out.println("[" + sng.getTitle() + "]: " + sng.getLyrics(i));
                try {
                    TimeUnit.MILLISECONDS.sleep(1000/this.spd);
                } catch (InterruptedException e) {}
            }

            alcDestroyContext(context);
            alcCloseDevice(device);
        }
    }

}