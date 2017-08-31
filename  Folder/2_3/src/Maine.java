import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;
import java.util.Scanner;

public class Maine {


    public static void main(String args[]) {
        boolean stop = false;
        Data data = new Data();
        Analyzer analyzer = new Analyzer(data);
        Scanner scanner = new Scanner(System.in);

        while (!stop) {

            analyzer.setValues(scanner.nextDouble());
            System.out.println(data.getAverage());
            System.out.println(data.getMax());

        }



    }


}
