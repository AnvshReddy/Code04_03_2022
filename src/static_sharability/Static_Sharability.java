package static_sharability;

class StaticSharability {
	static int i = 10;
	int j = 10;
}

public class Static_Sharability {

	public static void main(String[] args) {
		StaticSharability sta = new StaticSharability();
		System.out.println(sta.i+"    "+sta.j);
		sta.i = sta.i + 1;
		sta.j = sta.j + 1;
		System.out.println(sta.i + "     " + sta.j);
		System.out.println();

		StaticSharability sta1 = new StaticSharability();
		System.out.println(sta1.i + "     " + sta1.j);
		System.out.println();
		sta1.i = sta.i + 1;
		sta1.j = sta1.j + 1;
		System.out.println();
		System.out.println(sta.i + "      " + sta.j);
		System.out.println(sta1.i + "      " + sta1.j);
		System.out.println();

		StaticSharability sta2 = new StaticSharability();
		System.out.println(sta2.i + "    " + sta2.j);
		sta2.i = sta2.i + 1;
		sta2.j = sta2.j + 1;
		System.out.println();
		System.out.println(sta1.i + "   " + sta1.j);
		System.out.println(sta2.i + "   " + sta2.j);
		System.out.println(sta.i + "   " + sta.j);
	
	}
}