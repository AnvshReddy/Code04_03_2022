package wrapper_classes;

//Object Type to String Type Conversion;
class Object_Type_Conversion1 {
	Integer in = new Integer(10);
	String str1 = in.toString();
	String str = "" + in;

	public void m1() {
		System.out.println(str);
		System.out.println(str1);
	}

}

public class Test2 {

	public static void main(String[] args) {
		Object_Type_Conversion1 otc1 = new Object_Type_Conversion1();
		System.out.println(otc1.str);
		System.out.println(otc1.str1);
		otc1.m1();

	}

}
