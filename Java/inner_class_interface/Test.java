package inner_class_interface;
//We can declare an interface inside the class but the interface implementation class should be in the same outer class.  
class A{
	public void m() {
		System.out.println("outer class method");
	}
	interface I{
		public void m1();
		public void m2();
		public void m3();
		public void m4();
		
	}
	class B implements I{
		public void m1(){
			System.out.println("Interface method m1()");
		}
		public void m2() {
			System.out.println("Interface method m2()");
		}
		public void m3() {
			System.out.println("Interface method m3()");
		}
		public void m4() {
			System.out.println("Interface method m4()");
		}
	}
}
public class Test {

	public static void main(String[] args) {
		A.I ai = new A().new B();//Here we cannot create an object for Interfaces.so we have created it for the implementation class.
        ai.m1();
        ai.m2();
        ai.m3();
        ai.m4();
//        ai.m();---->we cannot access an outer class method using Inner class ref variable.
	}

}
