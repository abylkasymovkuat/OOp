package Task_2;

public class Sphere extends  GeoObject{

    public Sphere(){};
    public Sphere(double bottomValue) {
        super(bottomValue);
    }

    @Override
    public double calcArea() {
        return 4*Math.PI*Math.pow(bottomValue, 2);
    }

    @Override
    public double calcVolume() {
        return 1/3*bottomValue*calcArea();
    }
}
