package git.vavency;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.lwjgl.openal.*;

import static org.lwjgl.openal.ALBindingKt.*;
import static org.lwjgl.openal.ALCBindingKt.*;
import static org.lwjgl.openal.ALCTypesKt.*;
import static org.lwjgl.openal.ALTypesKt.*;

public class SongPlayer
{
    private int spd;
    private Song sng = new Song(null, null);

    private String def_sfx_dev = alcGetString(0, ALC_DEFAULT_DEVICE_SPECIFIER);
    private long device = alc

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
        for(int i=0; i<sng.size();i++)
        {
            System.out.println("[" + sng.getTitle() + "]: " + sng.getLyrics(i));
            TimeUnit.MILLISECONDS.sleep(1000/this.spd);
        }
    }

}