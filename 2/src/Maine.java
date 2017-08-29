import java.util.Scanner;

import static java.lang.Math.floor;

public class Maine {


    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        while (true){
            CalcGPA calcGPA = new CalcGPA(sc.nextDouble());
        System.out.println(calcGPA.getWord());
        }


    }
}

