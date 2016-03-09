package lab03;

import java.util.Random;

public class Generator {
	private Random rnd;
	private int length;
	private int limit;
	
	public Generator(int l, int limit) {
		rnd = new Random();
		length = l;
		this.limit = limit;
	}
	
	public int[] generate() {
		int[] arr = new int[length];
		for (int i=0; i < length; i++) {
			arr[i] = rnd.nextInt(limit);
		}
		return arr;
	}
	
	public static void main(String[] args) {
//		Generator gen = new Generator(10, 100);
//		int [] res = gen.generate();
//		for (int val : res) {
//			System.out.print(val + " ");
//		}
		String input = "";
		int i = 0;
		while (i < 10) 
		{
			input = input + "1 ";
			i++;
		}
		System.out.println(input);
	}
}
