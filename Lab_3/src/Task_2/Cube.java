package Task_2;

public class Cube extends GeoObject
{
    public Cube(){};
    public  Cube(double bottomValue, double height)
    {
        super(bottomValue, height);
    }

    public double calcArea()
    {
        return Math.pow(bottomValue, 2);
    }
    public double calcVolume()
    {
        return calcArea()*height;
    }
}
