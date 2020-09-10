package com.minho.java_01.java.lang_package;

import java.util.*; 

class StringTokenizerEx01 { 
	public static void main(String[] args){ 
		String source = "100,200,300,400";
		StringTokenizer st = new StringTokenizer(source, ",");

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	} // main의 끝
} 
