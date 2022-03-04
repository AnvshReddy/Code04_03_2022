package static_inner_classes;

//Declaring Static inner class inside a class
class A {
	int j = 30;
	static int k = 45;

	static class B {
		static int i = 20;

		public static void m() {
//		System.out.println(j);-->Error. Here,we can acces only the Outer class static members we cant access the non-static members  
//		we can access the static members of the outer class directly.
//		In this static Inner classes static declarations are allowed directly.But Incase of member inner classes, we must declare final along with the staic key word.
			System.out.println(i);
			System.out.println(k);
		}

		public static void m1() {
			System.out.println("Static Inner class methos m1()");
		}

		public static void m2() {
			System.out.println("Static Inner class method m2()");
		}
	}

}

public class Test {

	public static void main(String[] args) {
		A.B ab = new A.B();
		ab.m1();
		ab.m2();
		A.B.m1();// we can access the static methods,variables directly with the class names but here the
					// inner classes is static so to access the static inner methods,variables we use the
					// OuterclassName.InnerclassName.method_name or variable_name;
		A.B.m2();
		System.out.println(A.B.i);
		A.B.m();
		

	}

}
