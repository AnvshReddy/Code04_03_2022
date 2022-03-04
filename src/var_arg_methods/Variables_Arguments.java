package var_arg_methods;

public class Variables_Arguments {

	int addition(int... a) {

		System.out.println("No of arguments:=" + a.length);
		int result = 0;
		System.out.print("List of arguments:");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
			result = result + a[i];
			System.out.println();

		}
		System.out.println("addition:" + result);
		System.out.println("------------------------------");
		return result;

	}
}
