package class_for_name_method;

class Test {
	static {
		System.out.println("class loading.......");
	}

	 {
		System.out.println("Object creating........");
	}
}

public class ClassForNameMethod {

	public static void main(String[] args)
			throws ClassNotFoundException, IllegalAccessException, InstantiationException {
		Class c = Class.forName("class_for_name_method.Test");
		Object obj = c.newInstance();
	}

}
