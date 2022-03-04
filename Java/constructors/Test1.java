package constructors;

public class Test1 {

	public static void main(String[] args) {
		Constructors_Overloading constr = new Constructors_Overloading(10);
		System.out.println(constr);
		constr.add();
		System.out.println();
		Constructors_Overloading constr1 = new Constructors_Overloading(10, 20);
		System.out.println(constr1);
		constr1.add();
		System.out.println();
		Constructors_Overloading constr2 = new Constructors_Overloading(10, 20, 30);
		System.out.println(constr2);
		constr2.add();
		System.out.println();

	}

}
