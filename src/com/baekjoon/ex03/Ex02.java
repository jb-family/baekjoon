package com.baekjoon.ex03;

import java.util.Scanner;

public class Ex02 {
//10950번 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		//입력
		//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
		//출력 
		//각 테스트 케이스마다 A+B를 출력한다.
		int num = sc.nextInt();
		for(int i = 0; i < num; i++ ) {	//5번 반복
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			System.out.println(num1+num2);
			
		}
		
		sc.close();
	}

}
