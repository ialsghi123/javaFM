package com.my.java.practice04;


/*
 * 
 * 1���� 20������ ���� �߿��� 2�Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
 * 
 */
public class Practice04_02 {

	public static void main(String[] args) {	
		
		int sum=0;
		
		for(int i=1; i<=20; i++) {
			
			if(i%2==0 || i%3==0) {
				continue;
			}
			sum+=i;
			System.out.println(sum);
		}
		System.out.println("����:"+sum);
		
		
	}

}
