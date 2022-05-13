package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class CurrentTime {

    public static void main(String[] args) {
        System.out.println("Current time is: " + System.currentTimeMillis());
        System.out.println("Current nano time is: " + System.nanoTime());

        //TODO -> How does %d differ to %tc  %n....
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());

        dateInParticularFormat();

        dateInGmt();
    }

    private static void dateInGmt() {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT`")));
        String currentTime = sdf.format(System.currentTimeMillis());

        System.out.println("Jimmy, the time is: " + currentTime);
    }

    private static void dateInParticularFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        sdf.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
        String currentTimeInSpecificFormat = sdf.format(System.currentTimeMillis());

        System.out.println("Current time in specific format is: " + currentTimeInSpecificFormat);
    }

}
