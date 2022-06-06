package com.javaex.ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
//2562번 문제
	public static void main(String[] args) {

	
		
		Scanner sc = new Scanner(System.in);
		
		int[] cArray = new int[9];	//배열생성 9개 공간
		for(int i = 0; i < cArray.length; i++) {
			int num = sc.nextInt();
			
			cArray[i] = num;
			
		}//for문 끝
		
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < cArray.length; i++) {
			
			if(cArray[i] > max) {
				max = cArray[i];
				index = i + 1;
			}
			
		}
		
		System.out.println(max);
		System.out.println(index);
		
	}

}
