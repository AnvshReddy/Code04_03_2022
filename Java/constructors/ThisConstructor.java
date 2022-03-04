package constructors;

class Constructor4 {
	Constructor4(){
		System.out.println("zero parameter constructor");
	}
	Constructor4(int i) {
		this();
		System.out.println("This constructor1");
		System.out.println("this constructor1");
		System.out.println("this constructor2");
		System.out.println();
	}

	Constructor4(float f) {
		this(20);
		System.out.println("This Constructor2");
		System.out.println("this constructor 2");
		System.out.println("this constructor 2");
		System.out.println();
	}

}

public class ThisConstructor {

	public static void main(String[] args) {
		Constructor4 cons = new Constructor4(20.0f);
//		Constructor4 cons1 = new Constructor4(10);

	}

}
