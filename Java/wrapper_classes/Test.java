package wrapper_classes;
//1.Primitive type to Object type conversion;
class Primitive_Type_Conversion {
	int i = 10;
	int j = 20;
	Integer in1 = new Integer(i);
	Integer in2 = new Integer(j);
	Integer in3 = Integer.valueOf(i);
	Integer in4 = Integer.valueOf(j);
	Integer in5 = i;
	Integer in6 = j;

	public void m1() {
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in3);
		System.out.println(in4);
		System.out.println(in5);
		System.out.println(in6);

	}
}

public class Test {

	public static void main(String[] args) {
		Primitive_Type_Conversion ptc = new Primitive_Type_Conversion();
		ptc.m1();
	}

}
