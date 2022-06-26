package com.baekjoon.ex04;

import java.util.HashSet;
import java.util.Scanner;

//3052번 문제
public class Ex04 {

	public static void main(String[] args) {

		//출력 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> h = new HashSet<Integer>(); 
		
		for(int i = 0; i < 10; i++) {
			h.add(sc.nextInt() % 42);
		}
		System.out.println(h.size());
		
		
		sc.close();
	}

}
