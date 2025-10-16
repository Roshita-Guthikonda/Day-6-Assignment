package com.codegnan.operatorexamples;

import java.util.Scanner;

public class CharacterToAscii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character(alphabet/digit/special character):");
		char alpha=sc.next().charAt(0);
		int ascii=(int)alpha;
		System.out.println(+ascii);
		sc.close();
		

	}

}
