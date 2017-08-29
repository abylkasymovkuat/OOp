public class CalcRoots {
    double [] arr;
    double x1, x2, d;
    public CalcRoots( double[] arr)
    {
        this.arr = arr;
        d = Math.pow((Math.pow( arr[1], 2) - 4 * arr[0] * arr[2] ), 1/2);
    }
    public void getRoots()
    {
        if ( d> 0)
        {
            System.out.print((-d - arr[1])/2* arr[0] + " ");
            System.out.print((d - arr[1])/2* arr[0]);
        }
        if ( d<0)
        {
            System.out.println("There is no roots for your numbers");
        }
        if ( d == 0)
        {
            System.out.println(arr[1]/2* arr[0]);
        }
    }


}
