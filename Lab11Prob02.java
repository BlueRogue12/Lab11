/**
 * File: Lab 11 
 * Class: CSCI 1302 
 * Author: Sydney Boles and Lana Marin 
 * Created on: December 1, 2023 
 * Last modified: December 1, 2023 
 * Description: Use recursion to create an efficient string-reversing method
 */
public class Lab11Prob02 {

	// Test reverseString method
	public static void main(String[] args) {
		System.out.println("Reversed string of a and llama:" + reverseString("a") + " " + reverseString("llama"));
	}// end of main method

	// Method to reverse a string
	public static String reverseString(String word) {
		// Return String when word length is 1
		if (word.length() == 1) {
			return word;
			// Return reversed String with any other length
		} else {
			return reverseString(word.substring(1)) + word.charAt(0);
		}

	}// end of reverseString method
}// end of Lab11Prob02