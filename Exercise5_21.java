/** Program: Financial application: compare loans with various interest rates
* File: Exercise5_21.java
* Summary:lets the user enter the loan amount 
* and loan period in number of years and displays 
* the monthly and total payments for each interest 
* rate starting from 5% to 8%, with an increment 
* of 1/8.
* Author: Charles Maple III
* Date: July 14, 2016 
**/

import java.util.Scanner;

public class Exercise5_21
{
	private static Scanner input;
	private static int numberofYears;
	private static double loanAmount;
	private static double monthlyInterestRate;
	private static double monthlyPayment;
	private static double totalPayment;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter loan amount:\t");
		loanAmount = input.nextDouble();
		
		System.out.print("Enter number of years:\t");
		numberofYears = input.nextInt();
		
		double annualInterestRate = 5.0;
		
		System.out.printf("%-8s%-18s%-18s\n", "Interest Rate\t", 
				"Monthly Payment", "Total Payment");
		
		while (annualInterestRate <= 8.0)
		{
			monthlyInterestRate = annualInterestRate / 1200;
			
			monthlyPayment = loanAmount * monthlyInterestRate 
					/ (1 - 1 / Math.pow(1 + monthlyInterestRate, numberofYears * 12));
			
			totalPayment = monthlyPayment * numberofYears * 12;
			
			System.out.printf("%-18.3f%-18.2f%-18.2f\n", annualInterestRate, monthlyPayment, totalPayment);
			
			annualInterestRate = annualInterestRate + 1.0 / 8;
		}
	}
}