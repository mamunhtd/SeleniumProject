package launchBrowser;


import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	/*
	 * Generate 500 random numbers and print the nth smallest number in a
	 * programming language of your choice. (Ask user for the Nth smallest number)
	 */

	public static void main(String[] args) {

		 Random rnum = new Random();
	      int counter;
	    
	    int numbers= rnum.nextInt(500);
	   
	      for (counter = 0 ; counter <  numbers ; counter++) 
	      {
	    	  System.out.println(counter);
	    	  
	      }
	      
	  
	      Scanner input = new Scanner(System.in);
	      System.out.println("Give me The Smalles Number");
	      int num = input.nextInt();
	  
	      
	       if (counter > num) {
	    	   System.out.println("This is smaller Number");
	       }else if (counter < num){
	    	   System.out.println("This is larger number");
	       }else {
	    	   System.out.println("This is not a larger number");
	       }
	    	   
	       
	      
        
        
	}  
        
        
        
        
        
        
        
        
        
        
		}
		

	


