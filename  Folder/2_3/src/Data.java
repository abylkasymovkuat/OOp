public class Data {
    private double value;
    private double max;
    private int cnt = 0;

    public Data()
    {

    }
    public void addValue(double value)
    {
        this.value += value;
        cnt++;
        if (cnt == 1)
        {
            max = value;
        }
        else
        {
            if(value > max)
            {
                max = value;
            }
        }
    }
    public double getAverage()
    {
        return (value/cnt);}
    public double getMax()
    {
        return max;
    }
}