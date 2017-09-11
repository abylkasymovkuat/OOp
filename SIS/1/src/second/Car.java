package second;

public class Car {
    private double fuef; //fuel efficiency
    private double fuam; // fuel amount

    public Car( double fuef)
    {
        this.fuef = fuef;
    }
    public void drive ( double distance)
    {
        if ( distance/fuef > fuam){}
        else
        fuam -= distance/fuef;
    }

    public double getGasInTank() {
        return fuam;
    }
    public void addGas(double fuam)
    {
        this.fuam += fuam;
    }
}
