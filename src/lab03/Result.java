package lab03;

import java.util.Scanner;

public class Result {
	
	// solving using nested for loop approach
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		String[] pre = scr.nextLine().split(" ");
		String[] values = scr.nextLine().split(" ");
		
		int n = Integer.parseInt(pre[0]);
		int k = Integer.parseInt(pre[1]);

		int count = 0;
		
		for (int i=0; i < n; i++) {
			int cur = Integer.parseInt(values[i]);
			
			for (int j=i+1; j < n; j++) {
				int next = Integer.parseInt(values[j]);
				
				if (Math.abs(cur - next) == k) {
					count++;
				}
			}
		}
		
		System.out.println(count);
		scr.close();
	}
}
