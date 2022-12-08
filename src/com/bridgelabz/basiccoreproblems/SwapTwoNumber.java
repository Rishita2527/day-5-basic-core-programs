package com.bridgelabz.basiccoreproblems;
import java.util.Scanner;

public class SwapTwoNumber {
	int a, b, temp;
	int display() {
		System.out.println("Enter First numbers");
		Scanner sc1 = new Scanner(System.in);
		a=sc1.nextInt();
		System.out.println("Enter Second numbers");
		Scanner sc2 = new Scanner(System.in);
		b=sc2.nextInt();
		System.out.println("Before Swiping: "+ a+" "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swiping: "+ a+" "+b);
		return temp;
}
		public static void main(String[] args) {
			SwapTwoNumber obj = new SwapTwoNumber();
			obj.display();
		}
		
}
