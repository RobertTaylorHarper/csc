/**
*
*
*
*  Description:   This program will read a set of floating point values and then print the average, smallest, largest, and range of the given values by the user.
*            
* 
*
*  Input:  numbers from user
*
*
*
*  Output: The properties of the users input including the average, smallest, largest, and range of the given values.>
*
*
*
*  @author  Robert Harper
*
*  @since   7/13/2020
*
*/
/**
*
*
*
*  Description:   This program  displays a triangular shape over a number of lines.
*                 It asks the user for a positive integer for the number of lines(rows) the user wants the triangle to display, 
*                 then creates a triangle that has stars (*) in each row from 1 up to the user's number. 
*
*
*  Input:  A positive integer for the number of lines to display
*
*  Output: Message:  This program displays a triangle shape that displays over the number of lines you want.
*          Message:  Please enter a positive integer for the number of lines you want in the triangle.
*          Triangle shape
*          Message:  Your triangle has been displayed!
*
*  @author  Sandra Perez
*
*  @since   4/15/2013
*
*/

import java.util.Scanner;  //Import the scanner class

public class Problem5 {
		public static void main(String[] args) {
			boolean willContinue = true; //using boolean to loop the program back for user to enter more input
			do {
				
		int numberLines = 0; //Declares the variable to hold the number of lines and sets it to 0

		Scanner keyboard = new Scanner(System.in); //Declares the Scanner for keyboard I/O

		String star = "*";  //Declares the String variable for *
		
      //Display introductory message about the program
      System.out.println("This program displays a triangle shape that displays over the number of lines you want."); 
      
      //Displys instruction message to user to enter the number of lines to be printed
		System.out.println("Please enter a positive integer for the number of lines you want in the triangle."); 
      
      //Get number of lines from user
		numberLines = keyboard.nextInt();  

      //Display a blank line
		System.out.println(); 

      //Loop to display the stars to form a right triangle
		for (int i = 1; i <= numberLines; i++) {  //The variable i represents the row number

			for (int j = 0; j < i; j++) {  // The variable j represents the number of stars in the row
            
            //Display the triangle
				System.out.print(star); 
			}//End of inner loop

      //Display a blank line for readability
		System.out.println();         

		}//End of outer loop
   
      System.out.println("Your triangle has been displayed!");
      
      System.out.println("Would you like to continue using the program? Please type Yes or No."); //prompting user to see if they want to loop the program.

      if(keyboard.nextLine().startsWith("N")) willContinue = false; //defining what cancels the loop
		} while (willContinue);
		
		}
}