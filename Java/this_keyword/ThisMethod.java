package this_keyword;

import static java.lang.System.*;

class This_Method {
	int i = 10;
	static int j = 20;

	 void m1() {
		out.println("static method");
//		exit(0);
		out.println(j);
		This_Method the = new This_Method();
		out.println(the.getI());
		System.out.println(j);
		System.out.println(i);
		System.out.println(j);
//		This_Method the2 = new This_Method();
		System.out.println(i);

	}

	void m2() {
		out.println("Normal java method");
		out.println();
		this.m1();
		out.println();
//		m1();
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getI() {
		System.out.println("Testing");
		return i;
	}

}

public class ThisMethod {

	public static void main(String[] args) {
		This_Method the = new This_Method();
		the.m2();
		the.getI();
		This_Method the1 = null;
		out.println();
		the1.m1();
		out.println();
		the1.m2();
		the.setI(39);
//		the1.setI();
		System.out.println(the.getI());
//		System.out.println(i);j
		System.out.println(This_Method.j);
		System.out.println(the1.i);

		the.getI();
		the1.getI();
	}

}
