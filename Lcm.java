package com.pblm.sloving;

import java.util.Scanner;

public class Lcm {
	static int findLcm(int a, int b) {
		int rev = Math.max(a, b);
		while (true) {
			if (rev % a == 0 && rev % b == 0) {
				break;
			}
			rev++;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(findLcm(a, b));
	}
}
