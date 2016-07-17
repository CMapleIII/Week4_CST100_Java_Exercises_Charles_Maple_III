/** Program: Financial Application: Find the Sales Amount
* File: Exercise5_39.java
* Summary:finds the minimum sales you 
* have to generate in order to make $30,000. 
* Author: Charles Maple III
* Date: July 14, 2016 
**/

import java.util.Scanner;

public class Exercise5_39 
{
	private static Scanner input;
	private static double commissionWanted;
	private static double sale;

	public static void main(String[] args)
	{
		input = new Scanner(System.in);
		
		System.out.print("Enter commission amount:\t");
		commissionWanted = input.nextDouble();
		
		if(commissionWanted <= 400)
		{
			sale = commissionWanted / 0.08;
		}
		else if(commissionWanted <= 900)
		{
			sale = (commissionWanted - 400) / 0.1 + 5000;
		}
		else
		{
			sale = (commissionWanted - 900) / 0.12 + 10000;
		}
		
		System.out.println("The sales you need to generate is " + sale);
	}
}
