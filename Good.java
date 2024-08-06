package JavaCertified;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 07/17/2024 Julio Conchas Lab 09 Inheritance
 * 07/30/2024 Julio Conchas Lab 11 Abstract Interfaces 
 * 08/05/2024 Julio Conchas Lab 15 Collections
 */

 import java.util.List;
 import java.util.ArrayList;
 import java.util.Set;
 import java.util.HashSet;
 import java.util.Iterator;

public abstract class Good implements Product
{
    public enum UnitOfMeasureType { LITER, GALLON, CUBIC_METER, CUBIC_FEET };

    private String name;
    private int modelNumber;
    private double height;
    private UnitOfMeasureType unitOfMeasure;
    private boolean flammable = true;
    private double weightPerUnitOfMeasure;
    //private static List catalog;
    private static Set catalog;

    static 
    {
        Liquid glue = new Liquid("Acme Glue", 2334, 4, UnitOfMeasureType.LITER, false, 15, 6);
        Liquid paint = new Liquid("Acme Invisible Pain", 2490, 0.65, UnitOfMeasureType.GALLON, true, 0.70, 12);
        Solid anvil = new Solid("Acme Anvil", 1668, 0.3, UnitOfMeasureType.CUBIC_METER, false, 500, 0.25, 0.3);
        Solid safe = new Solid("Acme Safe", 1672, 1.0, UnitOfMeasureType.CUBIC_METER, false, 300, 0.5, 0.5);
        Solid balloon = new Solid("Acme Balloon", 1401, 15, UnitOfMeasureType.CUBIC_FEET, false, 10, 5, 5);
        Solid postol = new Solid("Acme Disintegrating pistol", 1587, 0.1, UnitOfMeasureType.CUBIC_FEET, false, 1, 0.5, 2);
        Liquid nitro = new Liquid("Acme Nitroglycerin", 4289, 1.0, UnitOfMeasureType.CUBIC_FEET, true, 1.5, 0.25);
        Liquid oil = new Liquid("Acme Oil", 4274, 1.0, UnitOfMeasureType.CUBIC_METER, true, 1.5, 0.25);
        
        //catalog = new ArrayList<>();
        catalog = new HashSet();
        catalog.add(glue);
        catalog.add(paint);
        catalog.add(anvil);
        catalog.add(safe);
        catalog.add(balloon);
        catalog.add(postol);
        catalog.add(nitro);
        catalog.add(oil);
    }

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
    //public static List getCatalog(){ return catalog; }
    public static Set getCatalog(){ return catalog; }
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
    public static Set flammablesList()
    {
        Set flammables = new HashSet();
        Iterator i = Good.getCatalog().iterator();
        while( i.hasNext() )
        {
            Good x = (Good) i.next();
            if( x.isFlammable() )
                flammables.add(x);
        }
        return flammables;
    }
    public String toString()
    {
        return name + "-" + modelNumber;
    }
   

}
