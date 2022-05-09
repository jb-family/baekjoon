package com.baekjoon.ex02;

import java.util.Scanner;

public class Ex06 {
//2525번 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int cookTime = sc.nextInt();
		int sum = minute + cookTime;
		if(minute < 60) {
			hour += (sum/60);
			
			if(hour>=24) {
				hour -= 24;
			}
			minute = sum - (60 * (sum / 60));
		}
		System.out.println(hour + " " + minute);

/*
 	Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	//시간
		int b = sc.nextInt();	//분
		int c = sc.nextInt();	//조리시간

		int sum = b+ c;	//조리시간 + 분
		
		// 가정) a = 12 b = 50 c = 20
		a += sum/60;
		//a는 sum의 몫만큼 증가한다.
		
		// a = a(12) + sum(70) / 60
		// 70으로 60을 나누면 몫이 1 120으로 60을 나누면 몫이 2
		// 그걸 a에 더한다. 그럼 시간이 증가됨.
		
		b += c - ( 60 * (sum/60) );		
		// b = b + c - ( 60 * ( sum/60 ) )
		// (70/60) 1 
		// 60 * 1 = 60 
		// b = 50 + 20 -60 => 10
		
		
		if(a >= 24) { // a가 24보다 크거나 같다면 a = a - 24
			a -= 24;
		}
		
		System.out.println(a + " " + b);
		
		
		sc.close();
 */
		
		sc.close();
	}

}





