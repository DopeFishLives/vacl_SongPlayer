package git.vavency.lyrplayer;

import java.util.List;

public class Song {

    private String sng;
    private List lyr;

    public Song(String title, List<String> lyrics)
    {
        this.lyr = lyrics;
        this.sng = title;
    }

    public Object getLyrics(int i)
    {
        return this.lyr.get(i);
    }

    public String getTitle()
    {
        return this.sng;
    }

    public void setTitle(String newsng)
    {
        this.sng = newsng;
    }

    public void setLyrics(List newlyr)
    {
        this.lyr = newlyr;
    }

    public int size()
    {
        return this.lyr.size();
    }
}