public class CalcInterest {

    private double principal;
    private double rate;
    private double time;
    private int n;
    private double amount;

    public CalcInterest( double principal, double rate, double time, int n )
    {
        this.principal = principal;
        this.time = time;
        this.rate = rate;
        this.n = n;
    }
    public double getBalance()
    {
        return principal * ( Math.pow((1+ rate/n), n*time));
    }
}
