package LabAttempt;

import java.util.Scanner;

public class Lab2 {
public static void main (String [] args) { // creating main method
	
	Scanner scnr = new Scanner (System.in); // creating a Scanner object
	int firstYear;
	int secondYear;
	int firstMonth;
	int secondMonth;
	int firstDay;
	int secondDay;
	int dateA;
	int dateB;
	int difference;
	int year;
	int month;
	int day;
	int time; 
	
	//first input.
	System.out.println("Please enter first date in YYYY MM DD format: ");
	//make sure to place space in between Y M D format
		firstYear = scnr.nextInt(); 
		firstMonth = scnr.nextInt();
		firstDay = scnr.nextInt();
	
	//second input.
	System.out.println("Please enter second date in YYYY MM DD format: ");
		secondYear = scnr.nextInt();
		secondMonth = scnr.nextInt();
		secondDay = scnr.nextInt();
	
	dateA = (firstYear * 365 + firstMonth * 30)+ firstDay; //this is to calculate the days from the input, but is only an approximation since each month has different days.
	dateB = (secondYear * 365 + secondMonth * 30) + secondDay; 
	
	difference = Math.abs(dateA - dateB);
	//must use absolute value to avoid negative result
	
	//converting format back to original format
	year = difference / 365;
	month = (difference % 365) / 30;
	day = (difference % 365) %30;
	
	//output the result
	System.out.println("The difference between the dates measured equals to : "+ year +" year " + month + " months " + day+ " days or "+ difference + " days, 0 hours, 0 mins.");
	}

}
