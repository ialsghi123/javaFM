package com.minho.array;
/*
 *
 번호 국어 영어 수학 총점 평균 
=============================
  1  100  100  100  300 100.0
  2   20   20   20   60  20.0
  3   30   30   30   90  30.0
  4   40   40   40  120  40.0
  5   50   50   50  150  50.0
=============================
총점:240  240  240

 */
class ArrayEx19 {
	public static void main(String[] args) {
		 int[][] score = {
							{ 100, 100, 100}
							, { 20, 20, 20}
							, { 30, 30, 30}
							, { 40, 40, 40}
							, { 50, 50, 50}
						};
		// 과목별 총점
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;

	    System.out.println("번호 국어 영어 수학 총점 평균 ");
	    System.out.println("=============================");

	    int sum=0;
	    float avg=0;
	    
	    
	    
	    for(int i=0; i<score.length; i++) {
	    	for(int j=0; j<score[i].length; j++) {
	    		
	    		
	    		sum+=score[i][j];
	    		System.out.printf("%d %d %d %f",i+1,score[i],sum,avg);
	    	}
	    }

			
		

	    System.out.println("=============================");
	    System.out.printf("총점:%3d %4d %4d%n", korTotal, engTotal, mathTotal);
	}
}
