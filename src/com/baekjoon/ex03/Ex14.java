package com.baekjoon.ex03;

import java.util.Scanner;

public class Ex14 {
//1110번 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		
		while(true) {
			int firstN = temp / 10; // 두번째자리수 구하기 2
			int secondN = temp % 10; // 두번째자리수 구하기 6
			
			temp = (secondN * 10) + (firstN + secondN) % 10;
			count++;
			
				if(num == temp) {
					break;
				}//if문 끝
		}//while문 끝 
		System.out.println(count);
		
	}

}
