package com.baekjoon.ex01;

import java.util.Scanner;
//18108번 문제
public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 543;
		int num = sc.nextInt();
		if(num >= 1000 || num <= 3000) {
			int result = num - a;
			System.out.println(result);
		}
		
		
		sc.close();
	}

}
