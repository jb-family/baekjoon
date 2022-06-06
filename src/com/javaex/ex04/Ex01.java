package com.javaex.ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
//10818번 문제
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		int[] cArray = new int [count];	//count의 개수만큼 배열공간 생성
		
		
		
		
		for(int i = 0; i < cArray.length; i++) {
			cArray[i] = sc.nextInt();
		System.out.println(cArray[i]);
		
		}//for문 끝
		Arrays.sort(cArray);//오름차순정렬 메소드
		System.out.println(cArray[0] + " " + cArray[count-1]);
		
	}

}
