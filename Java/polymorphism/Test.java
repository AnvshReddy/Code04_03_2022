package polymorphism;
class A{
	  public void m1() {
		System.out.println("Class A Method Overriding");
	}
}
class B extends A{
	  public void m1() {
		System.out.println("Class B Method Overrideing");
	}
}
public class Test {

	public static void main(String[] args) {
		A a = new B();
		a.m1();

	}

}
