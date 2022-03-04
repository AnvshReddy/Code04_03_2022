package static_variables;

class Static_Variables {
	static int i = 10;
	int i1 = 20;

	void m1() {
		int j = 30;
		int i = 40;
		System.out.println("Addition:" + (i + j));
		System.out.println();
		System.out.println(this.i);
		System.out.println(i);
		System.out.println();
	}
}

public class StaticVariables {

	public static void main(String[] args) {
		Static_Variables sta = new Static_Variables();
		sta.m1();
		System.out.println(Static_Variables.i);
		System.out.println(sta.i);
		Static_Variables sta1 = null;
		System.out.println(sta1.i);
		System.out.println();
		System.out.println(sta1.i1); //
	}
}
