package anonymous_inner_classes;
//Case 2: Anonymous Inner class Here we decalred the anonymous inner class directly inside the main class.

//so we can access the interface methods using the ref variabble of the anonymous onner class directly

interface I4 {
	int i = 20;

	public void m1();

	public void m2();

	public void m3();
}

//Here we  can directly declare anonymous inner class inside the main class.and can access the methods using only the anonymous innner class ref variable.
public class Test4 {

	public static void main(String[] args) {
		I4 i4 = new I4() {
			public void m1() {
				System.out.println("m1- AIC");
			}

			public void m2() {
				System.out.println("m2- AIC");
			}

			public void m3() {
				System.out.println("m3-AIC");
			}
		};
		i4.m1();
		i4.m2();
		i4.m3();
		System.out.println(I4.i);

	}

}
