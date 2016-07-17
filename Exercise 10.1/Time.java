
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


public class Time 
{
	public long hour;
	public long minute;
	public long second;
	
	public Time()
	{
		long totalSeconds = System.currentTimeMillis() / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		this.hour = totalHours % 24;
		this.minute = totalMinutes % 60;
		this.second = totalSeconds % 60;
	}
	
	public Time(long hour, long minute, long second)
	{
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public Time(long elapsedTime)
	{
		long totalSeconds = elapsedTime / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		this.hour = totalHours % 24;
		this.minute = totalMinutes % 60;
		this.second = totalSeconds % 60;
	}
	
	public long getHour()
	{
		return hour;
	}
	
	public long getMinute()
	{
		return minute;
	}
	
	public long getSecond()
	{
		return second;
	}
}
