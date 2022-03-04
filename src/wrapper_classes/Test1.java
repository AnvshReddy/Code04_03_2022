package wrapper_classes;

//2.Converting from Object Type to Primitive Type;
class Object_Type_Conversion {
	Integer in = new Integer(10);// Object Type
	int in1 = in.intValue();
	int in2 = in;

	public void m1() {
		System.out.println(in1);
		System.out.println(in2);
	}
}

public class Test1 {

	public static void main(String[] args) {
		Object_Type_Conversion otc = new Object_Type_Conversion();
		otc.m1();
	}

}
