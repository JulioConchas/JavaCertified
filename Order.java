package JavaCertified;
/*
 * 06/27/2024 Julio Conchas Lab01 Creating Classes
 * 07/03/2024 Julio Conchas Lab3 Static
 * 07/15/2024 Julio Conchas lab06 Syntax
 * 07/15/2024 Julio Conchas Lab08 Encapsulation 
 * 07/23/2024 Julio Conchas Lab10 Polymorphism 
 * 07/30/2024 Julio Conchas Lab 11 Abstract Interfaces 
 * 07/31/2024 Julio Conchas Lab 12 Lambda
 */

import javax.xml.crypto.KeySelector.Purpose;

import JavaCertified.MyDate;
import JavaCertified.Good;
import JavaCertified.Rushable;

public class Order 
{
    private MyDate orderDate;
    private double orderAmount = 0.00;
    private String customer;
    private Product product;
    private int quantity;

    private static Rushable rushable;

    static
    {
        taxRate = 0.05;
    }

    public static double taxRate;

    public Order(Product product, int quantity)
    {
        this.product = product;
        this.quantity = quantity;
    }
    public Order(MyDate orderDate, double orderAmount, String customer,Product product, int quantity )
    {
        this(product, quantity);
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.customer = customer;
    }
    // public Order(MyDate orderDate, double orderAmount, String customer)
    // {
    //     this("Anvil", 1);
    //     this.orderDate = orderDate;
    //     this.orderAmount = orderAmount;
    //     this.customer = customer;
    // }
    /*
     * GETTERS
     */
    public MyDate getOrderDate()
    {
        return orderDate;
    }
    public double getOrderAmount()
    {
        return orderAmount;
    }
    public String getCustomer()
    {
        return customer;
    }
    public Product getProducts()
    {
        return product;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public static Rushable getRushable()
    {
        return rushable;
    }
    /*
     * SETTERS
     */
    public void setOrderDate(MyDate orderDate)
    {
        this.orderDate = orderDate;
    }
    public void setOrderAmount(double orderAmount)
    {
        if (!isPositive(quantity)) 
            System.out.println("Only positive Amount please!");
        this.orderAmount = orderAmount;
    }
    public void setCustomer(String customer)
    {
        this.customer = customer;
    }
    public void setProducts(Good product)
    {
        this.product = product;
    }
    public void setQuantity(int quantity)
    {
        if (!isPositive(quantity)) 
            System.out.println("Only positive quantity please!");
        this.quantity = quantity;
    }
    public static void setRushable(Rushable rushable)
    {
        Order.rushable = rushable;
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
                orderTotal -= ( this.orderAmount * 0.01 ); // Lab answer
            case 'L':
                orderTotal -= ( this.orderAmount * 0.02 ); // Lab answer
            case 'X':
                orderTotal -= ( this.orderAmount * 0.03 ); // Lab answer
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
        // Lab answer
        else if ( this.quantity <= 75 )
        {
            classification = 'M';
        }
        // Lab answer
        else if ( this.quantity <= 150 )
        {
            classification = 'L';
        }
        else
        {
            classification = 'X';
        }
        return classification;
    }
    public boolean isPriorityOrder()
    {
        boolean priorityOrder = false;
        if( rushable != null )
        {
            priorityOrder = rushable.isRushable(orderDate, orderAmount);
        }
        return priorityOrder;
    }
    public String toString()
    {
        return quantity + " ea. " + product + " for " + customer;
    }
    /*
     * PRIVATE
     */
    private boolean isPositive(int n)
    {
        return (n > 0);
    }
    
}
