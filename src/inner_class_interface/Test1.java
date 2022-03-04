package inner_class_interface;

//For the static Inner classes only the static members of the outer class are available to the Inner class but in the member inner classes all the outer class members are available to the Inner classes.
//Here In the static Inner classes concept which is diferent from the memeber inner classes.we have to create a constructor for the Inner Implementation class.
interface A1 {
	int i = 20;

	public void m();

	interface I1 {
		public void m1();

		public void m2();

		public void m3();

		public void m4();
	}

//	Interface Implentation should be declared in the same outer class or outer Interface or outer abstract class.
	class B1 implements I1 { // By default the implementation class of the inner interface is static.
		public void m1() {
			System.out.println("Inner Interface Implementation m1()");
		}

		public void m2() {
			System.out.println("Inner Interface Implementation m2()");
		}

		public void m3() {
			System.out.println("Inner Interface Implementation m3()");
		}

		public void m4() {
			System.out.println("Inner Inerface Implementation m4() ");
		}

		public static void m5() {
			System.out.println("Inner interface Static method m5()");
		}

	}
}

class C1 implements A1 {
	public void m() {
		System.out.println("outer Interface Implementation m()");

	}
}

public class Test1 {

	public static void main(String[] args) {
		A1.I1 ai1 = new A1.B1();// Here we can see the difference between the Member Inner class and the static
								// Inner classes
		ai1.m1();
		ai1.m2();
		ai1.m3();
		ai1.m4();
		A1.B1.m5();// Inner Inteface static method.Here Inner Implementation class and the method
					// m5(),are static.so we use "outer.Inner.method"to access the staic inner class
					// and the ststic method().
		System.out.println(A1.i);// we can access static members using the class names directly without creating
									// the objects.

	}

}
