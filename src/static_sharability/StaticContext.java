package static_sharability;

class StaticContext1 {
	static void m1() {
		System.out.println("Static Method 1");
		System.out.println("Static Method 1");
	}

	{
		System.out.println("Instance Block");
	}
	static int i = m2();
	static {
		System.out.println("Static Block");
	}

	static int m2() {
		System.out.println("static method 2");
		System.out.println("static method 2");
		m1();
		return 20;
	}

}

public class StaticContext {

	public static void main(String[] args) {
		StaticContext1 sta = new StaticContext1();
//		System.out.println();
//		System.out.println(StaticContext1.i);
//		StaticContext1 sta1 = new StaticContext1();

	}

}
