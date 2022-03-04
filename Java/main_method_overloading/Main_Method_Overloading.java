package main_method_overloading;
public class Main_Method_Overloading {
	
	 /* In this case Method Overloading is possible but
	 Only Implementation part of the main method is executed.*/

	public static void main(String[] args) {
		System.out.println("Only this main method Implementation is executed.");
	}
	public static void main(int[] args) {
		System.out.println("overloading Method 1");
	}
	public static void main(float[] args) {
		System.out.println("Overloading Method 2");
	}
	public static void main(double[] args) {
		System.out.println("Overloading Method 3");
	}
	public static void main(boolean[] args) {
		System.out.println("Overloading Method 4");
	}

}
