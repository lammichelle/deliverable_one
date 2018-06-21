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
	String firstSplit;
	String secondSplit;
	int i;
	int j;
	int a;
	int previousSum;
	int firstSum;
	

	//first input
	System.out.println("Enter first number: " );
		firstNum = scnr.nextInt();
		firstString = "" + firstNum;
		lengthFirst = firstString.length();
	
	//second input
	System.out.println("Enter second number: " );
		secondNum = scnr.nextInt();
		secondString = "" + secondNum;
		lengthSecond = secondString.length(); //finding the length of string
		
		i = 0; 
		
		a = 1; //1 is the location of the string
		
		firstSplit = firstString.valueOf(firstNum);	//to split the string into individual characters		
	for (i=0; i < firstString.length(); ++i) {
	}
		
		secondSplit = secondString.valueOf(secondNum);
	for (j=0; j < secondString.length(); ++j) {
		
	}
	
	if (lengthFirst == 1) { 
		System.out.println("Error, please enter two or more digits. ");
	}

	
	previousSum = (firstSplit.indexOf('0') + secondSplit.indexOf('0'));
	
	if(lengthFirst == lengthSecond) {
			
		while (a < firstSplit.length()){
			firstSum = firstSplit.indexOf('a') + secondSplit.indexOf('a');
			if (firstSum != previousSum) {
			break; //can stop immediately and Print False
		}
			
			if (firstSum != previousSum) {	
			System.out.println("False");
		}
			
			
			else if (firstSum == previousSum) {
				System.out.println("True");
				a = a + 1; //loops again
			}
			else {
				System.out.println("Length of input numbers do not match.");
				
			}
		
			
		
		}
		}
	
	
	
	
}
	
	
	
	
}
