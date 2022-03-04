package string_predefined_constructors_methods;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Using_String_Charset {

	public static void main(String[] args) throws UnsupportedEncodingException {
//		1.Using syntax:public String(byte[],Charset cs);
		byte[] b1 = { 65, 66, 67, 68, 69, 70 };
		String str1 = new String(b1, Charset.defaultCharset());
		System.out.println(str1);
		System.out.println();
//		2.Using syntax:public String(byte[],String CharsetName);
		String str2 = new String(b1, "UTF-16");// this charsetName is not supported.so we get ????
		String str3 = new String(b1, "UTF-8");
		System.out.println(str2);
		System.out.println();
//		3.Using syntax:public String(byte[],int start_index,int no_0f_elements,Charset cs);
		String str4 = new String(b1, 2, 3, Charset.defaultCharset());
		System.out.println(str4);
		System.out.println();
//	    4.Using syntax:public String(byte[],int start_index,int no_of_elements,String CharsetName);
		String str5 = new String(b1, 2, 2, "UTF-8");
		String str6 = new String(b1, 2, 2, "UTF-16");// not supported.
		System.out.println(str5);
		System.out.println(str6);
		System.out.println();
//		5.Using syntax: public String(char[],charset cs);
		char[] ch = { 'w', 'e', 'l', 'c', 'o', 'm', 'e' };
		String str7 = new String(ch, Charset.defaultCharset());
		System.out.println(str7);
//		Using syntax: public String(char[],start_index,no_of_elements,charset cs);
		String str8 = new String(ch, 2, 3, Charset.defaultCharset());
		System.out.println(str8);
//		Using syntax: public String(char[],String CharsetName);
		String str11 = new String(ch, "UTF-8");
		String str12 = new String(ch, "UTF-16");
//		Using syntax:public String (char[],start_index,no_of_elements,String charsetName);
		String str9 = new String(ch, 2, 3, "UTF-8");
		String str10 = new String(ch, 2, 3, "UTF-16");

	}

}
