/** Program: The BMI class
* File: Exercise10_2.java
* Summary:A BMI with the 
* specified name, age, weight, feet, and inches.
* Author: Charles Maple III
* Date: July 16, 2016 
**/
public class Exercise10_2 
{
	public static void main(String[] args)
	{
		BMI c = new BMI("Charles", 28, 180, 6, 2);
		System.out.printf("Name: %s Age: %d Weight: %.2f Feet: %.2f Inches: %.2f\n", c.getName(), 
				c.getAge(), c.getWeight(), c.getFeet(), c.getInches());
	}
}
