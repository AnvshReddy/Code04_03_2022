package anonymous_inner_classes;
//2.Example:Here in this example we provided the anonymous Inner class inside the main class.

interface Institute1 {
	public void displayAllCoursesNames();
}

class Student1 {
	public void getAllCoursesNames(Institute1 in) {
		in.displayAllCoursesNames();

	}
}

public class Example2 {

	public static void main(String[] args) {
		Student1 stu = new Student1();
		Institute1 in = new Institute1() {
			public void displayAllCoursesNames() {
				System.out.println("Courses Names:");
				System.out.println("------------------");
				System.out.println("1.Oracle.");
				System.out.println("2.Java.");
				System.out.println("3.Python.");
				System.out.println("4.C++");
			}
		};

		stu.getAllCoursesNames(in);

	}

}
