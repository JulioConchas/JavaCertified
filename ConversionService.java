package JavaCertified;

import java.math.BigDecimal;
import java.math.BigInteger;

public class ConversionService 
{
    /**
     * Weight conversion rates
     */
    // conversion rate for 1 kilogram to pounds
    public static BigDecimal kilogramToPounds = new BigDecimal(2.2046);
    // conversion rate for 1 kilogram to grams
    public static BigInteger kilogramToGrams = new BigInteger("1000");
    // conversion rate for 1 kilogram to weight ounces 
    public static BigDecimal kilogramToOunces = new BigDecimal(35.274);

    /**
     * volume conversion rates
     */
    // conversion rate for 1 liter to fluid ounces 
    public static float literToFluidOunce = 33.814F;
    // conversion rate for 1 liter to gallons 
    public static float literToGallon = 0.2642F;
    // conversion rate for 1 liter to pints
    public static float literToPints = 2.1134F;
    // conversion rate for 1 litter to milliliters
    public static short literToMilliliters = 1_000;

    public static BigDecimal pounds (BigDecimal kilograms)
    {
        return kilograms.multiply(kilogramToPounds);
    }
    public static BigInteger grams (BigInteger kilograms)
    {
        return kilograms.multiply(kilogramToGrams);
    }
    public static BigDecimal ounces (BigDecimal kilograms)
    {
        return kilograms.multiply(kilogramToOunces);
    }
    public static float fluidOunces (float liters)
    {
        return liters * literToFluidOunce;
    }

    public static float gallons (float liters)
    {
        return liters * literToGallon;
    }
    public static float pints (float liters)
    {
        return liters * literToPints;
    }
    public static int milliliters (int liters)
    {
        return liters * literToMilliliters;
    }
    public static double[][] allKgToPounds(double... kilogramValues)
    {
        double[][] converion = new double[kilogramValues.length][2];

        for( int i = 0; i < kilogramValues.length;i++ )
        {
            converion[i][0] = kilogramValues[i];
            converion[i][1] = kilogramValues[i] * 2.2046;
        }
        return converion;

    }
    
}
