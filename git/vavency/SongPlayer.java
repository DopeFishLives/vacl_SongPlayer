package git.vavency;

import java.util.List;

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
        for(int i=0; i<sng.size();i++)
        {
            System.out.println("[" + sng.getTitle() + "]: " + sng.getLyrics(i));
        }
    }

}