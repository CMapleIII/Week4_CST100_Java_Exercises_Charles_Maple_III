/** Program: The Tax class
* File: Exercise10_8.java
* Summary:test program that uses the 
* Tax class to print the 2001 and 2009 
* tax tables for taxable income from 
* $50,000 to $60,000 with intervals of 
* $1,000 for all four statuses.
* Author: Charles Maple III
* Date: July 16, 2016 
**/
public class Exercise10_8 
{
	private static int[][] brackets;
	private static double[] rates;

	public static void main(String[] args)
	{
		brackets = new int[][]
				{
					{8350, 33950, 82250, 171550, 372950},
					{16700, 67900, 137050, 208850, 372950},
					{8350, 33950, 68525, 104425, 186475},
					{11950, 45500, 117450, 190200,372950}};
					
		rates = new double[] {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		
		String s1 = "Taxable Income";
		String s2 = "Single";
		String s3 = "Married Joint";
		String s4 = "Married Seperate";
		String s5 = "Head of Household";
		
		System.out.printf("%-20s%-12s%-4s%21s%16s\n", s1, s2, s3, s4, s5);
		for(int i = 50000; i <= 60000; i += 1000)
		{
			System.out.printf("%4d%19.0f%16.0f%16.0f%20.0f\n", i, 
					new Tax(Tax.Single_Filer, brackets, rates, i).getTax(),
					new Tax(Tax.Married_Jointly_or_Qualifying_Widow, brackets, rates, i).getTax(),
					new Tax(Tax.Married_Seperatly, brackets, rates, i).getTax(),
					new Tax(Tax.Head_of_HouseHold, brackets, rates, i).getTax());
		}
	}
}
