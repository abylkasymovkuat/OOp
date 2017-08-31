public class Maine {
    public static void main(String args[])
    {
     Time time = new Time(14,23,22);
     System.out.println(time.toStandard());
        System.out.println(time.toUniversal());
        Time time2 = new Time(4,23,22);
        Time.add(time2);
    }
}
