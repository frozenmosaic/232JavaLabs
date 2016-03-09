package lab03;

import java.io.File;

import org.junit.Test;

import testbase.StdioTestBase;

public class CountingPairsTest extends StdioTestBase {

	@Test
	public void testSample1() {
		// Input from a string in the test.
		String input = "5 2\n1 5 3 4 2";
		Integer output = 3;
		runTest(CountingPairs.class, input, output,
				"Incorrect result for sample input 1.");
	}
	
	@Test
	public void testSample2() {
		// Input from a text file in the package.
		File input = new File("src/lab03/input2.txt");
		Integer output = 0;
		runTest(CountingPairs.class, input, output,
				"Incorrect result for sample input 2.");
	}
	
	/**
	 * Test a different set
	 */
	@Test
	public void testSample3() {
		// Input from a text file in the package.
		String input = "6 2\n1 5 3 4 1 2";
		Integer output = 4;
		runTest(CountingPairs.class, input, output,
				"Incorrect result for sample input 3.");
	}
	
	/**
	 * Test when all values are the same and k != 0
	 */
	@Test
	public void testSample4() {
		// Input from a text file in the package.
		String input = "5 2\n5 5 5 5 5";
		Integer output = 0;
		runTest(CountingPairs.class, input, output,
				"Incorrect result for sample input 4.");
	}
	
	/**
	 * Test when all values are the same and k = 0
	 */
	@Test
	public void testSample12() {
		// Input from a text file in the package.
		String input = "5 0\n5 5 5 5 5";
		Integer output = 10;
		runTest(CountingPairs.class, input, output,
				"Incorrect result for sample input 4.");
	}
	
	/**
	 * Test when there are duplicates 
	 */
	@Test
	public void testSample5() {
		// Input from a text file in the package.
		String input = "5 4\n1 5 5 5 5";
		Integer output = 4;
		runTest(CountingPairs.class, input, output,
				"Incorrect result for sample input 5.");
	}
	
	/**
	 * Test when there are duplicates and k = 0
	 */
	@Test
	public void testSample6() {
		// Input from a text file in the package.
		String input = "6 0\n5 5 5 5 5 1";
		Integer output = 10;
		runTest(CountingPairs.class, input, output,
				"Incorrect result for sample input 6.");
	}
	
	@Test
	public void testSample7() {
		// Input from a text file in the package.
		String input = "7 0\n1 1 5 5 5 5 5";
		Integer output = 11;
		runTest(CountingPairs.class, input, output,
				"Incorrect result for sample input 7.");
	}
	
	/**
	 * Test when there are duplicates and k != 0
	 */
	@Test
	public void testSample8() {
		// Input from a text file in the package.
		String input = "7 4\n1 5 1 5 5 5 5";
		Integer output = 10;
		runTest(CountingPairs.class, input, output,
				"Incorrect result for sample input 8.");
	}
	
	/**
	 * Test when there are no values
	 */
	@Test
	public void testSample9() {
		// Input from a text file in the package.
		String input = "0 2500\n";
		Integer output = 0;
		runTest(CountingPairs.class, input, output,
				"Incorrect result for sample input 9.");
	}
	
	/**
	 * Test when there are 5000 values (maximum N)
	 */
	@Test
	public void testSample10() {
		// Input from a text file in the package.
		String input = "5000 2\n";
		int i = 0;
		while (i < 1000) 
		{
			input = input + "1 ";
			i++;
		}
		
		input += "2 13 4 15 13 9 ";

		while (i < 5000) 
		{
			input = input + "1 ";
			i++;
		}
		
		Integer output = 3;
		runTest(CountingPairs.class, input, output,
				"Incorrect result for sample input 10.");
	}
	
	/**
	 * Test when all values are 0 and k != 0
	 */
	@Test
	public void testSample11() {
		// Input from a text file in the package.
		String input = "10 2\n";
		int i = 0;
		while (i < 10) 
		{
			input = input + "0 ";
			i++;
		}
		
		Integer output = 0;
		runTest(CountingPairs.class, input, output,
				"Incorrect result for sample input 11.");
	}
	
	/**
	 * Test when all values are 0 and k = 0
	 */
	@Test
	public void testSample13() {
		// Input from a text file in the package.
		String input = "10 0\n";
		int i = 0;
		while (i < 10) 
		{
			input = input + "0 ";
			i++;
		}
		
		Integer output = 45;
		runTest(CountingPairs.class, input, output,
				"Incorrect result for sample input 11.");
	}
}
