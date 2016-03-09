package lab02;

import org.junit.Test;

import testbase.StdioTestBase;

public class RangeFinderTest extends StdioTestBase {

	@Test
	public void testSample1() {
		// Input from a string in the test.
		String input = "1 2 3 4 5";
		// Output from a string in the test
		String output = "The range is 4.";
		
		runTest(RangeFinder.class, input, output,
				"Incorrect result for sample input.");
	}
	
	@Test
	public void testSample2() {
		// Input from a string in the test.
		String input = "5 4 1 3 2"; // input in random order
		// Output from a string in the test
		String output = "The range is 4.";
		
		runTest(RangeFinder.class, input, output,
				"Incorrect result for sample input.");
	}

	@Test
	public void testSample3() {
		// Input from a string in the test.
		String input = "1 2 -1 -10 5"; // input contains negative integer
		// Output from a string in the test
		String output = "The range is 15.";
		
		runTest(RangeFinder.class, input, output,
				"Incorrect result for sample input.");
	}
	
	@Test
	public void testSample4() {
		// Input from a string in the test.
		String input = "-2 -4 -90 -1000 -25"; // input contains only negative integers
		// Output from a string in the test
		String output = "The range is 998.";
		
		runTest(RangeFinder.class, input, output,
				"Incorrect result for sample input.");
	}
	
	@Test
	public void testSample5() {
		// Input from a string in the test.
		String input = "1000 -1000"; 
		// Output from a string in the test
		String output = "The range is 2000.";
		
		runTest(RangeFinder.class, input, output,
				"Incorrect result for sample input.");
	}
}
