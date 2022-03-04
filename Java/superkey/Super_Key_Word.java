package superkey;

class A {
	int i = 10;
	int j = 20;
	int k = 30;
	static {
		System.out.println("Only static Method");
	}

	void add() {
		System.out.println(i + j + k);
	 {
			System.out.println("Static Block Inside the Method");
		}
	}
}

 class B extends A {
		int i = 34;
		int j = 55;
		int k = 60;

		 public void substract() {
			int i = 100;
			int j= 20;
			int k = 10;
			System.out.println(super.i - super.j - super.k);
		}
		
	}



public class Super_Key_Word {

	public static void main(String[] args) {
A a = new B();
a.add();
	}
}


