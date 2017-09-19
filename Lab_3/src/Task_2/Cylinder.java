package Task_2;

public class Cylinder extends GeoObject {

    public Cylinder(){};
    public Cylinder(double bottomValue, double height)
    {
        super(bottomValue, height);
    }

    @Override
    public double calcArea() {
       return Math.PI*Math.pow(bottomValue,2);
    }

    @Override
    public double calcVolume() {
        return calcArea()*height;
    }


}
