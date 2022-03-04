package settersandgetters;

public class Employee1 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Anvesh Mittapally");
		emp.setCity("Hyderabad and Kurnool");
		emp.setDepartment("ComputerScience and Information Technology");
		emp.setSalary(10000.0f);

		System.out.println(emp.getName());
		System.out.println(emp.getDepartment());
		System.out.println(emp.getCity());
		System.out.println(emp.getSalary());
		System.out.println();

		emp.setName("navin reddy");
		emp.setCity("Hyderabad and Kurnool");
		emp.setDepartment("ComputerScience and Information Technology");
		emp.setSalary(10000.0f);

		System.out.println(emp.getName());
		System.out.println(emp.getDepartment());
		System.out.println(emp.getCity());
		System.out.println(emp.getSalary());

		emp.setName("ramreddy");
		emp.setCity("Hyderabad and Kurnool");
		emp.setDepartment("ComputerScience and Information Technology");
		emp.setSalary(10000.0f);

		System.out.println();
		System.out.println(emp.getName());
		System.out.println(emp.getDepartment());
		System.out.println(emp.getCity());
		System.out.println(emp.getSalary());
	}

}
