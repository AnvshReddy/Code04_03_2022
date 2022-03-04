package string_predefined_constructors_methods;
//Different methods in the String.

public class String_Predifined_Methods1 {

	public static void main(String[] args) {
		String str1 = new String("Durga Software Solutions");
		// public String(ref_var.StartsWith());
		System.out.println(str1.startsWith("Durga"));// returns true.
		System.out.println(str1.startsWith("durga"));// returns false.
		System.out.println(str1.startsWith("Solutions"));// returns false.
		System.out.println(str1.startsWith("Software"));// returns false.
		System.out.println();
		// public String(ref_var.endsWith());
		System.out.println(str1.endsWith("Solutions"));// true
		System.out.println(str1.endsWith("Software"));// false
		System.out.println(str1.endsWith("Durga"));// false
		System.out.println();
		// public String(ref_var.contains());
		System.out.println(str1.contains("Solutions"));// true
		System.out.println(str1.contains("Durga"));// true
		System.out.println(str1.contains("Software"));// true
		System.out.println(str1.contains("software"));// false
		System.out.println();
		// public String(ref_var.charAt('6'));
		System.out.println(str1.charAt(6));
//		System.out.println(str1.charAt(55));-->StringIndexOutOfBoundsException.
		System.out.println(str1.charAt(18));
		System.out.println();
		// public String(ref_var.replace("",""));//String replacement.
		System.out.println(str1.replace("Durga", "Anvesh"));
		System.out.println(str1.replace("Anvesh", "Durga"));
		System.out.println();
		// public String(ref_var.replace('',''));//character Replacement.
		// public String(ref_var.replacefirst('',''));
//		public String(ref_var.replaceAll('',''));
		System.out.println(str1.replace('D', 'd'));
		System.out.println(str1.replace("D", "d"));
		System.out.println(str1.replaceAll("S", "s"));// Is appliable to only strings.
		System.out.println(str1.replaceFirst("s", "S"));// Is applicable to only strings.
		System.out.println();
		// public string(ref_var.IndexOf(""));or
//		public String(ref_var.IndexOf(int ASCIIvalue ,from Index));
		// public String(ref_var.lastIndexOf(""));
		System.out.println(str1.indexOf("S"));// -->returns first encountered values ASCII value.
		System.out.println(str1.indexOf((int) 'S', 10));//from 10 th index .
		System.out.println(str1.lastIndexOf("S"));// returns last Index value.
		System.out.println(str1.indexOf("t"));// returns first encountered Index value of "t".
		System.out.println(str1.lastIndexOf("t"));// returns last Index value of "t".
		System.out.println();
		// public String(ref_var.substring(int start_index));
		// public String(ref_var.substring(int start_index,int end_index));
		System.out.println(str1.substring(6));// from start to remaining.
		System.out.println(str1.substring(7));
		System.out.println(str1.substring(6, 9));// including-6-->starts,9-1=including-8-->ends.
		System.out.println(str1.substring(6, 18));
		System.out.println();
//		 public byte[] getBytes();-->converts String into byte[],where byte[] contains
//		 ACSII values.
		byte[] b = str1.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]+"----->"+(char)b[i]);
		}
		// char[] getChar();-->converts String into char[],where char[] contains
		// individual characters.
		char[] ch = str1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
			System.out.println(ch[i] + "--------->" +(int)ch[i]);// characters pointing to the ASCII values.
			System.out.println();
		}
//		public String[] split(String str);
//		public String[] split(String delimiter,int attempts);
		String[] str12 = str1.split(" ");
		for (int i = 0; i < str12.length; i++) {
			System.out.println(str12[i]);
		}
		String[] str2 = str1.split(" ",2);// splitting the string based on the spaces.
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
			System.out.println();

		}
		String[] str3 = str1.split("S");// splitting the String based on the "S" character.
		for (int i = 0; i < str3.length; i++) {
			System.out.println(str3[i]);
			System.out.println();
		}
//		 public String trim();
//		public String tolowerCase();
//		public String toUpperCase();
		String str4 = new String(" Mittapally Anvesh Reddy ");
		String str5 = new String("mittapally anvesh reddy");
		System.out.println(str4.toLowerCase());
		System.out.println(str5.toLowerCase());
		System.out.println(str4.toUpperCase());
		System.out.println(str4);
		System.out.println(str4.trim());// removes spaces before and after the string.not in between the String.

	}

}
