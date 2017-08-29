import java.util.Scanner;

public class Maine {
    public static void main (String args[])
    {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the princiapal ");
        System.out.println("Enter the rate");
        System.out.println("Enter the time");
        System.out.println("Enter the number compounds per year");
        CalcInterest calcInterest = new CalcInterest(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(), sc.nextInt());
        System.out.print( calcInterest.getBalance());
    }
}
