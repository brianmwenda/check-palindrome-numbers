package com.brianmwenda.palindrome;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		int rem,rev = 0;
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp =number;
		while(temp!=0) {
			rem = temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		if(rev == number) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
