package com.baekjoon.ex03;

import java.util.Scanner;

public class Ex03 {
//8393번 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//문제 n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		
		// 입력  첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
		
		//출력 1부터 n까지 합을 출력한다.
		
		int num = sc.nextInt();
		int result = 0;
		for(int i = 1; i <= num; i++) {
			result = result + i;
			System.out.println(result);
		}
		

		
		sc.close();
	}

}
