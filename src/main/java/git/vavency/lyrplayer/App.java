package git.vavency.lyrplayer;

import java.util.*;
import java.io.File;

public class App {

    public static void main(String[] args)
    {
        float spee = (float) 1;
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


        try // Oh boy, lets begin.
        {
            //int name=0; //index of song name
            String sng_varnme[] = {"songspeed=", "songname="};

            for(int i=0; i<args.length;i++) // Some one will want to to add speed.
            {
                if(args[i].regionMatches(false, 0, sng_varnme[0], 0, sng_varnme[0].length()))
                {
                    try { spee = Float.parseFloat(args[i].replace(sng_varnme[0], "")); } // Fail and see if it worked,
                    catch(Exception|Error e) {} // Just let it pass.
                }
            }
            /*
            File sng = new File(args[name]+".ogg");     //It's to check if it exists.
            File lyr = new File(args[name]+".txt");     //To check if it exists, the to read the file
            if(sng.exists() && lyr.exists())                     // Existential crisis.
            {
                List newLyr = null;                              //I need a new list, not you.
                Scanner scam = new Scanner(lyr);                 // New nigerian prince SCAM.

                while(scam.hasNextLine())                        // We don't want to crash everything, am I right?
                    newLyr.add(scam.nextLine());

                scam.close();                                    // Nice and tidy
                song.setTitle(args[name]);                       //Setting a new title.
                song.setLyrics(newLyr);                          //REPLACE OLD WITH THE NEW. YEAH!!!
            } // Fin*/
        }
        catch (Exception|Error e){} // Shh, we don't want for the user to see that we're burning and crashed in to WTC on 9/11.

        final SongPlayer player = new SongPlayer();
        player.setSong(song);
        player.setSpeed(spee);
        player.play();
    }
}
