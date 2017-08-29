public class SquareCalc {
    private double a;
    public SquareCalc( double a)
    {
        this.a = a;
    }

    public double getPer()
    {
     return a*4;
    }
    public double getArea()
    {
        return Math.pow(a,2);
    }
    public double getDiag()
    {
        return a* Math.sqrt(2);
    }
}
