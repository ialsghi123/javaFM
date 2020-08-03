package com.lec.array;

public class ArrayEx22 {

	public static void main(String[] args) {
		
		int[][] m1 = new int[][] 
				{{1,2,3},
				{4,5,6}};
	
		int[][] m2 = new int[][] 
				{{1,2},
				{3,4},
				{5,6}};
		
		int[][] m3 = new int[2][2];
				
		for(int i=0; i<m1.length; i++) {
			for(int j=0; j<m2.length; j++) {
				m3[i][j]=m1[i][j]*m2[j][i];
				
				System.out.println(m3[i][j]);
			}
		}
		
	}

}
