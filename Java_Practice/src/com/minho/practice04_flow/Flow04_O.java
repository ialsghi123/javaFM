package com.minho.practice04_flow;



public class Flow04_O {

	public static void main(String[] args) {
		/*
		 * [4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이
		100이상이 되는지 구하시오.
		 * 
		 * 
		 */

		int sum=0;
		int s=1;
		int count=0;
		
		for(int i=1; true; i++,s=-s) {
			
			int num=i*s;
			sum+=num;
			count++;
			
			if(sum>=100) {
				System.out.println(count);
				break;
			}
			
		}
		
		
	}

}
