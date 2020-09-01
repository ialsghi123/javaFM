package com.minho.practice07_oop_02;

/*
 * 
[7-1] 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 섯
다카드 20장을 담는 SutdaCard배열을 초기화하시오. 단, 섯다카드는 1부터 10까지의 숫자
가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이
어야 한다. 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
 * 
 * 
[실행결과]
1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10, 
 */

//class SutdaDeck {
//	final int CARD_NUM = 20;
//	SutdaCard[] cards = new SutdaCard[CARD_NUM]; //SutdaCard는 SutdaDeck의 포함관계에 속한다
//
//	
//	SutdaDeck() {
//		
//		/*
//		(1) 배열 SutdaCard를 적절히 초기화 하시오.
//		*/
//		
//		int k=0;
//		
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<cards.length; j++ ) {
//				
////				cards[k++] = new SutdaCard(i+1,j);
//			}
//		}
//	}
//}
//
//class SutdaCard {
//	int num;
//	boolean isKwang;
//
//	SutdaCard() {
//		this(1, true);
//	}
//
//	SutdaCard(int num, boolean isKwang) {
//		this.num = num;
//		this.isKwang = isKwang;
//	}
//
//// info()대신 Object클래스의 toString()을 오버라이딩했다.
//	public String toString() {
//		return num + (isKwang ? "K" : "");
//	}
//}
//
//public class Method01 {
//	public static void main(String args[]) {
//		SutdaDeck deck = new SutdaDeck(); 
//		for (int i = 0; i < deck.cards.length; i++)
//			System.out.print(deck.cards[i] + ",");
//	}
//}