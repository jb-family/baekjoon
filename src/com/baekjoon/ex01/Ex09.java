package com.baekjoon.ex01;

import java.util.Scanner;

import javax.lang.model.type.PrimitiveType;

public class Ex09 {
//2588번 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//472 385
		//2360 3776 1416 181720
		char c;
		int a = sc.nextInt();
		int b = sc.nextInt();	
		//1의 자리계산	385 % 10 = 나머지 5 (385의 1의자리는 5)
		//10의 자리계산 (385 % 100) / 10 = 몫 8 (385의 10의자리는 8)
		//100의 자리계산 385 / 100 = 몫 3 (385의 100의자리 3)
		
		System.out.println(a * (b % 10));
		System.out.println(a * ((b % 100)/10));
		System.out.println(a * (b / 100));
		System.out.println(a * b);
		
		
		
		sc.close();
		
	}

}
