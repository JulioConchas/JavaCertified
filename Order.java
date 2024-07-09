package JavaCertified;
/*
 * 06/27/2024 Julio Conchas Lab01 Creating Classes
 * 07/03/2023 Julio Conchas Lab3 Static
 */

import javax.xml.crypto.KeySelector.Purpose;

import JavaCertified.MyDate;

public class Order 
{
    MyDate orderDate;
    double orderAmount = 0.00;
    String customer;
    String product;
    int quantity;

    static
    {
        taxRate = 0.05;
    }

    public static double taxRate;

    public Order(String product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;
    }
    public Order(MyDate orderDate, double orderAmount, String customer,String product, int quantity )
    {
        this(product, quantity);
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.customer = customer;
    }
    public Order(MyDate orderDate, double orderAmount, String customer)
    {
        this("Anvil", 1);
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.customer = customer;
    }

    public static void setTaxRate( double newRate )
    {
        taxRate = newRate;
    }
    public static void computeTaxOn( double anAmount )
    {
        System.out.println("The tax for " + anAmount + " is: " + anAmount * Order.taxRate);
    }
    public double computeTax()
    {
        System.out.println("The tax for this order is: " + orderAmount * Order.taxRate);
        return orderAmount * Order.taxRate;
    }
    public String toString()
    {
        return quantity + " ea. " + product + " for " + customer;
    }
    
}
