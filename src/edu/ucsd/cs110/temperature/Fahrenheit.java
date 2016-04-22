package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float tmp = (super.getValue() -32)/(float)1.8 ;
        return new Fahrenheit(tmp);
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }


    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " F";
    }
}

