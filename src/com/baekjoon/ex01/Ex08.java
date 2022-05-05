package com.baekjoon.ex01;

import java.util.Scanner;
//10430번문제
public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if( (a+b)%c == ((a%c)+(b%c))%c && (a*b)%c == ((a%c)*(b%c))%c ) {
			System.out.println((a+b)%c);
			System.out.println(((a%c) + (b%c))%c);
			System.out.println((a*b)%c);
			System.out.println(((a%c) * (b%c))%c);
		}
		
		
		
	}

}
