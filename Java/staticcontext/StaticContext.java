package staticcontext;

public class StaticContext {
	static int m1() {
		System.out.println("first static method");
		System.out.println();
		return 20;
	}

	static {
		System.out.println("first static block");
		System.out.println("second static block");
		System.out.println("third static Block");
		System.out.println();
	}
	static int i = m1();

	StaticContext() {
		System.out.println("first Instance context Constructor");
		System.out.println("second Instance context Constructor");
		System.out.println();
	}

	int j = m1();

	int m2() {
		System.out.println("first instance context ");
		System.out.println("second instance context");
		System.out.println();
		StaticContext.m1();
		return 30;

	}

	{
		System.out.println("first Instance Block");
		System.out.println("Second Instance Block");
		System.out.println();
	}

}

class StaticContext1 extends StaticContext {
	static {
		System.out.println("----------------------");
	}
	StaticContext1() {
		System.out.println("Inner Class Static Constructor1");
		System.out.println("Inner Class Static Constructor2");
		System.out.println();
		StaticContext.m1();
	}
}