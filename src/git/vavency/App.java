package git.vavency;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;

public class App {

    public static void main(String[] args)
    {
        int spee=5;
        final Song song = new Song("Yesterday", Arrays.asList("Yesterday all my troubles seemed so far away.",
                "Now it looks as though they're here to stay.",
                "Oh, I believe in yesterday.",
                "Suddenly I'm not half the man I used to be.",
                "There's a shadow hanging over me.",
                "Oh, yesterday came suddenly.",
                "Why she had to go, I don't know, she wouldn't say.",
                "I said something wrong, now I long for yesterday.",
                "Yesterday love was such an easy game to play.",
                "Now I need a place to hide away.",
                "Oh, I believe in yesterday.",
                "Why she had to go, I don't know, she wouldn't say.",
                "I said something wrong, now I long for yesterday.",
                "Yesterday love was such an easy game to play.",
                "Now I need a place to hide away.",
                "Oh, I believe in yesterday.",
                "Mm mm mm mm mm mm mm"));


        try
        {
            int name=0;

            for(int i=0; i<args.length;i++)
            {
                try { spee = Integer.parseInt(args[i]); }
                catch(Exception|Error e) { name=i; }
            }

            File sng = new File(args[name]+".ogg");
            File lyr = new File(args[name]+".txt");
            if(sng.exists() && lyr.exists())
            {

            }
        }
        catch (Exception|Error e){}

        final SongPlayer player = new SongPlayer();
        player.setSong(song);
        player.setSpeed(spee);
        player.play();
    }
}
