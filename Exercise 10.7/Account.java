
import java.util.ArrayList;
import java.util.Date;

public class Account 
{
    protected String Name;
    protected int Id;
    protected double Balance;
    protected double tAnnualInterestRate;
    protected Date dateCreated;
    protected ArrayList<Transaction> Transactions;


    public Account() 
    {
        dateCreated = new Date();
        Transactions = new ArrayList<>();
    }

    public Account(int id, double balance) 
    {
        this();
        Id = id;
        Balance = balance;
    }

    public Account(String name, int id, double balance) 
    {
        this(id, balance);
        Name = name;

    }

    public int getId() 
    {
        return Id;
    }

    public void setId(int id) 
    {
        Id = id;
    }

    public double getBalance() 
    {
        return Balance;
    }

    public void setBalance(double balance) 
    {
        Balance = balance;
    }

    public double getAnnualInterestRate() 
    {
        return tAnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) 
    {
        tAnnualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() 
    {
        return dateCreated;
    }

    public double getMonthlyInterestRate() 
    {
        return Balance * (tAnnualInterestRate / 12) / 100;
    }

    public void withdraw(double amount) 
    {
        Transactions.add(new Transaction('W', amount, Balance, "withdraw"));
        Balance -= amount;
    }

    public void deposit(double amount) 
    {
        Transactions.add(new Transaction('D', amount, Balance, "deposit"));
        Balance += amount;
    }

    @Override
    public String toString() 
    {
        return "Account name: " + Name + "\n" + "Interest rate: " + tAnnualInterestRate + "\n" + Transactions;
    }

    public ArrayList<Transaction> getTransactions() 
    {
        return new ArrayList<>(Transactions);
    }

}