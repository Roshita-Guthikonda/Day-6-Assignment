package com.codegnan.operatorexamples;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		String result=((num%2 == 0) ? "Given number is a even number." : "Given number is a odd number.");
		System.out.println(result);
		sc.close();
	}

}
