/**
*
* Name: Marsha Guimond
* Teacher: Mr.Hardman
* Assignment: MethodProject3
* Date Last Modified: December 12, 2016
*
*/
import java.util.Scanner;

/**
 * 
 */

/**
 * @author m.guimond3
 *
 */
public class MethodProject3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int userNum;
		boolean prime;
		
		System.out.print("Please enter an integer value: ");
		userNum = userInput.nextInt();
		
		
		if(userNum == 1){
			System.out.print("The integer value is prime.");
			
		}
			
		
		else{ 
			
			prime = isPrime(userNum);
			
			if(prime == true){
		 
			System.out.println(userNum + " is a prime interger value."); 
	 	
	    }	
			
		else{ 
			
			System.out.print(userNum + " is a not a prime interger value.");
			
			}
			
		}	
	 	
		userInput.close();
		
	}

	 			 
	
   /**
    * isPrime will display if the users number is prime
 	* 
 	* @param there are no parameters
 	* @return the true or false statement will be returned
 	* to the user
 	*/
	public static boolean isPrime(int userNum){
		
	
		boolean prime = true;
	

		for(int i = 2; prime && i <= Math.sqrt(userNum); i++){
			
			if(userNum % i == 0){
				prime = false;

    /**
     * Check whether the remainder of userNumber divided by i equals 0.
     * If so, prime = false;
     *
     */
			

		}
		
		
		}
		return prime;	
		
	}
	
	
}	
	




	
	
