package JavaCertified;

/*
 * 07/17/2024 Julio Conchas Lab 09 Inheritance
 */

public class Liquid extends Good
{

    private double radius;

    // CONSTRUCTORS
    public Liquid(String name, int modelNumber, double height, UnitOfMeasureType unitOfMeasure, boolean flammable, double weightPerUnitOfMeasure, double radius)
    {
        super(name, modelNumber, height, unitOfMeasure, flammable, weightPerUnitOfMeasure);
        this.radius = radius;
    }
    // GETTERS
    public double getRadius(){ return radius; }
    // SETTERS
    public void setRadius(double radius){ this.radius = radius; }
    // METHODS 
    public double volume()
    {
        return Math.PI * radius * radius * getHeight();
    }
    public String toString()
    {
        return super.toString() + " ( liquid ) " + volume() + " " + getUnitOfMeasure();
    }
}
