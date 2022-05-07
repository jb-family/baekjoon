package com.baekjoon.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex04 {
	//문제 15552번
	public static void main(String[] args)throws IOException {
		//Buffered는 속도 빠르게 해줌
		//InputStreamReader, OutputStreamWriter는 번역기 생각하면 됨. 숫자->문자 문자->숫자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//System.in ->입력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();//br을 str에 담는다.
		int count = Integer.parseInt(str); // String -> int형으로 변환
		
		
		for(int i = 0; i < count; i++) { //StringTokenizer 클래스로 br.readLine()으로 입력된 값들을 " "으로 나눔.
			StringTokenizer stz = new StringTokenizer(br.readLine(), " ");	// str을 " " 공백을 기준으로 stz에 담는다. 
			bw.write( (Integer.parseInt(stz.nextToken()) + Integer.parseInt(stz.nextToken())) + "\n"); // stz에 쪼개진 str이 출력된다.
			
		}
		
		
		br.close();
		bw.flush();
		bw.close();
	}

}
