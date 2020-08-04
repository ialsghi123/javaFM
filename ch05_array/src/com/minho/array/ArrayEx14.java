package com.minho.array;

public class ArrayEx14 {

	public static void main(String[] args) {
		
		String str = "ABCDE";
		
		char ch;
		
		for(int i=0; i<str.length(); i++) {
			ch=str.charAt(i);
			System.out.println("str.charAt("+i+"):"+ch);
		}
		
		char[] chArr=str.toCharArray();
	
		System.out.println(chArr);
	}

}
