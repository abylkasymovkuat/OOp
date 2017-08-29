import java.util.Scanner;

public class Maine {
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        SquareCalc squareCalc = new SquareCalc(sc.nextDouble());
        System.out.println(squareCalc.getArea());
        System.out.println(squareCalc.getDiag());
        System.out.println(squareCalc.getPer());
    }
}
