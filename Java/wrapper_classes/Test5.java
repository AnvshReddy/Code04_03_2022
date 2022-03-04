package wrapper_classes;
class String_Type_Conversion1{
	String str = "10";
	int in = Integer.parseInt(str);
	public void m1() {
		System.out.println(in);
	}
	
}
public class Test5 {

	public static void main(String[] args) {
		String_Type_Conversion1 stc1 = new String_Type_Conversion1();
		stc1.m1();
		System.out.println(stc1.in);

	}

}
