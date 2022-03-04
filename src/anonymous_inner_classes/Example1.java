package anonymous_inner_classes;
//1.Example using the implementation class for the interface. 
interface Institute{
	public void displayAllCoursesNames();
}
class InstituteImpl implements Institute{
	public void displayAllCoursesNames() {
		System.out.println("Courses Names:");
		System.out.println("------------------");
		System.out.println("1.Java");
		System.out.println("2.Oracle");
		System.out.println("3.c++");
		System.out.println("4.python");
	}
}
class Student{
	public void getCoursesNames(Institute in) {
		in.displayAllCoursesNames();
		
	}
}
public class Example1 {

	public static void main(String[] args) {
		Student stu = new Student();
		InstituteImpl in = new InstituteImpl();
		stu.getCoursesNames(in);

	}

}
