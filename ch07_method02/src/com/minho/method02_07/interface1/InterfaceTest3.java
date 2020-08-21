package com.minho.method02_07.interface1;

class InterfaceTest3 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(); 
	}
}

 class A {
    void methodA() {
          I i = InstanceManager.getInstance();
          System.out.println(i);
		  i.methodB();
		  System.out.println(i.toString()); // i로 Object클래스의 메서드 호출가능
     }
 }

 interface I {
      public abstract void methodB();
 }

 class B implements I {
     public void methodB() {
          System.out.println("methodB in B class");
     }

	  public String toString() { return "class B";}
 }

 class InstanceManager {
	public static I getInstance() {
		return new B();
	}
 }


