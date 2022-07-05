package org.mini.console.task;

import java.util.Scanner;

public class StudentDetails {
	void sortById() {
		String name;
		int id;
		System.out.println("enter the size of array: ");
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			StudentPojo student[] = new StudentPojo[n];
			for (int i = 0; i < n; i++) {
				System.out.println("enter the Student id: ");
				id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter the Student name: ");
				name = sc.nextLine();
				student[i] = new StudentPojo(name, id);
			}
			System.out.println("Before performing sort");
			for (StudentPojo s : student) {
				System.out.println(s);
			}
			for (int i = 1; i < student.length; i++) {
				StudentPojo temp = student[i];
				int j = i - 1;
				while ((j >= 0) && (student[j].getId() > temp.getId())) {
					student[j + 1] = student[j];
					j--;
				}
				student[j + 1] = temp;
			}
			System.out.println("After performing sort");
			for (StudentPojo s : student) {
				System.out.println(s);

			}
		}
	}

	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		sd.sortById();
	}
}
