public class Data {

    private double average;
    private double max;
    private int counter;
    public Data()
    {
        average = 0;
        max = 0;
        counter = 0;
    }



    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public double getMax()
    {
        return  max;
    }
    public double getAverage() {
        if (counter != 0)
            return average;
        else return 0;
    }


}

