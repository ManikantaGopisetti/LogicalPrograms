package com.logical.perfectnumber;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=scan.nextInt();
		int i=1, sum=0;
		while(i<=n/2) {
			if(n%i==0) {
				sum=sum+i;
			}
			i++;
		}
		if(sum==n) {
			System.out.println("Given number "+ n + " is a perfect number");
		}
		else {
			System.out.println("Given number "+ n +" is not a perfect number");
		}
		scan.close();
	}

}

