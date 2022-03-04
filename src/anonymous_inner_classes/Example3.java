package anonymous_inner_classes;
//3.Example:Here in this example we directly passed the anonymous Inner class to the "in.getStudentDetails()" Method as a parameter in the main class.

interface Institute3 {
	public void displayAllCoursesNames();
}

class Student3 {
	public void getAllCoursesNames(Institute3 in) {
		in.displayAllCoursesNames();

	}
}

public class Example3 {

	public static void main(String[] args) {
		Student3 stu = new Student3();
		stu.getAllCoursesNames(new Institute3() {
			public void displayAllCoursesNames() {
				System.out.println("Course Details:");
				System.out.println("------------------");
				System.out.println("1.Python.");
				System.out.println("2.Java.");
				System.out.println("3..Net");
				System.out.println("4.Oracle");
				System.out.println("5.Full Stack Java.");
			}
		});
	}
}