package inner_class_abstract_class;

//Declaring interface inside an abstract class
abstract class A4 {
	interface I4 {
		public void m1();

		public void m2();

		public void m3();

		public void m4();
	}

//	Interfce Implementation should be declared in the same outer class.
	class B4 implements I4 {
		public void m1() {
			System.out.println("method Implementation m1() of the Inner Interface");
		}

		public void m2() {
			System.out.println("mehtod Implementation m2() of the  Inner Interface");
		}

		public void m3() {
			System.out.println("method implementation m3() of the inner interface ");
		}

		public void m4() {
			System.out.println("methos IMplementation m4() of the Inner Interface.");
		}

	}

}

class D4 extends A4 {
	public void m() {
		System.out.println("sub class of the outer abstract class A4 and the outer class to the Interface.");
	}
}

public class Test4 {

	public static void main(String[] args) {
//		A4.I4 ai = new A4().new I4() we cannot create an object for the abstract class and the Interface.
		A4.I4 ai = new D4().new B4();
		ai.m1();
		ai.m2();
		ai.m3();
		ai.m4();
//        ai.m(); we cannot access the outer class members and the sub classes of the outer class members using the Inner class ref variable.
	}

}
