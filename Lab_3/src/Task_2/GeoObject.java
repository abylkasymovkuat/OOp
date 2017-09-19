package Task_2;

public abstract class GeoObject {
    protected double bottomValue, height;
    public abstract double calcArea();
    public abstract double calcVolume();

    public  GeoObject(double bottomValue, double height){
        this.bottomValue = bottomValue;
        this.height = height;
    }
    public GeoObject(){}
    public GeoObject( double bottomValue)
    {
        this.bottomValue = bottomValue;
    }
}
