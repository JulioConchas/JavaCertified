package JavaCertified;
/*
 * 06/27/2024 Julio Conchas Lab01 Creating Classes
 * 07/03/2023 Julio Conchas Lab3 Static
 * 07/15/2024 Julio Conchas lab06 Syntax
 * 07/15/2024 Julio Conchas Lab08 Encapsulation 
 * 07/29/2024 Julio Conchas Lab10 Polymorphism 
 */
public class MyDate 
{
    private byte day;
    private byte month;
    private short year;
    
    /*
     * This initialization block also help prevent 
     * crete a date with not valid data 
     * for example day = 0, month higher that 31 or year higher that 12
     */
    {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public MyDate(){}
    public MyDate(int month, int day, int year)
    {   
        if ( valid(day, month, year) )
        this.month = (byte) month;
        this.day = (byte) day;
        this.year = (short) year;
    }
    /*
     * GETTERS
     */
    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }
    /*
     * SETTERS
     */
    public void setDay(int day)
    {
        if ( valid(day, this.month, this.year) )
            this.day = (byte) day;
    }
    public void setMonth(int month)
    {
        if ( valid(this.day, month, this.year) )
        this.month = (byte) month;
    }
    public void setYear(int year)
    {
        if ( valid(this.day, this.month, year) )
        this.year = (short) year;
    }
    public void setDate(int month, int day, int year)
    {
        if ( valid(day, month, year) )
        this.month = (byte) month;
        this.day = (byte) day;
        this.year = (short) year;
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
    @Override
    public boolean equals(Object o)
    {
        if ( o instanceof MyDate ) 
        {
            MyDate d = (MyDate)o;
            if ( ( d.day == day ) && ( d.month == month ) && ( d.year == year ))
                return true;  
        }
        return false;
    }
    public String toString()
    {
        return month + "/" + day + "/" + year;
    }
    /*
     * PRIVATE
     */
    private boolean valid( int day, int month, int year )
    {
        if ( day > 31 || day < 1 || month > 12 || month < 1)
            System.out.println("Attempting to create a non-valid date : " + month + "/" + day + "/" + month);
        switch ( month )
        {
            case 4:
            case 6:
            case 9:
            case 11: return ( day <= 30 );
            case 2: return day <= 28 || ( day == 29 && year % 4 == 0 );
        }
        return true;
    }
    
}
