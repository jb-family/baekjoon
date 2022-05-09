package com.baekjoon.ex03;

import java.util.Scanner;

public class Ex08 {
//11022번 문제
	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		for(int i = 1; i <= count; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2));
			
		}
	
	
		sc.close();
	}

}
