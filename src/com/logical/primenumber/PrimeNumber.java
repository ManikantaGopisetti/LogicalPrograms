package com.logical.primenumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int is_prime = 0;
		System.out.print("Enter a number : ");
		int n = scan.nextInt();

		if (n == 0 || n == 1) {
			System.out.println("Given number " + n + " is not a prime number");
		} else {
			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					is_prime++;
				}
			}
			if (is_prime == 0) {
				System.out.println("Given number " + n + " is a prime number");
			} else {
				System.out.println("Given number " + n + " is not a prime number");
			}
		}
		scan.close();
	}

}
