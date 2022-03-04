package string_stringbuffer;

class String_StringBuffers {
	public static void main(String[] args) {
		String str = new String();
		String str1 = str.concat("Durga");
		String str2 = str1.concat("Software");
		String str3 = str2.concat("Solutions");
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = sb.append("Durga");
		StringBuffer sb2 = sb1.append("Software");
		StringBuffer sb3 = sb2.append("solutions");
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println();
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);

	}
}