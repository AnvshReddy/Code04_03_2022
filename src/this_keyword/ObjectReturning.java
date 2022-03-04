package this_keyword;

class Test {
	int i = 35;
	static int j = 45;
	Test getRef() {
		int i = 60;
		int j = 55;
		Test tes = new Test();
		System.out.println(tes);
		System.out.println(this.i);
		System.out.println(this.j);
		return tes;

	}

	Test getRef2() {
		return this;

	}
}

public class ObjectReturning {

	public static void main(String[] args) {
		Test tes = new Test();
		tes.getRef();
		System.out.println(tes);
		System.out.println();
//		System.out.println(tes.getRef());
//		System.out.println(tes.getRef());
//		System.out.println(tes.getRef());
		System.out.println();
		System.out.println(tes.getRef2());
		System.out.println(tes.getRef2());
		System.out.println(tes.getRef2());

	}

}
