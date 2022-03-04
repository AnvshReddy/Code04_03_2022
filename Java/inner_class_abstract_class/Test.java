package inner_class_abstract_class;

//we can declare the abstract class as inner class inside the class.But the implementation for the abstract methods should be implemented inside the outer class.
class A {
	public void m() {
		System.out.println("Outer class method m()");
	}

	abstract class B {
		public void m1() {// we can declare a method with implementation and a method without
							// implementation in abstract class.
			System.out.println("Inner abstract class method m1()");
		}

		abstract void m2();

		abstract void m3();

		abstract void m4();

	}

	class C extends B {
		public void m2() {
			System.out.println("Abstract method m2()");
		}

		public void m3() {
			System.out.println("Abstract method m3()");
		}

		public void m4() {
			System.out.println("abstract method m4()");
		}

	}

}

public class Test {

	public static void main(String[] args) {
		A.B ab = new A().new C();
		ab.m1();
		ab.m2();
		ab.m3();
		ab.m4();
//		ab.m(); we cannot access outer class members using the inner class ref variable.

	}

}
