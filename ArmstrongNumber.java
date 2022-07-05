package org.practice;

import java.util.Scanner;

public class ArmstrongNumber {
     void findNo() {
    	 System.out.println("Enter the number to check: ");
    	 Scanner sc = new Scanner(System.in);
    	 int num = sc.nextInt();
    	 int n = num,d;
    	 double sum=0;
    	 while(num>0) {
    		 d=num%10;
    		 num/=10;
    		 sum=sum+(Math.pow(d, 3));
    	 }
    	 if(sum==n) {
    		 System.out.println("The number "+n+" is an armstrong number");
    	 }
    	 else {
    		 System.out.println("The number "+n+" is not an armstrong number");
    	 }
    	 sc.close();
     }
     public static void main(String[] args) {
		ArmstrongNumber a =new ArmstrongNumber();
		a.findNo();
	}
}
