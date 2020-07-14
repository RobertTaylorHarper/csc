/**
*
*
*
*  Description:   This program will read input from a user, and then it will output the same string but on separate lines
*            
* 
*
*  Input:  String that user provides
*
*
*
*  Output: Loop of the same string but separate the characters>
*
*
*
*  @author  Robert Harper
*
*  @since   7/13/2020
*
*/
import java.util.Scanner;
public class Problem2{
	//declare the main method
	public static void main(String[] args) {
		 
		// welcome the user
		System.out.println("Hi welcome to my program! If you enter a word I will spit that word right back at you on seperate lines! ");
		Scanner keyboard = new Scanner(System.in); //initialize scanner
		System.out.print("Please enter only 1 word!"); //specify what they should be entering
		String userInput; //store userinput in string
		userInput = keyboard.next();	//storing user input
		for (int inputCounter = 0; inputCounter < userInput.length(); inputCounter ++){
			System.out.println(userInput.charAt(inputCounter));		
		}//input loop END 
		
		 
	}
}

