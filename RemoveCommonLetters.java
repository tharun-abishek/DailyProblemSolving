package org.practice;

import java.util.Scanner;

public class RemoveCommonLetters {
	void remove() {
		System.out.println("Enter the String: ");
		try (Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			String a[] = str.split(" ");
			String ans = "";
			for (int j = 0; j < a[0].length(); j++) {
				String temp = "" + a[0].charAt(j);
				if (a[1].contains(temp)) {
					continue;
				} else {
					ans += a[0].charAt(j);
				}
			}
			System.out.println(ans);
		}
	}
	public static void main(String[] args) {
		RemoveCommonLetters rc = new RemoveCommonLetters();
		rc.remove();
	}
}
