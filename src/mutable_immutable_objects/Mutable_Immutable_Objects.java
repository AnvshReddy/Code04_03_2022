package mutable_immutable_objects;

public class Mutable_Immutable_Objects {

	public static void main(String[] args) {
		String str = new String();
		String str1 = str.concat("Mittapally");
		String str2 = str1.concat("anvesh");
		String str3 = str2.concat("Reddy");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println();
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = sb.append("anvesh");
		StringBuffer sb2 = sb1.append("Reddy");
		StringBuffer sb3 = sb2.append("Mittapally");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
	}

}
