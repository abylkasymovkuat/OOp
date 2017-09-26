package Task_2;

public class Cylinder extends GeoObject {
    private double bottomRadius, height;
    public Cylinder(){};
    public Cylinder(double bottomRadius, double height)
    {
        this.bottomRadius = bottomRadius;
        this.height = height;
    }

    @Override
    public double calcArea() {
       return Math.PI*Math.pow(bottomRadius,2);
    }

    @Override
    public double calcVolume() {
        return calcArea()*height;
    }


}
