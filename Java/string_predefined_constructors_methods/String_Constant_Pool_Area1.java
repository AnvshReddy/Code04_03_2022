package string_predefined_constructors_methods;
//2.Constructor.

//Syntax: Public new String(String literal);where String Literal = "Mittapllly Anvesh".

public class String_Constant_Pool_Area1 {

	public static void main(String[] args) {
		String str1 = "Mittapally Anvesh";// Created in the string constent pool area.
		String str2 = new String("Mittapally Anvesh");// created in the heap memory.
		String str3 = new String("Mittapally Anvesh");// creates another object in the heap memory.
		System.out.println(str2 == str3);// false
		System.out.println(str1 == str2);// false
		System.out.println();

	}

}
