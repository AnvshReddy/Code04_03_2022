package string_predefined_constructors_methods;
//String class will return its own data Provided.

//syntax:public String(String_Data);

class A {// we can override the toString() method in the Object class.so it will return
			// the class 'A' method value.
	public String toString() {
		return "Anvesh";

	}
}

public class Providing_String_as_Data {

	public static void main(String[] args) {
		String str = new String("Durga Software Solutions");
		System.out.println(str);
		System.out.println(str.toString());// toString method is overidden in string class in such a way to written the
											// provided string class Data.
		System.out.println(str.hashCode());
		System.out.println();

		A a = new A();// But Normal class will return the Object class defined methods if we wont
						// override the object class method.
		System.out.println(a);
		System.out.println(a.toString());// Here class "A" overridded the Object class toString().so it will return its
											// own value.
		System.out.println(a.hashCode());// hashCode_value.
	}

}
