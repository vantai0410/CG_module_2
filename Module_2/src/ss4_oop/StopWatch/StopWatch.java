package ss4_oop.StopWatch;

import java.time.LocalDate;
import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime stopTime;

    public StopWatch() {
    }
    public void startTime(){
        startTime = LocalTime.now();
    }

}
