package JavaCertified.tests;
/*
 * 07/15/2024 Julio Conchas Lab08 Encapsulation 
 * 07/23/2024 Julio Conchas Lab10 Polymorphism 
 * 08/01/2024 Julio Conchas Lab 14 Arrays
 */

import JavaCertified.MyDate;

public class TestMyDate 
{
    public static void main(String[] args)
    {
        MyDate date1 = new MyDate(11,11,1918);

        MyDate date2 = new MyDate();
        date2.setDay(11);
        date2.setMonth(11);
        date2.setYear(1918);

        MyDate date3 = new MyDate();
        date3.setDate(4,21,1968);

        MyDate date4 = new MyDate();

        String str1 = date1.toString();
        String str2 = date2.toString();
        String str3 = date3.toString();
        String str4 = date4.toString();

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        MyDate.leapYears();

        // Testing queals() method
        MyDate newYear = new MyDate(1,1,2009);
        MyDate fiscalStart = new MyDate(1,1,2009);

        if( newYear.equals(fiscalStart) )
        {
            System.out.println("These two dates are equal");
        }
        else
        {
            System.out.println("These two dates are not equal");
        }

        // testing Holidays
        MyDate.listHolidays();
    }
    
}
