package launchBrowser;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber2 {

	public static void main(String[] args) {
		
		/*
		   int i = 10;
	        int j = 20;
	        int k = 5;
	        int x = (i > j && i > k) ? i : (j > k) ? j : k;
	        int y = (i < j && i < k) ? i : (j < k) ? j : k;
	        System.out.println("Largetst Number : "+x);
	        System.out.println("Smallest Number : "+y);
	        
	        */
		
		RandomNumber2 a = new RandomNumber2();
			a.add(5, 5 );
			a.subtr(5, 6);
			a.divide(10, 5);
			a.multiple(5, 5);
			a.GetMax(null);
}
	
	public String add(int firstOperand, int secondOperand) {
		return firstOperand + "secondOperand";
		
	}
	
	public int subtr(int firstOperand, int secondOperand) {
		return firstOperand - secondOperand;
		
	}
	
	public int divide(int firstOperand, int secondOperand) {
		 if(secondOperand!=0)
		 {
			 return firstOperand/secondOperand;
		 }
		return secondOperand;
	}
	
	
	public int multiple(int firstOperand, int secondOperand) {
		return firstOperand * secondOperand;
	}
	
	
	
	public int GetMax(int[] values) {
		
		int max  = values[0];
		
		for(int i=0; i<values.length; i++) {
			
			if(values[i] < max) {
				max = values[i];
			}
			
			
		}
		return max;
		
	}
	
	
	
	
	
}	