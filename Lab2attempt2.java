package LabAttempt;

import java.util.Scanner; 
import java.time.*;

public class Lab2attempt2 {
	

public static void main (String [] args) { // creating main method
	
	Scanner scnr = new Scanner (System.in); // creating a Scanner object

	String date1 = scnr.nextLine();
	
	LocalDate day1;
	LocalDate day2;
	
	System.out.println("Please enter two dates in 'yyyy-mm-dd' format: ");
	
	try {
		LocalDate firstDate = LocalDate.parse(date1);
	}
	catch (Exception e) {
		System.out.println("Cannot calculate '" + date1 + "'");
		return;
		
	String date2 = scnr.nextLine();	
		
	try {
		LocalDate secondDate = LocalDate.parse(date2);
	}
	
	catch (Exception e) {
		System.out.println("Couldn't make a date out of '" + date2 + "'");
		return;	
	}	
	

	
	Period diff = Period.between(day2, day1);
	
	String year = p.getYears();
	String months = p.getMonths();
	String days = p.getDays();
	
	System.out.println("Difference between dates measured equals to" + year + " years " + month + " months " + day +" days." );
	
	}
}
}

	
