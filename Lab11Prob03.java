/**
 * File: Lab 11 
 * Class: CSCI 1302 
 * Author: Sydney Boles and Lana Marin 
 * Created on: December 1, 2023 
 * Last modified: December 1, 2023 
 * Description: Use recursion to create an even more efficient string-reversing method
 */
public class Lab11Prob03 {

	// Test reverseString method
	public static void main(String[] args) {
		System.out.println("Reversed string of a and llama:" + reverseString("a") + " " + reverseString("llama"));
	}// end of main method

	// Method to call helper method to reverse string
	public static String reverseString(String word) {
		return reverseString(word, word.length() - 1);

	}// end of reverseString method

	// Reverse string like previous problem, but utilizing a pointer to prevent
	// repeated string creation
	public static String reverseString(String word, int index) {

		if (index == 0) {
			return word.substring(0, 1);
		} else {
			return word.charAt(index) + reverseString(word, index - 1);
		}
	}// end of second reverseString method
}// end of Lab11Prob03