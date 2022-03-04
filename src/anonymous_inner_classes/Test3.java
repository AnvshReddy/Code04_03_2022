package anonymous_inner_classes;
//Case1: Anonymous inner class for the interfaces.

interface I3 {
	public void m1();// By default all the methods inside the interface are "public static and
						// abstract".

	public void m2();

	public void m3();
}

class Outer {
	I3 i3 = new I3() {
		public void m1() {
			System.out.println("m1-AIC");
		}

		public void m2() {
			System.out.println("m2- AIC");
		}

		public void m3() {
			System.out.println("m3- AIC");
		}
		public void m4() {
			System.out.println("own Method inside the anonymous inner class");
		}

	};

}

public class Test3 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.i3.m1();
		outer.i3.m2();
		outer.i3.m3();
		//outer.i3.m4();-->Error.Can't access the method declared its own in the anonymous inner class.

	}

}
