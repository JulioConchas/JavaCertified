package JavaCertified;

/*
 * 08/07/2024 Julio Conchas Lab 17 Exceptions
 */

public class HolidayOrdersNotAllowedException extends Exception 
{
    public HolidayOrdersNotAllowedException(MyDate date)
    {
        super("Orders are not allowed to be created on: " + date);
    }
    public HolidayOrdersNotAllowedException(String message){
        super(message);
    }
}
