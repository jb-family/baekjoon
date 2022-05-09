package com.baekjoon.ex03;

import java.util.Scanner;

public class Ex10 {
//2439번 문제
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		String sum = " ";
		for(int i = 0; i < count; i++) {
			// 0 < 5 t
			// 1 < 5 t
			// 2 < 5 t
			// 3 < 5 t
			// 4 < 5 t 
			//5번 반복된다. (입력한 수 만큼)
			for(int j = 1; j < count-i; j++) {
				
				System.out.print(sum);
			}
			
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
			}//for문 끝
		
		

		
		
		sc.close();		
		
		}
	}		
		
		
		


