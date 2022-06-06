package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {
	//2577번 문제
	public static void main(String[] args) {
		
		//입력
		//150
		//266
		//427
		
		//출력
		//3 0 출력개수
		
		//1	1 출력개수
		//0 2 출력개수
		//2 3 출력개수
		//0 4 출력개수
		//0 5 출력개수
		//0 6 출력개수
		//2 7 출력개수
		//0 8 출력개수 
		//0 9 출력개수
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a * b * c;
		
		
		String sumArray = Integer.toString(sum);// 숫자 -> 문자열 변환
		
		
		for(int i = 0; i < 10; i++) {//10번 반복
			int index = 0;
			
			for(int j = 0; j < sumArray.length(); j++) {//8번 반복
				
				if((sumArray.charAt(j) - '0') == i) {
					//17037300
					//sumArray.charAt(0) ~ (7)까지 반복
					//sumArray.charAt(0) == 1
					//sumArray.charAt(1) == 7
					//sumArray.charAt(2) == 0
					//sumArray.charAt(3) == 3
					//sumArray.charAt(4) == 7
					//sumArray.charAt(5) == 3
					//sumArray.charAt(6) == 0
					//sumArray.charAt(7) == 0
					index++;
				}
			}
			System.out.println(index);
		}//for문 끝
		
		
		
		
		
		
		/*
		 int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum = a * b * c;
		int index = 0;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		int a7 = 0;
		int a8 = 0;
		int a9 = 0;
		
		String sumArray = String.valueOf(sum);// 숫자 -> 문자열 변환
		
		char[] charArray = sumArray.toCharArray();	// 문자열 -> 문자로 변환하여 문자 배열로 저장
		
		for(int i = 0; i < charArray.length; i++) {
			
			if(charArray[i] == '0') {
				index++;
			}else if(charArray[i] == '1') {
				a1++;
			}else if(charArray[i] == '2') {
				a2++;
			}else if(charArray[i] == '3') {
				a3++;
			}else if(charArray[i] == '4') {
				a4++;
			}else if(charArray[i] == '5') {
				a5++;
			}else if(charArray[i] == '6') {
				a6++;
			}else if(charArray[i] == '7') {
				a7++;
			}else if(charArray[i] == '8') {
				a8++;
			}else if(charArray[i] == '9') {
				a9++;
			}
		
		}//for문 끝
		System.out.println(index);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		System.out.println(a9);
		
		*/
		
	}

}
