package constructors;

public class Constructors_Types {
	String name;
	String id;
	String department;
	String course;
	float salary;

	Constructors_Types(){
		name = "anvesh";
		id = "1994";
		department = "Computer Science";
		course = "IIT";
		salary = 100000.0f;

	}

	void display_Employee_details() {
		System.out.println("Display employee details");
		System.out.println("---------------------------");
		System.out.println("Employee name:" + name);
		System.out.println("Employee Id:" + id);
		System.out.println("Employee department:" + department);
		System.out.println("Employee course:" + course);
		System.out.println("Employee salary:" + salary);

	}

}
