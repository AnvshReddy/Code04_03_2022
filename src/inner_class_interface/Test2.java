package inner_class_interface;

//Interface inside the clases.
//By default all the inner classes inside the interfaces are "static".
//By default all the methods inside the interface are "public and abstract".
//By default all the variables inside the interfaces are "public static final".

interface I1 {
	class A1 {
		public void m1() {
			System.out.println("By default static Inner class method m1()");
		}

		public void m2() {
			System.out.println("By default static  Inner class method m2() ");
		}

		public static void m3() {
			System.out.println("By default static Inner class method m3()");
		}
	}
}

public class Test2 {

	public static void main(String[] args) {
		I1.A1 i1a1 = new I1.A1();
		i1a1.m1();
		i1a1.m2();
		i1a1.m3();
		I1.A1.m3();// By default all the classes inside the interfaces are static.so we can access
					// the static members using the class names.

	}

}
