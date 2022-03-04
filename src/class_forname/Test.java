package class_forname;

class ForName {
	static {

		System.out.println("Class loading ........");
	}

	ForName() {
		System.out.println("Object creating .........");
	}
}

public class Test {

	public static void main(String[] args) throws Exception {
		Class c = Class.forName("class_forname.ForName");
		System.out.println(c.getClass());
		System.out.println(c.getSuperclass());
		Object obj = c.newInstance();

	}

}
