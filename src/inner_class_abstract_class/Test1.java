package inner_class_abstract_class;

abstract class A1 {
	class B1 {
		public void m1() {
			System.out.println("Inner class method m1()");
		}

		public void m2() {
			System.out.println("Inner class method m2()");
		}

		public void m3() {
			System.out.println("Inner class method m3()");
		}
	}
}

class C1 extends A1 {
	public void m() {
		System.out.println("sub class to outer class method m()");
	}
//Now this class C Becomes the sub class of A and the outer class to the Class B.

}

public class Test1 {

	public static void main(String[] args) {
//		A.B ab = new A().B(); we cannot create an object for the abstract class so we took another outer class C and then used an extends key word for this class C.
//		then this class becomes sub class to the class A and the outer class to the inner class B.
		A1.B1 ab = new C1().new B1();
		ab.m1();
		ab.m2();
		ab.m3();
//      ab.m(); still we cannot access the outer class members using the inner class ref variable.
	}

}
