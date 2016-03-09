package lab06;

import java.util.*;

/**
 * A program to decide if it is feasible or not to arrange an group of floats
 * according to a given order.
 * @author Vy Huynh & Jiaming Xuan
 * @date Mar 9, 2016
 */
public class ParadeShuffle {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		// get input
		
		// number of floats
		int numFloats = scr.nextInt();
		
		// get the order that floats come in, and the expected order to arrange
		Queue<Integer> pre = new LinkedList<Integer>();
		Queue<Integer> order = new LinkedList<Integer>();
		Stack<Integer> alley = new Stack<Integer>();

		int i = 0;
		while (i < numFloats) {
			int val = scr.nextInt();
			pre.add(val);
			i++;
		}

		i = 0;
		while (i < numFloats) {
			int val = scr.nextInt();
			order.add(val);
			i++;
		}

		boolean solved = true;
		while (order.size() > 0) {
			int expected = order.peek();
			
			// if first float expected and first float in order matches
			// remove said float from the expected queue 
			if (pre.size() > 0 && pre.peek().equals(expected)) {
				pre.remove();
				order.remove();
			} else if (alley.size() > 0 && alley.peek().equals(expected)) { 
				// if first float in side street and first float expected matches
				alley.pop();
				order.remove();
			} else {
				// otherwise stop if there are no other floats waiting
				if (pre.size() == 0) {
					solved = false;
					break;
				} else {
					// or push first float of order into side street
					alley.push(pre.poll());
				}
			}
			
		}

		// print out solution: yes if possible, no if not possible
		if (solved) {
			System.out.println("Yes.");
		} else {
			System.out.println("No.");
		}
		
		scr.close();
	}

}
