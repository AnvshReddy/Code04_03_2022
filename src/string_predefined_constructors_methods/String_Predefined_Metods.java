package string_predefined_constructors_methods;

//length() is used to find the size in the String.
//length variable is used to find the size in the array
//concatination() is used to concat various Strings.
//equals() in string  over riden in such a way that it is used to find the same content in different objects.
// "==" is used to find the different ref_variables are pointing the same object or not.
//equals() other than string is same as the "==".
//equalsIgnoreCase();-->it ignores case sensitive values.
//compareto();-->it comes the values assigned to ref_variables in the dictionary order.
public class String_Predefined_Metods {

	public static void main(String[] args) {
		String str1 = new String("Durga Software Solutions");
		char[] ch = { 'w', 'e', 'l', 'c', 'o', 'm', 'e' };
		System.out.println(str1.length());// length ();
		System.out.println();

		System.out.println(ch.length);// length variable.
		System.out.println();

		String str2 = new String("Mittapally");// Concatination method where conacatination will be performed on the
												// Data but not on the object.
		String str3 = str2.concat("Anvesh");
		String str4 = str3.concat("Reddy");
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();

		String str5 = "Mittapally".concat("Anvesh").concat("Reddy");
		String str6 = "Mittapally" + "Anvesh" + "Reddy";
		String str7 = str5.concat("Ibrahimpatnam");
		String str8 = "Mittapally";
		String str9 = "Anvesh";
		String str10 = "Reddy";
		String str101 = "Mittapally";
		String str102 = "mittapally";
		String str11 = str8 + str9 + str10;
		System.out.println(str11);
		System.out.println(str11 == str5);
		System.out.println(str11 == str6);
		System.out.println(str5.equals(str6));// true
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str5 == str6);// false
		System.out.println(str7);
		System.out.println(str6 == str5);

		System.out.println();
		String str12 = new String("Mittapally anvesh Reddy");
		String str13 = str12.concat("");
		System.out.println(str12);
		System.out.println(str13);
		System.out.println(str12 == str13);
		System.out.println();
		// both str12,str13 are pointing to the same Object.Because in string
		// constant pool area there is no change in the content eventhough we concat
		// str12,str13.Hence returns true.
		String str14 = str12.concat(" ");
		System.out.println(str12 == str14);// Now the space is added in the concatination.Hence returns false.
		System.out.println();

		System.out.println(str8.equals(str9));
		System.out.println(str8.equals(str10));
		System.out.println(str8.equals(str101));
		System.out.println();
		// equals() will check the content of the string Object.if same returms
		// true,if not returns false.
		System.out.println(str8.equalsIgnoreCase(str9));
		System.out.println(str101.equalsIgnoreCase(str102));// will returns true it ignores case sensitive values.
		System.out.println(str101.equals(str102));
		System.out.println();

		String string = new String("abc");
		String string1 = new String("def");
		String string2 = new String("abc");
		System.out.println(string.compareTo(string1));// "abc" comes first when compared to "def" in dictionary order
														// hence returns negative value.
		System.out.println(string.compareTo(string2));// "abc","abc" both are equal.so 0 value.
		System.out.println(string1.compareTo(string2));// "def" comes last compared to "abc" so retuns positive value.
		System.out.println();

		String string3 = new String("abc");
		String string4 = new String("ABC");
		System.out.println(string3.compareTo(string4));// Here "ABC"comes first when compared to "abc hence positive
														// value.
		System.out.println(string4.compareTo(string3));// returns negative value.
		System.out.println(string3.compareToIgnoreCase(string4));// ) value because both are same in the
																	// compareToIgnoreCase().it ignore case sensitive
																	// values.
		System.out.println(string3.compareToIgnoreCase(string4));// value because both are same in
																	// thecompareToIgnoreCase().it ignore case sensitive
																	// values.
		System.out.println(str101.compareToIgnoreCase(str102));//both the values are same in the CompareToIgnoreCase Method.
	    System.out.println(string1.compareToIgnoreCase(string2));//positive 
	    System.out.println(string2.compareToIgnoreCase(string1));//negative.
	}
}