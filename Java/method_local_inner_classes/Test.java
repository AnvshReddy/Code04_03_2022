package method_local_inner_classes;
//Method local Inner class --> Class inside a method call as Method Local Inner Class and the scope of that class is upto that method only.

class A {
	public void m1() {
		class B {// this class scope is available is upto this mehtod only which means if we
					// donot access this method this inner class can't be used.
			int i = 20;

			public void m2() {
				System.out.println("method local inner class method m2()");
			}

			public void m3() {
				System.out.println("method local inner class method m3()");
			}
		}
		B b = new B();// Here we must create the object for the method local inner class inside the
						// method only to acces the remaining methods.
		b.m2();
		b.m3();
		System.out.println(b.i);
	}
}

public class Test {

	public static void main(String[] args) {
		A a = new A();
		a.m1();

	}

}
