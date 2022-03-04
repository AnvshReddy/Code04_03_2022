package inner_class_interface;
//Decalaring an abstract inside the Interface.
interface I3{
	abstract class A3{
		public void m1() {
			System.out.println("Inner abstract class method m1()");
		}
		public void m2() {
			System.out.println("Inner abstract class method m2()");
		}
		public abstract void m3();
		public abstract void m4();
	}
	class B3 extends A3{//---->By default it is Static class.
//	By default the Implementation class of the abstract class is static beacause it is inside the interface.
		public void m3() {
			System.out.println("Implementation method m3() for the Inner abstract class");
		}
		public void m4() {
			System.out.println("Implementation method m4() for the Inner abstract class");
		}
		public static void m5() {
			System.out.println("Static method inside the Implementation class of the abstract class");
		}
	}
}
public class Test3 {

	public static void main(String[] args) {
		I3.B3 i3b3 = new I3.B3();
		i3b3.m1();
		i3b3.m2();
		i3b3.m3();
		I3.B3.m5();//we can access the static methods directly using the class name.Here B3 is also bydefault static.

	}

}
