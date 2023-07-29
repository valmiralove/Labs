//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {
		System.out.println("Week 1 Lab");
		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int planeSeatRemaining = 34;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double groceriesCost = 105.34;
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'L';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		Boolean weatherOutsideHot = true;
		Boolean weatherOutsideCold = false;
				
		// 5. Create a variable to hold a customer's first name
		String firstName = "Leoa";
		
		// 6. Create a variable to hold a street address
		String streetAddress = "1890 Leos South St.";

		// 7. Print all variables to the console
		System.out.println(planeSeatRemaining + " seats remaining on airplane.");
		System.out.println("Groceries total is $" + groceriesCost);
		System.out.println("The person's middle initial is " + middleInitial);
		System.out.println("The weather outside is HOT! - " + weatherOutsideHot);
		System.out.println("The weather outside is Cold! - " + weatherOutsideCold);
		System.out.println(firstName + " is the customers name.");
		System.out.println(firstName + " lives at " + streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		planeSeatRemaining -= 2;
		System.out.println(planeSeatRemaining);

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		groceriesCost += 2.15;
		System.out.println(groceriesCost);

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'P';
		System.out.println(middleInitial);

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		weatherOutsideHot = !weatherOutsideHot;
		weatherOutsideCold = !weatherOutsideCold;
		System.out.println(weatherOutsideHot);
		System.out.println(weatherOutsideCold);

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = firstName + " " + middleInitial + " Bunny";
		System.out.println(fullName);

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("This is, " + fullName + " and they live at " + streetAddress);
		
	}
}