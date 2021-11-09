package com.logical.stopwatch;

import java.util.Scanner;

public class StopWatch {

	public long start() {
		long start = System.currentTimeMillis();
		System.out.println("start time = " + start); //Getting time in milliseconds
		return start;
	}

	public long stop() {
		long stop = System.currentTimeMillis();
		System.out.println("stop time = " + stop);  //Getting time in milliseconds
		return stop;
	}

	public static void main(String[] args) {

		StopWatch s = new StopWatch();
		Scanner scan = new Scanner(System.in);

		long startTime = s.start();

		int i = 0;
		while (i != 2) {
			System.out.println("Enter 2 to stop :");
			i = scan.nextInt();
		}

		long stopTime = s.stop();
		
		//converting milliseconds to seconds
		System.out.println("elapsed time= " + (stopTime - startTime) * 0.001 + " seconds");
		scan.close();
	}

}
