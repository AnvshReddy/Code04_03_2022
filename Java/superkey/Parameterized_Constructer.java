package superkey;

class First {
	int i = 20;
	int j = 30;

	First() {
		System.out.println("Zero Argument Constructor");
	}

	First(int ... i) {
		System.out.println("Parameterized Constructor");
	}
}

class Second extends First {
	int i = 45;
	int j = 44;

	Second( ) {
		super(20,30,40,50);
		System.out.println("Second Constructor");
	}

}

public class Parameterized_Constructer {

	public static void main(String[] args) {
		Second sec = new Second();
		System.out.println(sec);

	}

}
