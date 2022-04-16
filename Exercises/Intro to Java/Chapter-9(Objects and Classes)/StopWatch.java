/**
 * Help class for Q9.12
 */

import java.util.Date;

public class StopWatch {
    private long startTime, endTime;
    private static Date date = new Date();
    
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = date.getTime();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
