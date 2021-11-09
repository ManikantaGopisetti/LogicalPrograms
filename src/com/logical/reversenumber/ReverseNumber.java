package com.logical.reversenumber;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int num = scan.nextInt();

		int revnum = 0;
		int rem = 0;

		while (num > 0) {
			rem = num % 10;
			revnum = revnum * 10 + rem;
			num = num / 10;
		}
		System.out.println("Reverse of the given number : " + revnum);
		scan.close();
	}

}
