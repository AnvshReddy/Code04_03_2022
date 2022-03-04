package inner_class_abstract_class;

//Declaring  an abstract class inside the abstract class.
class A2 {
	abstract class B2 {
		public void m1() {
			System.out.println("Inner abstract class method m1()");
		}

		abstract void m2();

		abstract void m3();

		abstract void m4();
	}

//	Implemented all the abstract methods in the same outer class.
	class C2 extends B2 {
		public void m2() {
			System.out.println("Inner class abstract method m2() Implementation");
		}

		public void m3() {
			System.out.println("Inner class abstract method m3() Implementation ");
		}

		public void m4() {
			System.out.println("Inner class abstract method m4() Implementation.");
		}
	}

}

class D2 extends A2 {
	public void m() {
		System.out.println("sub class to the Outer  abstract class and the Outer class to the Inner abstract classes");
	}
}

public class Test2 {

	public static void main(String[] args) {
//		Here we created the Objects for the sub class of the outer class and the Implementation class of the inner class Because we cannot create an objects for the abstract classes.
		A2.B2 ab2 = new D2().new C2();
		ab2.m1();
		ab2.m2();
		ab2.m3();
		ab2.m4();
//		ab2.m();Error -> Cannot access the Outer class members using the inner class ref variable.

	}

}
