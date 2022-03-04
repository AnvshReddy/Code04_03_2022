package abstract_classes_inheritance;
abstract class A {
	void m1() {
		System.out.println("Insatance Method");
	}

	abstract void m2();

	abstract void m3();

	abstract void m4();
}

abstract class B extends A {
	void m2() {
		System.out.println("Abstraction method Implementation");
	}

	void m3() {
		System.out.println("Abstraction method Implementation");
	}
}

class C extends B {
	void m4() {
		System.out.println("Class C Implentation");
	}
}

public class Test {

	public static void main(String[] args) {
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		c.m4();

	}

}
