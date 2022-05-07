package com.baekjoon.ex02;

import java.util.Scanner;

//2480번 문제
public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//문제
		//같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 			 클리어
		//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
		//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
		
		//입력
		//첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
		
		//출력
		//첫째 줄에 게임의 상금을 출력 한다.
		//3 3 6 -> 1300 
		//2 2 2 -> 12000
		//6 2 5 -> 600
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		if(a == b && b == c && a == c) {	//a b c 가 모두 같다면
			a = 10000 + (a * 1000);
			System.out.println(a);
		}
		else if( a == b || b == c || a == c ) {	//a와 b가 같거나 b와 c가 같거나 a와 c가 같다면
			if(a == b) {
				System.out.println(a = 1000 + (a * 100));
			}else if(a == c) {
				System.out.println(c = 1000 + (c * 100));
			}else if(b == c) {
				System.out.println(b = 1000 + (b * 100));
			}
		}
		else if(a != b && a != c && b != c) {	//a b c 모두 다르다면
			if(a > b && a > c) { // a가 b보다 크거나 a가 c보다 크다면
				a = a * 100;
				System.out.println(a);
			}else if(b > a && b > c) {// b가 a보다 크거나 b가 c보다 크다면
				b = b * 100;
				System.out.println(b);
			}else if(c > a && c > b) {
				c = c * 100;
				System.out.println(c);
			}
		}
		
		
		
		sc.close();
	}

}
