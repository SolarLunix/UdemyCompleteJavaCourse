/**
 * Date Created: 	4 May 2017
 * Date Edited: 	4 May 2017
 */
package com.solarlunix;

/**
 * @author Melissa Melaugh
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		remInts();
	}
	
	private static void remInts(){
		int smallestInt = -2147483648;
		System.out.println("The smallest int you can have is:" + smallestInt);
		
		int largestInt = 2147483647;
		System.out.println("The largest int you can have is:" + largestInt);
	}
	
	
}
