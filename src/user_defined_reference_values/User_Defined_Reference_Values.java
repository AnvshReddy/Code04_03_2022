package user_defined_reference_values;

public class User_Defined_Reference_Values {
	public static void main(String[] args) {
		Thread thr = new Thread();
// System.out.println(thr.toString());
		Exception e = new Exception("My own exception");
		String a = e.toString();
		System.out.println(e);
		System.out.println(e.toString());
		System.out.println();
//		Integer c = new Integer(10);
//		System.out.println(c);
		System.out.println();
		String str3 = new String();
		System.out.println(str3);

	}
}
