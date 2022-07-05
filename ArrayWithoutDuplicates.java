package org.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWithoutDuplicates {
	void uniqueArray() {
		System.out.println("Enter the array size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + " the value of element: ");
			a[i] = sc.nextInt();
//			for(int j=0;j<i;j++) {
//				if(a[i]==a[j]) {   to eliminate duplicate while insertion.....
//					System.out.println("Already exist");
//					i--;
//				}
//			}
		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					a[i] = -1;
					count++;
					break;
				}
			}
		}
		int k = 0;
		int[] a1 = new int[n - count];
		for (int i = 0; i < n; i++) {
			if (a[i] != -1) {
				a1[k++] = a[i];
			}
		}

		System.out.println(Arrays.toString(a1));
	}

	public static void main(String[] args) {
		ArrayWithoutDuplicates aw = new ArrayWithoutDuplicates();
		aw.uniqueArray();
	}
}
