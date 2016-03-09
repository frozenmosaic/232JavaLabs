package lab03;

import java.util.Scanner;

public class CountingPairs {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int count = 0;
		int n = scr.nextInt(); // number of values, from 0 - 5000
		int k = scr.nextInt(); // difference between pairs to be counted, from 0 - 2500

		// loop through each value and count its frequency
		int[] frequency = new int[2501]; // array to keep track of each value's frequency
		for (int i = 0; i < n; i++) {
			int val = scr.nextInt();
			frequency[val]++;
		}

		// count the pairs
		for (int i = 0; i < frequency.length - k; i++) {
			if (k == 0) {
				// when k == 0, for e.g, if there are 4 5's, there will be 3 + 2 + 1 = 6 pairs
				// thus, the number of pairs is the sum from 1 to (n-1)
				// summation formula to calculate sum from 1 to p: p(p+1)/2
				// substitute p with (n-1): n(n-1)/2
				
				int temp = ((frequency[i] - 1) * frequency[i]) / 2;
				count += temp;
			} else {
				// when k != 0, the number of pairs will be the multiplication of the two numbers' frequency values
				// for e.g, 2 3's and 5 4's (k == 1) => number of pairs = 2 * 5 = 10 pairs
				int cur = i;
				int next = i + k;
				count = count + frequency[cur] * frequency[next];	
			}
		}

		System.out.println(count);
		scr.close();
	}
}
