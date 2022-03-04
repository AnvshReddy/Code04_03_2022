package inner_classes;
//Member Inner classes 

class Outer_Class {
	int j = 20;
	int m;

	public void m1() {
//		System.out.println(m = i + j); error.inner class members are not available to outer classes.
	}

	class Inner_Class {
//		static int i = 10;---> member inner classes are not allowing static key word directly.
		static final int i = 10;// --->But static key word can be used along with the final key word in the member inner
								// classes.
		int k;

		public void m2() {

			System.out.println(k = i + j);// outer class members are available to inner classes.can use the outerclass
											// members.
		}
	}
}

public class Inner_Classes_Prototype {

	public static void main(String[] args) {
		Outer_Class outer = new Outer_Class();
		Outer_Class.Inner_Class inner = new Outer_Class().new Inner_Class();
		inner.m2();
//		inner.m1(); error cannot acces outer class members using inner class ref variable.
//		System.out.println(inner.j);error cannot accces outer class members using inner class ref variable.

	}

}
