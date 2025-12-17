package com.pblm.sloving;

//
import java.util.Scanner;

public class CountDigits {
	static int countDigits(long n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(countDigits(n));
	}

}

//for Strings

/**
 *
 * public class CountDigits {
 * 
 * static int countDigits(String s) { return s.length(); }
 * 
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 * 
 * String input = sc.next(); // read as String
 * System.out.println(countDigits(input)); } }
 */
