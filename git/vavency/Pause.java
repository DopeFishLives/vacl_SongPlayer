package git.vavency;

import java.util.concurrent.TimeUnit;

public final class Pause {

    private Pause() {
        throw new UnsupportedOperationException("Object creation is prohibited.");
    }

    /**
     * Pauses program execution for a specified amount of milliseconds.
     * @param milliseconds - pause duration
     */
    public static void duration(int milliseconds)
    {
        try
        {
            TimeUnit.MILLISECONDS.sleep(milliseconds);
        }
        catch (InterruptedException e)
        {
            throw new RuntimeException("Pause was interrupted.", e);
        }
    }

}