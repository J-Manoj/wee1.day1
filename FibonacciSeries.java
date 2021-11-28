package week1.day1;

public class FibonacciSeries {

	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter
	 * 
	 * What are my learnings from this code? 
	 * 1) Same variable can be used to assign different values by removing the old one and adding new one.
	 * 2) Printing two values from two variables in same sysout statement
	 * 3)
	 * 
	 */

	public static void main(String[] args) {


		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		// Print first number
		System.out.println(firstNum+"\n"+secNum);
		// Iterate from 1 to the range
		for (int i =2; i<range; i++ ) {
			int sum = firstNum+secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
					
		}
		// add first and second number assign to sum

		// Assign second number to the first number

		// Assign sum to the second number
		
		// print sum
		

	}

}
