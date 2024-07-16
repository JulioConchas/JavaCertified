package JavaCertified.tests;

/*
 * 07/15/2024 Julio Conchas Lab07 Parameter Passing
 * 07/15/2024 Julio Conchas Lab08 Encapsulation 
 */

import JavaCertified.MyDate;

public class PassByExperiment 
{
    public static void passObject(MyDate date)
    {
        date.setYear(2009);
    }
    public static void passPrimitive(int date)
    {
        date = 2010;
    }
    public static void passString(String strDate)
    {
        int yearSlash = strDate.lastIndexOf('/');
        strDate = strDate.substring(0,yearSlash+1);
        strDate += "2012";
        System.out.println("New date string: " + strDate);
    }
    public static void passString(StringBuilder strDate)
    {
        int yearSlash = strDate.lastIndexOf("/");
        strDate.delete(yearSlash+1,strDate.length());
        strDate.append("2012");
        System.out.println("New date string: " + strDate);
    }
    public static void main(String[] args)
    {
        MyDate date = new MyDate(1,20,2008);
        System.out.println("Before passing an object " + date);
        passObject(date);
        System.out.println("After passing an object " + date);

        System.out.println("Before passing a primitive " + date.getYear());
        passPrimitive(date.getYear());
        System.out.println("After passing a primitive " + date.getYear());

        String strDate = date.toString();
        System.out.println("Before passing a String " + strDate);
        passString(strDate);
        System.out.println("After passing a String " + strDate);

        StringBuilder strbDate = new StringBuilder(strDate);
        System.out.println("Before passing a StringBuilder " + strbDate.toString());
        passString(strbDate);
        System.out.println("After passing a StringBuilder " + strbDate.toString());

    }
}
