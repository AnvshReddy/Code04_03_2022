package instances;

public class InstanceMethods1 {

	public static void main(String[] args) {
		InstanceMethods insta = new InstanceMethods();
		System.out.println();
		System.out.println(insta);
		insta.m1();
		insta.m2();
		InstanceMethods insta1 = new InstanceMethods();
		System.out.println(insta1);
		insta1.m1();
		insta1.m2();
	}

}
