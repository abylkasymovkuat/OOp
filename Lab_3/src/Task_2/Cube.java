package Task_2;

public class Cube extends GeoObject
{
    private double edge;
    public Cube(){super();}
    public  Cube(double edge)
    {
        this.edge = edge;
    }

    public double calcArea()
    {
        return Math.pow(edge, 2);
    }
    public double calcVolume()
    {
        return calcArea()*edge;
    }
}
