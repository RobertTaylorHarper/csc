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
import java.util.Scanner; //importing scanner
	public class Problem1{
	
	public static void main(String[] args) {

		//welcoming user
		System.out.println("Welcome to my program! This program will help you calculate many different things about numbers you input!");
		//getting ready for user to input data
		Scanner keyboard = new Scanner(System.in);
		// prompt the user for input and store it
		System.out.print("Please enter a set of 5 numbers seperated by blank space, you may only use whole numbers or fractions.");
		double[] inputArray; //creating array loop
		inputArray = new double[5];
		
		for (int inputCounter = 0; inputCounter < 5; inputCounter ++){
			inputArray[inputCounter] =  keyboard.nextDouble();		//initiating counter
		}//ending input loop
		
		double sum = 0;
		for (int averageCounter = 0; averageCounter < inputArray.length; averageCounter ++){
			sum = sum + inputArray[averageCounter];	
		}//storing and ending averageloop
		double averageOutput = sum / inputArray.length; 
		System.out.printf("The average if the numbers you entered is: %10.2f", averageOutput); //outputting average
		System.out.print("\n");
		
		double maxValue = inputArray[0]; //creating maxvalue loop
		for (int maxCounter = 0; maxCounter < inputArray.length; maxCounter ++){
			if (inputArray[maxCounter] > maxValue){
				maxValue = inputArray[maxCounter];
			}//ending if loop	
		}
		System.out.printf("The largest value you entered is: %10.2f", maxValue); //outputting max value
		System.out.print("\n");
		//starting function for smallest and largest value output
		double minValue = inputArray[0];
		for (int minCounter = 0; minCounter < inputArray.length; minCounter ++){
			if (inputArray[minCounter] < minValue){
				minValue = inputArray[minCounter];
			}	
		}
		System.out.printf("The smallest value you entered is: %10.2f",  minValue);
		System.out.print("\n");
		
		System.out.printf("The values you entered have a range of: %10.2f", (maxValue - minValue));
		System.out.print("\n");
		System.out.print("Thank you for using my program!");

	}		  
} 
