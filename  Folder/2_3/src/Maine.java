import java.util.Scanner;
public class Maine {

    public static void main(String[] args) {
        Data data = new Data();
        Scanner  scan = new Scanner(System.in);
        while(true) {
            String r = scan.nextLine();
            if(r.equals("q"))
            {
                break;
            }
            double value = Double.parseDouble(r);
            data.addValue(value);
        }
        System.out.println(data.getAverage() + " "+ data.getMax());

    }
}