package string_predefined_constructors_methods;

public class String_Constant_Pool_Area {

	public static void main(String[] args) {
		String str1 = "Mittapally Anvesh";
		String str2 = "Mittapally Anvesh";// even the spaces are considered as the string.
		String str3 = "Mittapally anvesh";// Different form the above two values so differnt ref_variable will be
											// allocated.
		System.out.println(str1 == str2);// will return true because two references are same."==" will consider whether
											// two ref values are same or not but not he values inside it.
		System.out.println(str1 == str3);// will return false.
	}

}
