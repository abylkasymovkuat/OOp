package com.first;

public class Temperature {
    private double temp;
    private char scale;


    public Temperature(char scale, double temp)
    {
        this.scale = scale;
        this.temp = temp;
    }
    public Temperature()
    {
        this.scale = 'C';
        this.temp = 0;
    }
    public Temperature(double temp)
    {
        this.temp = temp;
        this.scale = 'C';
    }
    public  Temperature( char scale)
    {
        this.scale = scale;
        this.temp = 0;
    }
    public double getCelsiusTemp()
    {
        return (scale == 'C') ? temp : (temp-32)*5/9;
    }
    public double getFahrenheit()
    {
        return  (scale == 'F') ? temp : (9/5 *temp + 32);
    }
    public void setTemp( double temp)
    {
        this.temp = temp;
    }
    public void setScale(char scale)
    {
        this.scale = scale;
    }
    public void setSaT(char scale, double temp)
    {
        this.scale = scale;
        this.temp = temp;
    }
    public char getScale()
    {
        return  scale;
    }
}
