/** Program: Find the smallest Element
* File: Exercise7_9.java
* Summary: Prompts the user to enter ten 
* numbers, invokes a method to return the 
* minimum value, and displays the minimum 
* value.
* Author: Charles Maple III
* Date: July 15, 2016 
**/

import java.util.Scanner;

public class Exercise7_9 
{
	private static Scanner input;
	private static double[] numbers;

	public static void main(String[] args)
	{
		System.out.print("Enter ten numbers: ");
		input = new Scanner(System.in);
		numbers = new double[10];
		
		for (int i = 0; i < numbers.length; i++)
		{
		numbers[i] = input.nextDouble();
		}
	System.out.println("The minumum number is: " + min(numbers));
	}
public static double min(double[] array)
{
	double min = array[0];
	
	for(int i = 1; i < array.length; i++)
	{
		if(min > array[i])
		{
			min = array[i];
		}
	}
	return min;
	}
		
}
