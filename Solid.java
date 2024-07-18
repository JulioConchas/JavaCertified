package JavaCertified;

/*
 * 07/17/2024 Julio Conchas Lab 09 Inheritance
 */
public class Solid extends Good
{
    private double width;
    private double length;
    // CONSTRUCTORS
    public Solid(String name, int modelNumber, double height, UnitOfMeasureType unitOfMeasure, boolean flammable, double weightPerUnitOfMeasure, double width, double length)
    {
        super(name, modelNumber, height, unitOfMeasure, flammable, weightPerUnitOfMeasure);
        this.width = width;
        this.length = length;
    }
    // GETTERS
    public double getWidth(){ return width; }
    public double getLength(){ return length; }
    // SETTERS
    public void setWidth(double width){ this.width = width; }
    public void setLength(double length){ this.length = length; }
    // METHODS 
    public double volume()
    {
        return width * length * getHeight();
    }
    public String toString()
    {
        return super.toString() + " that is " + volume() + " " + getUnitOfMeasure() + " in size";
    }
}
