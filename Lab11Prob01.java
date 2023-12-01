/**
 * File: Lab 11 
 * Class: CSCI 1302 
 * Author: Sydney Boles and Lana Marin 
 * Created on: December 1, 2023 
 * Last modified: December 1, 2023 
 * Description: Use recursion to create an efficient recursiveAbstract method
 */

public class Lab11Prob01 {

	public static void main(String[] args) {

		System.out.println(recursiveAbstract(0));
		System.out.println(recursiveAbstract(1));
		System.out.println(recursiveAbstract(2));
		System.out.println(recursiveAbstract(4));

	}// end of main method

	// Recursive Abstract method to determine result based on user input
	public static int recursiveAbstract(int num) {
		// Base cases
		if (num == 0) {
			return 1;
		} else if (num == 1) {
			return 3;
		} else if (num == 2) {
			return 4;
		// General case
		} else {
			return ((recursiveAbstract(num - 3) * recursiveAbstract(num - 2)) - recursiveAbstract(num - 1));
		}
	}// end of recursiveAbstract method
}// end of Lab11