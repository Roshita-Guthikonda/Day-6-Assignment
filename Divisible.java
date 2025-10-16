package com.codegnan.operatorexamples;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		String result=(num%5==0)?"Divisible by 5":"Not Divisible by 5";
		System.out.println(result);
		sc.close();

	}

}
