package com.baekjoon.ex02;

import java.util.Scanner;
//14681번 문제
public class Ex04 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int	y = sc.nextInt();
		
		
		if(x >= 0 && y >= 0) {
			System.out.println(1);
		}else if(x < 0 && y >= 0) {
			System.out.println(2);
		}else if(x < 0 && y < 0) {
			System.out.println(3);
		}else if(x > 0 && y < 0) {
			System.out.println(4);
		}
		
		
		sc.close();
	}

}
