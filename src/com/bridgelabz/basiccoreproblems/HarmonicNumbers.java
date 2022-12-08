package com.bridgelabz.basiccoreproblems;
import java.util.Scanner;

public class HarmonicNumbers {				  
		void Display() {								
			System.out.println("Enter a number");		
			Scanner in = new Scanner(System.in);	    
			int num=in.nextInt();						
			double result=0.0;	
				while (num>0) {
					result=result + (double)1/num;  //calculate harmonic value H2=H1+1/2
					num--;   //decrement num by 1 means the common difference is 1
					System.out.print(result + " , ");
				}					
		}
		public static void main(String[] args) {
			HarmonicNumbers a= new HarmonicNumbers();
			a.Display();
		}
}
