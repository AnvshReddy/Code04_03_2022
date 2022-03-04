package string_buffer_constructors_methods;

//Different String_Buffer Methods.Including all the 98% of the String_methods as well.
public class String_Buffer_Methods {

	public static void main(String[] args) {
		// public String_Buffer append(String string);
		StringBuffer sb = new StringBuffer("Durga Software Solutions");
		StringBuffer sb1 = new StringBuffer("Durga");// where String_Buffer is mutable meaning the altered data is put
														// in the same object.
		StringBuffer sb2 = sb1.append("Software");
		StringBuffer sb3 = sb2.append("Solutions");
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println(sb1 == sb2);// true
		System.out.println(sb2 == sb3);// true
		System.out.println(sb1 == sb3);// true
		System.out.println();
		// public String_Buffer ensureCapacity(int capacity);
//		 if explicitly provided capacity is<16,it takes initial capacity as >16 plus the provided capacity,if >16,<34 it takes initial capacity as 34
		// if >34 takes 34 + provided capacity.

		StringBuffer sb4 = new StringBuffer();
		sb4.ensureCapacity(10);
		StringBuffer sb5 = new StringBuffer();
		sb5.ensureCapacity(20);
		StringBuffer sb6 = new StringBuffer();
		sb6.ensureCapacity(36);
		System.out.println(sb4.capacity());
		System.out.println(sb5.capacity());
		System.out.println(sb6.capacity());
		System.out.println();
		// public StringBuffer reverse();
		System.out.println(sb);
//		System.out.println(sb.reverse());
		System.out.println();
		// public StringBuffer delete(int start_index,int end_index);
		System.out.println(sb.delete(6, 14));// starting from index 6 to 14.
		// public stringBuffer insert(int start_index,String string);
		System.out.println(sb.insert(6, "Software"));// inserts at the specified index.

	}

}
