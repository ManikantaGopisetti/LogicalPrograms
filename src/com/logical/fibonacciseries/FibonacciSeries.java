package com.logical.fibonacciseries;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("enter fibonacci range : ");
		int n = scan.nextInt();
		
		int fib1 = 0, fib2 = 1, fib3;

		System.out.println("The fibonacci series upto range " + n + " : ");
		if (n == 1) {
			System.out.print(fib1 + " ");
		} else if (n == 2) {
			System.out.print(fib1 + " " + fib2 + " ");
		} else {
			System.out.print(fib1 + " " + fib2 + " ");
			for (int i = 2; i < n; i++) {
				fib3 = fib1 + fib2;
				fib1 = fib2;
				fib2 = fib3;
				System.out.print(fib3 + " ");
			}
		}
		scan.close();
	}

}
