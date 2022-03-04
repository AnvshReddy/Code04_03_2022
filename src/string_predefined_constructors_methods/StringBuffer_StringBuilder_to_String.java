package string_predefined_constructors_methods;

//1.Converting StringBuffer_to_String;
//Converting StringBuilder to String;
public class StringBuffer_StringBuilder_to_String {

	public static void main(String[] args) {
//1.Converting StringBuffer to String.or Mutable object to Immutable object.
		StringBuffer sb = new StringBuffer("StringBufferObject");
		System.out.println(sb);
		String Str1 = new String(sb);//
		System.out.println(Str1);
		System.out.println();
//2.Converting StringBuilder to String.
		StringBuilder sb1 = new StringBuilder("StringBuilderObject");
		System.out.println(sb1);
		String str2 = new String(sb1);
		System.out.println(str2);

	}

}
