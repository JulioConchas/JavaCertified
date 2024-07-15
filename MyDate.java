package JavaCertified;
/*
 * 06/27/2024 Julio Conchas Lab01 Creating Classes
 * 07/03/2023 Julio Conchas Lab3 Static
 * 07/15/2024 Julio Conchas lab06 Syntax
 */
public class MyDate 
{
    public int day;
    public int year;
    public int month;

    {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public MyDate(){}
    public MyDate(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public void setDate(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public static void leapYears()
    {
        // Lab answer
        for(int year = 1752;year <= 2020;year += 4)
        {
            if ( year % 100 != 0 || year % 400 == 0 )
            {
                System.out.println("The year " + year + " is leap year");
            }
        }

    }
    public String toString()
    {
        return month + "/" + day + "/" + year;
    }
}
