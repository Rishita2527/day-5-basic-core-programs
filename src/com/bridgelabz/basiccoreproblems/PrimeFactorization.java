package com.bridgelabz.basiccoreproblems;
import java.util.Scanner;
public class PrimeFactorization {
		void Display() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sc.nextInt();
			for(int i=2;i<num;i++) {
			while(num%i==0) {
					System.out.println(i + " ");
					num = num /i;	
				}
			}
			if(num>2) {
				System.out.println(num);
			}
		}
		public static void main(String[] args) {
			PrimeFactorization primenumber= new PrimeFactorization();
			primenumber.Display();
		}
}
