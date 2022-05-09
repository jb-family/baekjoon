package com.baekjoon.ex02;

import java.util.Scanner;

public class Ex05 {
//2884번 문제
	 public static void main(String[] args) {
		 
		 
		 
		 Scanner sc = new Scanner(System.in);
		 int h = sc.nextInt();
		 int m = sc.nextInt();
		 if( m < 45 ) {	// 분이 45보다 작다면 시간 -1 분 +15
		 	h--;
		 	m += 15;
		 	
		 	if(h < 0) {
		 		h = 23;
		 	}
		 	System.out.println(h + " " + m);
		 }else {
		 	System.out.println(h + " " + (m -45));
		 }


		 sc.close();

		 


    }
}
