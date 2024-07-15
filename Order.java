package JavaCertified;
/*
 * 06/27/2024 Julio Conchas Lab01 Creating Classes
 * 07/03/2024 Julio Conchas Lab3 Static
 * 07/15/2024 Julio Conchas lab06 Syntax
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
    public double computeTotal()
    {
        double orderTotal = this.orderAmount;
        switch (jobSize())
        {
            case 'M':
                orderTotal -= 0.01;
            case 'L':
                orderTotal -= 0.02;
            case 'X':
                orderTotal -= 0.03;
        }
        if ( this.orderAmount < 1500 )
            orderTotal += computeTax();

        return orderTotal;
    }
    public char jobSize()
    {
        char classification;

        if ( this.quantity <= 25 )
        {
            classification = 'S';
        }
        else if ( this.quantity >= 26 && this.quantity <= 75 )
        {
            classification = 'M';
        }
        else if ( this.quantity >= 76 && this.quantity <= 150 )
        {
            classification = 'L';
        }
        else
        {
            classification = 'X';
        }
        return classification;
    }

    public String toString()
    {
        return quantity + " ea. " + product + " for " + customer;
    }
    
}
