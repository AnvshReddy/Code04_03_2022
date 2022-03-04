package inner_classes_inheritance;
//Implemented all the 3 possibilities in this example.

class A3 {
	public void m() {
		System.out.println("outer class 'm' method");
	}

	class B3 extends A3 {
		int i = 10;

		public void m1() {
			System.out.println("Inner class1");
		}
	}
}

class C3 {
	class D3 extends A3 {
		static final int j = 20;

		public void m2() {
			System.out.println("inner class 2");
		}
	}
}

public class TestCase {

	public static void main(String[] args) {
		C3.D3 cd = new C3().new D3();
		System.out.println(cd.j);
		cd.m();
//		cd.m1(); even though we extends another outer class but we cannot access that outer class innner members.
		cd.m2();
//		System.out.println(cd.i); even though we extends another outer class but we cannot access that outer class innner members.

	}

}
