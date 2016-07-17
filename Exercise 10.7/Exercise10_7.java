/** Program: ATM Machine
* File: Exercise10_7.java
* Summary:prompts the user to enter an id. If 
* the id is entered incorrectly, ask the user 
* to enter a correct id. Once an id is accepted, 
* the main menu is displayed as shown in the 
* sample run. You can enter a choice 1 for viewing 
* the current balance, 2 for withdrawing money, 3 
* for depositing money, and 4 for exiting the main 
* menu. Once you exit, the system will prompt for 
* an id again. Thus, once the system starts, it 
* will not stop.
* Author: Charles Maple III
* Date: July 16, 2016 
**/

import java.util.Scanner;

public class Exercise10_7 
{
	private static Scanner input;
	private static Scanner input2;

    public static void main(String[] args) 
    {

        input = new Scanner(System.in);
        Account[] accounts = new Account[10];

        for (int i = 0; i < accounts.length; i++) 
        {
            accounts[i] = new Account(i, 100);
        }

        int option = 0;
        int id = askForID(accounts);
        while (option != 4) 
        {
            Account user = getAccount(accounts, id);
            System.out.print( "Main menu\n" + "1: check balance\n" + "2: withdraw\n" +
                            "3: deposit\n" + "4: exit\n" + "Enter a choice: ");
            option = input.nextInt();
            switch (option) 
            {
                case 1:
                    System.out.println("The balance is $" + user.getBalance() + ".\n");
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    user.withdraw(input.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit: ");
                    user.deposit(input.nextDouble());
                    break;
                case 4:
                    System.out.println("Logged out.");
                    System.out.println("");
                    id = askForID(accounts);
                    option = 0;
                    break;
                    default:
                        System.out.println("Invalid input. Enter a number 1-4");
            }
        }
    }

    public static int askForID(Account[] accounts) 
    {
        input2 = new Scanner(System.in);

        int id = 0;
        boolean isValidID = false;

        while (!isValidID) {
            System.out.print("Enter an ID: ");
            id = input2.nextInt();

            if (!hasID(accounts, id)) {
                System.out.println("INVALID ID: Try again.");

            } else {
                isValidID = true;
            }
        }

        return id;
    }

    public static Account getAccount(Account[] accounts, int id) 
    {
        for (Account account : accounts) 
        {
            if (id == account.getId()) 
            {
                return account;
            }
        }
        return null;
    }
    public static boolean hasID(Account[] accounts, int id) 
    {
        for (Account account : accounts) 
        {
            if (id == account.getId()) 
            {
                return true;
            }
        }
        return false;
    }
}