package com.codegnan.operatorexamples;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		String result=(num>=0)?"Positive number":"Negative number";
		System.out.println(result);
		sc.close();
	}

}

