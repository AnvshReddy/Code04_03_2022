package user_defined_type_casting;
class A{
	A(int i){
		System.out.println("Mittapally Anvesh");
	}
	void m1() {
		System.out.println("Class A m1() - method");
		m2();
		m3();
	}
	int i = m2();
	int m2() {
		System.out.println("Instance Method appended to the Instance variable");
		return 30;
	}
	static int m3() {
		System.out.println("Static methods ");
		return 35;
	}
	static int j = m3();
	{
		System.out.println("Instance Block ");
	}
	static {
		System.out.println("Static Block");
	}
	}
	

	class B extends A {
		B(){
			super(10);
		}
		B b = new B();
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();
		
		void m5() {
			System.out.println("Class B M5  Method");
		}
		
	}

	class Upcasting {
		public static void main(String[] args) {
			B b  = new B();
			A a = b;
			a.m1();
			a.m1();
//			a.m5();
			b.m5();
			b.m1();
			b.m2();
			b.m3();
			
			
		
			
		}
	}
	
