

import java.util.Date;

public class Transaction 
{
    private Date Date; 
    private char Type;

    private double Amount;
    private double Balance;
    private String Description;

    public Transaction(char type, double amount, double balance, String description) 
    {
        Type = type;
        Amount = amount;
        Balance = balance;
        Description = description;
        Date = new Date();
    }

    public Date getDate() 
    {
        return Date;
    }

    public char getType() 
    {
        return Type;
    }

    public double getAmount() 
    {
        return Amount;
    }

    public double getBalance()
    {
        return Balance;
    }

    public String getDescription() 
    {
        return Description;
    }

    @Override
    public String toString() 
    {
        return "Type: " + Type + " Date: " + Date + "Description: " + Description +
                "Amount: " + Amount + " Balance: " + Balance + "\n";
    }
}