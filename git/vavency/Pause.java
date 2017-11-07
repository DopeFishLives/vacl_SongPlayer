package git.vavency;

import java.util.concurrent.TimeUnit;

public final class Pause //Honestly this class is redundant.
{
    public Pause(int milliseconds)
    {
        try //hacko
        {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        }
        catch (InterruptedException e) {}
    }
}