package com.minho.array;

public class ArrayEx06 {

	public static void main(String[] args) {
		
		//�ִ밪,�ּҰ� ���ϱ�
		
		int[] score= new int[] {20,30,40,10,95,5,130,99,70,55};
		
		int max=score[0];
		int min=score[0];
		
		for(int i=0; i<score.length-1; i++) {
			if(max<score[i+1]) {
				max=score[i+1];
			}
		}
		
		for(int i=0; i<score.length-1; i++) {
			if(min>score[i+1]) {
				min=score[i+1];
			}
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
	}

}
