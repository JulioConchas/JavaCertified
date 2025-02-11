package JavaCertified.tests;

import javax.sound.midi.Soundbank;

import JavaCertified.Good;
import JavaCertified.Liquid;
import JavaCertified.Solid;
import JavaCertified.Good.UnitOfMeasureType;
import java.util.List;
import java.util.Collections;

public class TestGoods
{
    public static void main(String[] args)
    {
        Liquid glue = new Liquid("Acme Glue", 2334,4,UnitOfMeasureType.LITER, false, 15 ,6);
        Liquid paint = new Liquid("Acme Invisible Paint", 2490, 0.65, UnitOfMeasureType.GALLON, true, 0.70, 12);
        Solid anvil = new Solid("Acme Anvil", 1668, 0.3, UnitOfMeasureType.CUBIC_METER, false, 5000, 0.5, 0.5);

        System.out.println(glue);
        System.out.println(paint);
        System.out.println(anvil);

        System.out.println("The weight of " + glue + " is " + glue.weight());
        System.out.println("The weight of " + paint + " is " + paint.weight());
        System.out.println("The weight of " + anvil + " is " + anvil.weight());

        Good x = glue;
        System.out.println("Is " + x + " falamable? " + x.isFlammable());
        x = paint;
        System.out.println("Is " + x + " flammable? " + x.isFlammable());

        // BONUS

        System.out.println(glue + " can ship via Post office? " + glue.canShipViaPostOffice());
        System.out.println(paint + " can ship via Post office? " + paint.canShipViaPostOffice());
        System.out.println(anvil + " can ship via Post office? " + anvil.canShipViaPostOffice());

        System.out.println("#########################################################");
        System.out.println(Good.getCatalog());
        Good.getCatalog().remove("Acme Oil");
        System.out.println("#########################################################");
        System.out.println(Good.getCatalog());
        Solid toaster = new Solid("Acme Toaster", 1755, 0.75, UnitOfMeasureType.CUBIC_FEET, false, 1.0, 1.0, 1.0);
        Good.getCatalog().add(toaster);
        Good.getCatalog().add(toaster);
        System.out.println("#########################################################");
        System.out.println(Good.getCatalog());
        System.out.println("######################### flammables ################################");
        System.out.println(Good.flammablesList());
        System.out.println("######################### sort Catalog ################################");
        Collections.sort((List<Good>) Good.getCatalog());
        System.out.println(Good.getCatalog());
        System.out.println("######################### search ################################");

        Liquid searchGood = new Liquid("Acme Invisible Pain", 2490, 0.65, UnitOfMeasureType.GALLON, true, 0.70, 12);
        System.out.println("Good to seach : " + searchGood);
        int index = Collections.binarySearch(Good.getCatalog(), searchGood);
        if ( index >= 0 ) 
            System.out.println("Good found : " + Good.getCatalog().get(index));
        else 
            System.out.println(searchGood + " NOt Found");
        
    }
}