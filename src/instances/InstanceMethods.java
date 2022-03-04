package instances;

public class InstanceMethods {
	int m1() {
		System.out.println("m1 method");
		return 10;
	}

	{
		System.out.println("1st Block");
	}

	InstanceMethods() {

		System.out.println("1st Constructor");
	}

	int i = m1();

	int m2() {
		System.out.println("m2 method");
		return 20;
	}

	{
		System.out.println("2nd Block");
	}
	int j = m2();
	{
		System.out.println("3rd Block");
	}

}
