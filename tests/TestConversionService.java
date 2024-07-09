package JavaCertified.tests;

import JavaCertified.ConversionService;
import java.math.BigDecimal;
import java.math.BigInteger;

public class TestConversionService 
{
    public static void main(String[] args) 
    {
        System.out.println(ConversionService.fluidOunces(1.1f));
        System.out.println(ConversionService.gallons(2.2f));
        System.out.println(ConversionService.grams(new BigInteger("30")));
        System.out.println(ConversionService.milliliters(40));
        System.out.println(ConversionService.ounces(new BigDecimal(50)));
        System.out.println(ConversionService.pints(6.6f));
        System.out.println(ConversionService.pounds(new BigDecimal(7.7)));
        // can you figure out why these do not compile
        ConversionService.fluidOunces( (float)1.1 ); // all values with decimal dot are double by default
        ConversionService.grams( new BigInteger(String.valueOf((int)30L)));
        ConversionService.milliliters( (int)4.0 );
        short grams = (short)ConversionService.grams(new BigInteger("30")).intValue();
        byte byteGrams = (byte)ConversionService.grams(new BigInteger("30")).intValue();
        // why do these still work even though the types are different
        System.out.println(grams);
        System.out.println(byteGrams);

        
        System.out.println("------------------------------------");
        double ounces = ConversionService.fluidOunces(1.1f);
        System.out.println(ounces);
        long milliliters = ConversionService.milliliters(40);
        System.out.println(milliliters);
        double decimalMilliliters = ConversionService.milliliters(40);
        System.out.println(decimalMilliliters);
        short s = 30;
        System.out.println(ConversionService.grams(new BigInteger(String.valueOf(s))));
        byte b = 4;
        System.out.println(ConversionService.milliliters(b));
        char z = 'z';
        System.out.println(ConversionService.milliliters(z));
        System.out.println(ConversionService.gallons(200));
        System.out.println(ConversionService.ounces(new BigDecimal(50.5f)));
        System.out.println(ConversionService.pints(6L));
        System.out.println(ConversionService.pounds(new BigDecimal(7L)));
        
        // compare these results. Can you tell why they are different?
        
        System.out.println("------------------------------------");
        float bigGallons = ConversionService.gallons(123456789123456789L);
        System.out.println(bigGallons);
        double bigGallons2 = 123456789123456789L * 0.2642;
        System.out.println(bigGallons2);
        
      
        System.out.println("------------------------------------");
        int bigGrams = ConversionService.grams(new BigInteger("1234567890")).intValue();
        System.out.println(bigGrams);
        long bigGrams2 = 1234567890L * 1000L;
        System.out.println(bigGrams2);
    }
}
