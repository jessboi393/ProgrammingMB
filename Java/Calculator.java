/*
 * 
 * Incomplete code: The purpose of the Calculator.java program is to have the Scouts finish the Division and Quit sections
 * by changing the data types of the variables from integer to double or float, and integrate a while loop to keep the program from ending
 * (unless the Quit option is chosen).
 * 
 * 
 * 
 * Error check to make sure there is a warning message on an incorrect input.
 * 
 * 
 * 
 */

import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a;
		double b;
		double result;
		
		System.out.println("What kind of calculation would you like to do?");
		System.out.println("1): Addition");
		System.out.println("2): Subtraction");
		System.out.println("3): Multiplication");
		System.out.println("4): Division");
		System.out.println("5): Quit");
		
		int answer = sc.nextInt();
		
		if(answer == 1) {
			System.out.println("What is the first number you would like to add?");
			a = sc.nextdouble();
			System.out.println("What is the second number you would like to add?");
			b = sc.nextdouble();
			result = a + b;
			System.out.println("The sum is: " + result);
		}
		
		else if(answer == 2) {
			System.out.println("What is the number you are subtracting from? ");
			a  = sc.nextdouble();
			System.out.println("What is the number being subtracted?");
			b = sc.nextdouble();
			result = a - b;
			System.out.println("The result is: " + result);
		}
		
		else if(answer == 3) {
			System.out.println("What is the first number you are multiplying? ");
			a  = sc.nextdouble();
			System.out.println("What is the second number you are multiplying? ");
			b = sc.nextdouble();
			result = a * b;
			System.out.println("The result is: " + result);
		}/*division*/
		
		else if(answer == 4) {
			System.out.println("What is the first number you are dividing? ");
			a  = sc.nextdouble();
			System.out.println("What is the second number you are dividing? ");
			b = sc.nextdouble();
			result = a / b;
		
		
		
		}/*while loop*/ 
		system.out.println(i);
		i++;
		while (i <= 10)	System.out.println("The result is: " + result);
		
	
	
	
	        }/*exit feature*/
		
		else if(answer == 5) {
			System.out.println("Exit");
			sc.close(Calcularor.java);
			return;
		}/*while loop*/ 
		system.out.println(i);
		i++;
		while (i <= 10)
	
		
		
		
		
		
	}
	
	
	
	
	
	
}
