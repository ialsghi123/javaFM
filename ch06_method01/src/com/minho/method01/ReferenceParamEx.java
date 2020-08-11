package com.minho.method01;
/*
class Data {
	int x;
}
*/
public class ReferenceParamEx {

	public static void main(String[] args) {

		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);

		
		System.out.println(d);
	}

	static void change(Data d) { // 참조형 매개변수
		d.x = 1000;
		System.out.println(d);
		System.out.println("change() : x = " + d.x);

	}

}
