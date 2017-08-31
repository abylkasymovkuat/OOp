import java.util.ArrayList;
import java.util.List;

public class Time {
    private int hour, minute, second;
    public static List<Time> list;
    public Time ( int hour, int minute, int second)
    {
        list = new ArrayList<Time>();
        if (hour<24)
        this.hour = hour;
        if (minute <60)
        this.minute = minute;
        if (minute<60)
        this.second = second;
    }
    public static void add( Time time)
    {
        list.add(time);
    }
    public String toUniversal()
    {
       return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public String toStandard()
    {
        if ( hour >12)
        return String.format("%02d:%02d:%02d %s ", hour-12, minute, second, "PM");
        else
        return String.format("%02d:%02d:%02d %s ", hour, minute, second, "AM");

    }
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
