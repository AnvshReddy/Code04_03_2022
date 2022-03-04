package wrapper_classes;
//Primitive type to String type conversion.
class Primitive_Type_Conversion1{
	int i = 10;
	String str =Integer.toString(i);
	String str1 = ""+i;
	public void m1() {
		System.out.println(str);
		System.out.println(str1);
	}
}
public class Test4 {

	public static void main(String[] args) {
		Primitive_Type_Conversion1 ptc1 = new Primitive_Type_Conversion1();
		System.out.println(ptc1.str);
		System.out.println(ptc1.str1);
		ptc1.m1();

	}

}
