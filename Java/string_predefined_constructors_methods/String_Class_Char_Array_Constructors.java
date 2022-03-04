package string_predefined_constructors_methods;
//string_class char[] constructors.

//1.public String(char[]);--->constructor.
//2.public String(char[],start_of_index,no_of_elements);

public class String_Class_Char_Array_Constructors {

	public static void main(String[] args) {
//		1.
		char[] c1 = { 'a', 'b', 'c', 'd', 'e' };// Converting char []c1 to String type.
		String str1 = new String(c1);
		System.out.println(str1);

		System.out.println();
//		2.
		char[] c2 = { 'a', 'b', 'c', 'd' };
		String str2 = new String(c2, 2, 2);// If we pass start_index or the no_of_elements value more than the index value we
											// will get the
											// StringIndexOutOfBoundsException.
		System.out.println(str2);
	}

}
