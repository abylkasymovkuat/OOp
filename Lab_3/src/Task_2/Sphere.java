package Task_2;

public class Sphere extends  GeoObject{

    private double radius;
    public Sphere(){};
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return 4*Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double calcVolume() {
        return 1/3*radius*calcArea();
    }
}
