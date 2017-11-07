package git.vavency;

import java.util.List;

public class Song {

    private String sng;
    private List lyr;

    public Song(String title, List<String> lyrics)
    {
        this.lyr = lyrics;
        this.sng = title;
    }

    public List<String> getLyrics()
    {
        return this.lyr;
    }

    public String getTitle()
    {
        return this.sng;
    }

}