package string_predefined_constructors_methods;
//Creating empty string using the constructors.
//syntax:public String();

public class Test {

	public static void main(String[] args) {
		String str = new String();// Empty string is created.
		System.out.println(str);
//	  Overriding the object class toString method.
		System.out.println(str.hashCode());// we wont get any hash code value as well.
	}

}
