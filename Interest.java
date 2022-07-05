package org.practice;

import java.util.Scanner;

public class Interest {
     void siCalc() {
    	 Scanner sc = new Scanner (System.in);
    	 System.out.println("Enter the principal amount: ");
    	 double p = sc.nextLong();
    	 System.out.println("Enter the interest %: ");
    	 double r = sc.nextInt();
    	 System.out.println("Enter the tenure in years: ");
    	 double n = sc.nextInt();
    	 System.out.println("Interest amount is :"+(p*n*r)/100); 
     }
     void ciCalc() {
    	 Scanner sc = new Scanner (System.in);
    	 System.out.println("Enter the principal amount: ");
    	 double p = sc.nextLong();
    	 System.out.println("Enter the interest %: ");
    	 double r = sc.nextInt();
    	 System.out.println("Enter the tenure in years: ");
    	 double n = sc.nextInt();
    	 double ci =(p*(Math.pow(1+r/100, n))-p);
    	 System.out.printf("Compound Interest amount is :%.2f",ci);
     }
     public static void main(String[] args) {
		Interest i = new Interest();
//		i.siCalc();
		i.ciCalc();
	}
}
