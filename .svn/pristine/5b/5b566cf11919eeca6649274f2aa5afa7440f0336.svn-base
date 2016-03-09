package lab02;

import java.util.Scanner;
/**
 * 
 * @author VyHuynh & Ashir
 * COMP232 - Lab02
 * Tues, Feb 2, 2016 
 */
public class MeanMeans {
	
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		String[] input = scr.nextLine().split(",");
		if (input.length == 1 && input[0].equals("-1")) {
			// check if input is "-1"
			System.out.println("No lines.");
			scr.close();
		} else {
			int count = 0; // number of trials
			double setTotal = 0.0; // sum of all averages from all trials
			
			// setting condition for when to end while loop
			while (!(input.length == 1 && input[0].equals("-1"))) {
			
				// for each trial
				double sum = 0.0;
				for (int i = 0; i < input.length; i++) {
					double d = Double.parseDouble(input[i]);
					sum = sum + d;
				}
				
				// calculate average of each trial 
				double avgTrial = sum / input.length;
				
				// add trial average to set total
				setTotal = setTotal + avgTrial;
				
				input = scr.nextLine().split(",");
				count++;
			}
			double res = setTotal / count;
			System.out.println(String.format("%.2f", res));
			scr.close();
		}
	}
}
