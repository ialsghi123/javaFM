package com.lec.practice05_array;


/*
 * 
a b c d e f g h i j k l m n o p q r s t
` ~ ! @ # $ % ^ & * ( ) - _ + = | [ ] { }
u v w x y z
; : , . /
 * 
 * 
 * 0 1 2 3 4 5 6 7 8 9
	q w e r t y u i o p
	
[실행결과]
src:abc123
result:`~!wer	
	
 */

public class ArrayPractice10 {

	public static void main(String[] args) {
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };
		String src = "abc123";
		String result = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			
			if(ch>='a' && ch<='z') {
				abcCode[i]=ch;
			} else {
				numCode[i]=ch;
			}
			
			
			
		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);
		// end of main

	}

}
