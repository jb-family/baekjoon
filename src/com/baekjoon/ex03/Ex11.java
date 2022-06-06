package com.baekjoon.ex03;

import java.util.Scanner;

public class Ex11 {
//10871번 문제
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int	a = sc.nextInt();	
			
			if(a < x) {			 
				System.out.print(a + " ");
			}
		}
		
		
		
	}

}
