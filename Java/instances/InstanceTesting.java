package instances;

class Instances {
	int i = 10;
	int j = m1();
	int k = m2();
	int l;


	int m1() {
		System.out.println("Instance method");
		m2();
		return 30;
		
	}
	{
		System.out.println("Instance Block");
		System.out.println("Instance Block 1");
		m2();
	}
	int m2(){
		System.out.println("Instance - Method  ");
		return 35;
	}
	Instances(){
		System.out.println("Zero arg constructor");
	     l= 45;
	}
	
}

public class InstanceTesting {

	public static void main(String[] args) {
		Instances ints = new Instances();
		System.out.println(ints.l);
		

	}

}
