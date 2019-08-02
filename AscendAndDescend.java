// Author: David
// Date: 08/01/19
// File: AscendAndDescend.java
// 
// Create an application that accepts 3 numbers from the user then have the computer print them
// into the command line in ascending and then descending order.
// Only If/Else statments were used to do this, no loops.

import java.util.Scanner;

public class AscendAndDescend
{
	public static void main(String[] args) 
	{
		// Variables
		int first;
		int second;
		int third;
		char dash = '-';
		boolean ascend;
		boolean descend;

		// Scanner Object
		Scanner input = new Scanner(System.in);

		// User Input
		System.out.println("Lets pick some numbers and put them in order!");
		System.out.println("");
		System.out.print("Plese pick an INTEGER >> ");
		first = input.nextInt();
		System.out.print("Please pick a second INTEGER >> ");
		second = input.nextInt();
		System.out.print("Please pick a third INTEGER >> ");	
		third = input.nextInt();

		// Check to see if the data is already in ascending or descending order.
		// If it is already in order then let the user know and give them the 
		// opposite order than their input.
		ascend = checkAscending(first, second, third);
		descend = checkDescending(first, second, third);

		if (ascend) 
		{
			System.out.println("");
			System.out.println("Your numbers are already in ascending order!!\nHere they are in descending order: " + third + dash + second + dash + first);	
		}
		else
		{
			if (descend) 
			{
				System.out.println("");
				System.out.println("Your numbers are already in descending order!!\nHere they are in ascending order: " + first + dash + second + dash + third);			
			}
			else
			{
				// Output
				orderData(first, second, third);
			}
		}
	}

	// Method to check if the data is already in ascending order
	public static boolean checkAscending(int first, int second, int third)
	{
		if (first < second && second < third && first < third) 
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// Method to check if the data is already in descending order
	public static boolean checkDescending(int first, int second, int third)
	{
		if (first > second && second > third && first > third)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	// Method to order the data if it is not already ordered
	public static void orderData(int first, int second, int third)
	{
		// Variable
		int tradeInt;
		char dash = '-';

		// Calculation Phase
		// Have the computer check each number and use the tradeInt varaible to switch the 
		// numbers as needed.
		if (first > second) // Checks to see if first is greater than second
		{
			tradeInt = first; 
			first = second; 
			second = tradeInt; 
		}
		if (first > third) // Checks to see if first is greater than third
		{
			tradeInt = first; 
			first = third; 
			third = tradeInt;
		}
		if (second > third) // Checks to see if second is greater than first
		{
			tradeInt = second;
			second = third;
			third = tradeInt;
		}

		// Ouput to Command Line
		System.out.println("");
		System.out.println("Here are your numbers in ascending order: " + first + dash + second + dash + third);
		System.out.println("Here are your numbers in descending order: " + third + dash + second + dash + first);
	}
}