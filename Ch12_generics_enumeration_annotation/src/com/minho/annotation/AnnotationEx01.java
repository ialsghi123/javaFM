package com.minho.annotation;

public class AnnotationEx01 {

}

class Parent {
	void parentMethod() { }
}

class Child extends Parent {
	@Override
	void parentMethod() { } // 조상 메서드의 이름을 잘못적었음. 
}

