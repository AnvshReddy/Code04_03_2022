package string_buffer_constructors_methods;

//Different Constructors in StringBuffer;
public class String_Buffer_Constructors {

	public static void main(String[] args) {
		StringBuffer sb3 = new StringBuffer(10);
		System.out.println(sb3.capacity());
		StringBuffer sb = new StringBuffer();// empty String_Buffer with initial capacity 16.
		System.out.println(sb.toString());// to string method from the object class is overridden in such a way to
											// return its own to string method.
		System.out.println(sb.hashCode());
		System.out.println(sb.capacity());
		StringBuffer sb1 = new StringBuffer(" ");
		System.out.println(sb1);
		System.out.println(sb1.capacity());// intital capacity 16 + 1(space is counted as the single capacity.
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println(sb2);
		System.out.println(sb2.capacity());// initial capacity is 16 + explicit capacity is 3 = total 19;
	}

}
