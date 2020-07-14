/**
*
*
*
*  Description:  This program will allow a user to calculate the sum of odd integers up to a specified input and then loop if the user would like to keep calculating.
*            
* 
*
*  Input:  numbers from user
*
*
*
*  Output: The sum of all odd numbers up to that defined point
*
*
*
*  @author  Robert Harper
*
*  @since   7/13/2020
*
*/
import java.util.Scanner;

public class Problem3 {
public static void main(String[] args) {
	
	boolean willContinue = true; //using boolean to loop the program back for user to enter more input
	do {
	 int sumOdd = 0; //variable
     int digit; //variable
     System.out.println("Hello and welcome to my program! This program will display the sum of all odd numbers based on your input!"); //welcome and explanation
     System.out.println("Please Enter Number. you can use even numbers but it will only calculate the odd sums."); //ask user to input number
     Scanner keyboard = new Scanner(System.in); //scanner method
     int i = Integer.parseInt(keyboard.nextLine()); //set to parse int for stored user input

     int j;
     for(j =1; j<=i; j+=2) {
         sumOdd += j;
     } //end of adding all odd ints function

     System.out.println(sumOdd); //printing sum of all odd numbers based on users input
     
     System.out.println("Would you like to continue using the program? Please type Yes or No."); //prompting user to see if they want to loop the program.
     if(keyboard.nextLine().startsWith("N")) willContinue = false; //defining what cancels the loop
	} while (willContinue);
	
	System.out.println("Ok thanks bye."); //terminating message
		}
}