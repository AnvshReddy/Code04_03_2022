package string_predefined_constructors_methods;
//String class byte[] Constructors:

//3.public String(byte[]b);where byte array contains the ASCII values.
//4.public String(byte[]b int_start_index,no_0f_elements);
//Above 3,4 constructors are used to convert the byte[] to String.

public class String_Class_Constructors3 {

	public static void main(String[] args) {
//3.
		byte[] b = { 65, 66, 67, 68, 69 };// byte array
		String str1 = new String(b);
		System.out.println(b);
		System.out.println(str1);// Here the ASCII values are converted to characters and combined as output.
		System.out.println();
//4.
		byte[] b1 = { 65, 66, 67, 68, 69 };
		String str2 = new String(b1, 4, 3);// Here 2 = Start_Index,3 = end_Index.if end_index or start_Index is more
											// than index_values we will get
											// the String_Index_out_of _Bounds-Exception
		System.out.println(str2);

	}

}
