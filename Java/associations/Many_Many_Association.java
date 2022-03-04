package associations;

//Many Departments has many Employees;
class Employees1 {
	String empName;
	String empId;
	float empSalary;
	String empAddress;

	public Employees1(String empName, String empId, float empSalary, String empAddress) {
		this.empName = empName;
		this.empId = empId;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}
}

class Departments {
	String depName;
	String depId;
	Employees1[] emp;

	Departments(String depName, String depId, Employees1[] emp) {
		this.depName = depName;
		this.depId = depId;
		this.emp = emp;
	}

	public void getDepartmentDetails() {
		System.out.println("Departments Details:");
		System.out.println("--------------------------------------");
		System.out.println("Department Name :        " + depName);
		System.out.println("Department Id   :        " + depId);
		System.out.println();
		System.out.println("Employees Details:       ");
		System.out.println("EmpName     EmpID      EmpSalary     EmpAddress");
		System.out.println("---------------------------------------");
		for (int i = 0; i < emp.length; i++) {
			Employees1 e = emp[i];
			System.out.println(e.empName + "       " + e.empId + "        " + e.empSalary + "       " + e.empAddress);
		}
		System.out.println();
	}
}

public class Many_Many_Association {

	public static void main(String[] args) {

		Employees1 emp1 = new Employees1("Anvesh Reddy", "123", 50000.0f, "Bengaluru");
		Employees1 emp2 = new Employees1("Pranith Reddy", "124", 60000.0f, "Hyderabad");
		Employees1 emp3 = new Employees1("AjayReddy", "125", 70000.0f, "Delhi");
		Employees1 emp4 = new Employees1("Nikhil Reddy", "126", 80000.0f, "Pune");
		Employees1[] emp = new Employees1[4];
		emp[0] = emp1;
		emp[1] = emp2;
		emp[2] = emp3;
		emp[3] = emp4;

		Departments dep1 = new Departments("ComputerScience", "CS-180", emp);
		Departments dep2 = new Departments("Mathematics", "CS-180", emp);
		Departments dep3 = new Departments("Diploma", "CS-180", emp);
		Departments dep4 = new Departments("Biology", "CS-180", emp);
		dep1.getDepartmentDetails();
		dep2.getDepartmentDetails();
		dep3.getDepartmentDetails();
		dep4.getDepartmentDetails();

	}

}
