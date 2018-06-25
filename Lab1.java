package LabAttempt;

import java.util.Scanner;

public class Lab1 {
public static void main (String [] args) { //creating main method
	Scanner scnr = new Scanner(System.in); //creating scanner object
	int firstNum;
	int secondNum;
	String firstString;
	String secondString;
	int lengthFirst;
	int lengthSecond;
	int previousSum;
	int nextSum;
	

	//first input
	System.out.println("Enter first number: " );
		firstNum = scnr.nextInt();
		firstString = "" + firstNum;
		lengthFirst = firstString.length(); //finding the length of string
	
	//second input
	System.out.println("Enter second number: " );
		secondNum = scnr.nextInt();
		secondString = "" + secondNum;
		lengthSecond = secondString.length(); //finding the length of string
		
	if(lengthFirst != lengthSecond) { 
			System.out.println("Length of input numbers do not match.");
			return;
		}
	
	if (lengthFirst == 1) { 
			System.out.println("Error, please enter two or more digits. "); //need at least two digits to compare
			return;
		}
		
	char prevDigit;
	char nextDigit;
	int a;
	int b;
	
	for (int i = 0; i + 1 < firstString.length(); ++i) { //loop until the second to last digit
		prevDigit = firstString.charAt(i); //take initial digit in character format
		a = Character.getNumericValue(prevDigit); //convert character to int
		nextDigit = secondString.charAt(i);
		b = Character.getNumericValue(nextDigit); 
		previousSum = a + b; //initial sum
		
		prevDigit = firstString.charAt(i + 1); //take next digit in string in character format
		a = Character.getNumericValue(prevDigit);
		nextDigit = secondString.charAt(i + 1);
		b = Character.getNumericValue(nextDigit);
		nextSum = a + b;
		
		if (previousSum != nextSum) {
			System.out.println("False");
			return;
		}
	}
	
	System.out.println("True");
	return;
	
	
}
}
