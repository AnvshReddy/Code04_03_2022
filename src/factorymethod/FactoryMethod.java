package factorymethod;

class FactoryMethod1 {
	private FactoryMethod1() {
		System.out.println("Private Constructor");
	}

	void m1() {
		System.out.println("Instance Method");
	}
    static FactoryMethod1 m11() {
	FactoryMethod1 fac = new FactoryMethod1();
//	System.out.println(fac);
	return fac;
}
}

	class FactoryMethod{
	public static void main(String[] args) {
		 FactoryMethod1 fac = FactoryMethod1.m11();
//		 System.out.println(fac);
		 fac.m1();
		 fac.m11();
	}
}
