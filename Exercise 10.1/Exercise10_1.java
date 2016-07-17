/** Program: The Time Class
* File: Exercise10_1.java
* Summary:a test program that creates 
* two Time objects (using new Time() 
* and newTime(555550000)) and displays 
* their hour, minute, and second in the 
* format hour:minute:second.
* Author: Charles Maple III
* Date: July 14, 2016 
**/

public class Exercise10_1 
{
	public static void main(String[] args)
	{
		Time time = new Time (555550000);
		System.out.println(time.hour + ":" + time.second);
	}
}
