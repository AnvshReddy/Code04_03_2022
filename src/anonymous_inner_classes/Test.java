package anonymous_inner_classes;
//Anonymous Inner class for the abstract classes.

//Anonymous inner classes are used for the implementation of abstract methods only.where it can implement only the abstract methods,it doesnot allow the normal methods to declare inside the classes.
//even though we declare normal methods inside the anonymous inner classes we can't access it.
//Case 1: One way declaring the anonymous inner class inside the outer class.

//To access the methods we need to create the object for the outer class and the ref variable for anonymous inner class and the Methods calling.

abstract class A {
	public void m1() {
		System.out.println("abstract class method m1()");
	}

	public void m2() {
		System.out.println("abstract class method m2()");
	}

	abstract void m3();

	abstract void m4();
}

class B {
	A a = new A() {// this is not an object creation but it is a anonymous Inner class syntax.
		public void m3() {
			System.out.println("anonymous inner class method m3() Implementation");
		}

		public void m4() {
			System.out.println("anonymous Inner class method m4() Implementation");
		}

	};
}

public class Test {

	public static void main(String[] args) {
		B b = new B();
		b.a.m3();
		b.a.m1();
		b.a.m2();
		b.a.m4();

	}

}
