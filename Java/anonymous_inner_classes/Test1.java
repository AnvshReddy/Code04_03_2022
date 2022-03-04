package anonymous_inner_classes;
//Case 2:
//Anonymous inner class. Instead of taking the anonymous inner class inside the outer class.
//we directly declared the anonymous inner class inside the main class and then there is no need of outer class ref variable.we can directly access  the methods of abstract class with the anonymous inner class ref variable.
abstract class A1 {
	public void m1() {
		System.out.println("Abstract class method m1()");
	}

	public abstract void m2();

	public abstract void m3();

	public abstract void m4();
}

public class Test1 {

	public static void main(String[] args) {
		A1 a = new A1() {
			public void m2() {
				System.out.println("anonymous inner class method m2()");
			}

			public void m3() {
				System.out.println("anonymous inner class method m3()");
			}

			public void m4() {
				System.out.println("anonymous inner class method m4()");
			}
		};
		a.m1();// Here is there is no need of the outer class ref variable or the outer
				// class.we can directly access the methods using the anonymous inner class ref
				// variable.
		a.m2();
		a.m3();
		a.m4();

	}

}
