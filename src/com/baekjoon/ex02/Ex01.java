package com.baekjoon.ex02;

import java.util.Scanner;

public class Ex01 {
//문제 1330
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
	
		if(a > b) {
			System.out.println(">");
		}else if(a < b) {
			System.out.println("<");
		}else if (a == b) {
			System.out.println("==");
		}
	
		
		
		
		
		sc.close();
	}

}