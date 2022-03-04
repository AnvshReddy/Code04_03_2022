abstract class Consumers  {
	int x = 10;
	int y = 20;

	public void ConsumerDetails() {
		System.out.println("First Abstract class in the Eclipse");
		System.out.println("Second Abstract class in the Eclipse");
	}

	void ConsumerDetails1() {
		System.out.println("Third Abstract class in the Eclipse");
		System.out.println("Fourth Abstract class in the Eclipse");
		System.out.println("Fifth Abstract class in the Eclipse");
	}

	abstract void ConsumerDetails2();

	abstract void ConsumerDetails3();

	abstract void ConsumerDetails4();
}

class Merchant extends Consumers {
	void ConsumerDetails2() {
		System.out.println("ConsumerDetails2 Implementation1");
		System.out.println("ConsumerDetails2 Implementation 2");
		System.out.println("ConsumerDetails2 Implementation 3");
	}

	void ConsumerDetails3() {
		System.out.println("ConsumerDetails3 Implementation1");
		System.out.println("ConsumerDetails3 Implementation2");
		System.out.println("ConsumerDetails3 Implementation3");
		System.out.println("ConsumerDetails3 Implementation4");
	}

	void ConsumerDetails4() {
		System.out.println("ConsumerDetails4 Implementation1");
		System.out.println("ConsumerDetails4 Implementation2");
		System.out.println("ConsumerDetails4 Implementation3");
		System.out.println("ConsumerDetails4 Implementation4");
	}

	void ConsumerDetails5() {
		System.out.println("InnerClass Method Only");
		System.out.println("Only InnerClass Methods");
	}
}
