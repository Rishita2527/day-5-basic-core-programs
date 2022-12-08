package com.bridgelabz.basiccoreproblems;
import java.util.Scanner;

public class LargestNumber {
	void display(){
	int a, b, c;
	System.out.println("Enter First numbers");
	Scanner input1 = new Scanner(System.in);
	a=input1.nextInt();
	System.out.println("Enter Second numbers");
	Scanner input2 = new Scanner(System.in);
	b=input2.nextInt();
	System.out.println("Enter Third numbers");
	Scanner input3 = new Scanner(System.in);
	c=input3.nextInt();
	if(a>b && a>c) {
		System.out.println("Largest number is " +a);
	}
	else if(b>a && b>c) {
		System.out.println("Largest number is " +b);
	}
	else {
		System.out.println("Largest number is " +c);
	}
}   
	public static void main(String[] args) {
	LargestNumber largest = new LargestNumber();
	largest.display();
	}
}
