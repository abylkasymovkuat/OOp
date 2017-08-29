import java.util.Scanner;

public class Maine {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double [] arr = new double[3];
        CalcRoots calcRoots;
        while(true)
          {
              for ( int i = 0 ; i<3; i++)
                {
                    arr[i] =sc.nextDouble();
                }
                calcRoots = new CalcRoots( arr);
                calcRoots.getRoots();

          }

}}
