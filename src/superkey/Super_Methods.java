package superkey;
class A1{
	void m1() {
		System.out.println("A1 - m1 method");
	}
}
class B1 extends A1{
	void m2() {
		System.out.println("class B1 M2 method");
		m1();
		this.m1();
		super.m1();
	}

	
	void m1() {
		System.out.println("class B1 M1 method");
	}
}

public class Super_Methods {

	public static void main(String[] args) {
		B1 b = new B1();
		b.m2();
		

	}

}
