/** Program: Hang man
* File: Exercise7_35.java
* Summary: Hang man game that 
* randomly generates a word 
* and prompts the user to guess 
* one letter at a time.
* Author: Charles Maple III
* Date: July 15, 2016 
**/

import java.util.Scanner;

public class Exercise7_35 
{
	private static Scanner input;

	public static void main(String[] args)
	{
		String[] words = {"test", "java", "program", "school", "challenge", "game"};
		
		input = new Scanner(System.in);
		String answer;
		
		do
		{
			int i = intRandom(0, words.length - 1);
			char[] word = words[i].toCharArray();
			boolean[] mask = new boolean[word.length];
			int numCorrect = 0;
			int numMissed = 0;
			while(numCorrect != word.length)
			{
				System.out.print("Guess a letter in the word: ");
				
				//Print the result
				for(int l = 0; l < word.length; l++)
				{
					if(mask[l])
						System.out.print(word[l]);
					else
						System.out.print("*");
				}
				System.out.print(">");
				char guess = input.next().charAt(0);
				
				//check
				boolean miss = true;
				boolean retry = false;
				
				for(int l = 0; l < word.length; l++)
				{
					if(word[l] == guess)
					{
						if(mask[l] != true)
						{
							mask[l] = true;
							numCorrect++;
						}
						else
						{
							retry = true;
							break;
						}
						miss = false;
					}
				}
				if(miss)
					numMissed++;
				if(retry)
					System.out.println(guess + "has already been chosen.");
			}
			System.out.println("The word is " + String.valueOf(word) + ". You missed " + numMissed + " times.");
			System.out.print("Would you like to play again? Enter y or n>");
			answer = input.next();
		}
		while(answer.charAt(0) != 'n');
	}
	public static int intRandom(int lowerBound, int upperBound)
	{
	return (int) (lowerBound + Math.random() * (upperBound - lowerBound + 1));
	}
}
