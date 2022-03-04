package returning_current_class_objects;
class ReturningObjects {
	ReturningObjects getRef1() {
		ReturningObjects ret = new ReturningObjects();
		return ret;
	}

	ReturningObjects getRef2() {
		return this;

	}
}

public class Returning_Objects {

	public static void main(String[] args) {
		ReturningObjects ret = new ReturningObjects();
		ret.getRef1();
		System.out.println(ret);
		System.out.println();
		System.out.println(ret.getRef1());
		System.out.println();
		System.out.println(ret.getRef1());
		System.out.println();
		System.out.println(ret.getRef1());
		System.out.println();
		System.out.println(ret.getRef2());
		System.out.println(ret.getRef2());
		System.out.println(ret.getRef2());
	}

}
