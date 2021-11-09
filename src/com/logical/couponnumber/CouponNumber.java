package com.logical.couponnumber;

import java.util.Scanner;

public class CouponNumber {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no of distict coupon numbers: ");
		int n = scan.nextInt();
		int couponArr[] = new int[n];
		int i = 0;
		while (i < couponArr.length) {
			int coupon = (int) (Math.random() * 1000);
			int count = 0;
			for (int j = 0; j < couponArr.length; j++) {
				if (couponArr[j] == coupon) {
					count++;
				}
			}
			if (count == 0) {
				couponArr[i] = coupon;
				i++;
			}
		}
		for (int a : couponArr) {
			System.out.println(a);
		}
		scan.close();
	}

}
