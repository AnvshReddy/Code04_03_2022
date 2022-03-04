package wrapper_classes;

//String type to Object type Conversion:
class String_Type_Conversion {
	String str = "10";
// In this we can convert only the Numeric values of String.
//We cannot Convert ex."ABC" to int.
	Integer in = new Integer(str);
	Integer in1 = Integer.valueOf(str);

	public void m1() {
		System.out.println(in);
		System.out.println(in1);
	}

}

public class Test3 {

	public static void main(String[] args) {
		String_Type_Conversion stc = new String_Type_Conversion();
		stc.m1();
		System.out.println(stc.in);
		System.out.println(stc.in1);

	}

}
