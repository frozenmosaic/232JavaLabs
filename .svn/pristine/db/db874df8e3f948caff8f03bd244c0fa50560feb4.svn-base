package lab02;

import java.util.Scanner;

public class RangeFinder {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		while (scr.hasNextInt()) {
			int i = scr.nextInt();
			
			if (i >= max) {
				max = i;
			}
			if (i <= min) {
				min = i;
			}
		}

		scr.close();
		System.out.println("The range is " + (max - min) + ".");
	}
}
