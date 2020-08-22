package com.minho.practice04_flow;

/*
 * 
 * 1+(-2)+3+(-4)+... �� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������
100�̻��� �Ǵ��� ���Ͻÿ�. 
 * Ȧ���� + ¦���� -
 */

public class Practice04_04 {

	public static void main(String[] args) {
		
		int count=0;
		int sum=0;
		int i=1;
		int j=-2;
		
		while(true) {
			
			
			sum=i+j;
			
			i=i+2;
			j=j-2;
			count++;
			if(sum>=100) {
				
				break;
			}
			
		}
		System.out.println("count:"+count);
	}

}
