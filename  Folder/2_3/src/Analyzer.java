public class Analyzer {
    private  Data data;
    public Analyzer(Data data)
    {
        this.data = data;
    }
    public void setValues(double num)
    {
        if ((num > data.getMax()) )data.setMax(num);
        data.setCounter( data.getCounter()+1);
        data.setAverage((data.getAverage() * (data.getCounter()-1)+ num)/data.getCounter());
    }
}
