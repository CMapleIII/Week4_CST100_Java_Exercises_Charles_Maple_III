/** Program: Implement the String class
* File: Exercise10_22.java
* Summary:The String class is provided in 
* the Java library. Provide your own 
* implementation for the following methods:
* 
* public MyString1(char[] chars);
* public char charAt(int index);
* public int length();
* public MyString1 substring(int begin, int end);
* public MyString1 toLowerCase();
* public boolean equals(MyString1 s);
* public static MyString1 valueOf(int i);
* 
* Author: Charles Maple III
* Date: July 16, 2016 
**/

public class Exercise10_22 
{
	public static void main(String[] args)
	{
	MyString1 num = MyString1.valueOf(987654321L);
    System.out.println(num.toChars());
    MyString1 s = new MyString1("Test123");
    System.out.println(s.length());
    System.out.println(s.charAt(1));
    System.out.println(s.equals(new MyString1("Test123")));
    System.out.print(MyString1.valueOf(345).toChars());
	}
}
