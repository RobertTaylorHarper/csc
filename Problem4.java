/**
*
*
*
*  Description:   This program will display a multiplication table.
*            
* 
*
*  Input: none
*
*
*
*  Output: multiplication table
*
*
*
*  @author  Robert Harper
*
*  @since   7/13/2020
*
*/
public class Problem4{
	
	
	public static void main(String[] args) {
		 
		// welcome the user
		System.out.println("Hello, This is the multiplication table.");
		 
		for (int outterCounter = 1; outterCounter <= 10; outterCounter ++){ //initiating first loop
			for (int innerCounter = 1; innerCounter <= 10; innerCounter ++){ //initiating second loop for counter
		 		System.out.print(outterCounter * innerCounter + "\t");
			}//inner loop END 	
			System.out.print("\n");
		}//outer loop END 
	}//method end
}