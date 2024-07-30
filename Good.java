package JavaCertified;

/*
 * 07/17/2024 Julio Conchas Lab 09 Inheritance
 * 07/30/2024 Julio Conchas Lab 11 Abstract Interfaces 
 */

public abstract class Good implements Product
{
    public enum UnitOfMeasureType { LITER, GALLON, CUBIC_METER, CUBIC_FEET };

    private String name;
    private int modelNumber;
    private double height;
    private UnitOfMeasureType unitOfMeasure;
    private boolean flammable = true;
    private double weightPerUnitOfMeasure;

    // CONSTRUCTORS
    public Good(){}
    public Good(String name, int modelNumber, double height, UnitOfMeasureType unitOfMeasure, boolean flammable, double weightPerUnitOfMeasure)
    {
        this.name = name;
        this.modelNumber = modelNumber;
        this.height = height;
        this.unitOfMeasure = unitOfMeasure;
        this.flammable = flammable;
        this.weightPerUnitOfMeasure = weightPerUnitOfMeasure;
    }

    // GETTERS
    public String getName(){ return name; }
    public int getModelNumber(){ return modelNumber; }
    public double getHeight(){ return height; }
    public UnitOfMeasureType getUnitOfMeasure(){ return unitOfMeasure; }
    public double getWeightPerUnitOfMeasure(){ return weightPerUnitOfMeasure; }
    // SETTERS
    public void setName(String name){ this.name = name; }
    public void setModelNumber(int modelNumber){ this.modelNumber = modelNumber; }
    public void setHeight(double height){ this.height = height; }
    public void setUnitOfMeasure(UnitOfMeasureType unitOfMeasure){ this.unitOfMeasure = unitOfMeasure; }
    public void setFlammable(boolean flammable){ this.flammable = flammable; }
    public void setWeightPerUnitOfMeasure(double weightPerUnitOfMeasure){ this.weightPerUnitOfMeasure = weightPerUnitOfMeasure; }
    // is METHODS
    public boolean isFlammable(){ return flammable; }

    // METHODS 
    public abstract double volume();
    public double weight(){ return volume() * weightPerUnitOfMeasure; }
    public final boolean canShipViaPostOffice()
    {
        if ( !this.isFlammable() && this.weight() < 200 ) 
            return true;
        return false;
    }
    public String toString()
    {
        return name + "-" + modelNumber;
    }
   

}
