package settersandgetters;

public class Employee {
	String name;
	String Address;
	float salary;
	String department;
	String city;

	public void setName(String names) {
		this.name = names;
	}

	public void setCity(String cities) {
		this.city = cities;
	}

	public void setDepartment(String departments) {
		this.department = departments;
	}

	public void setSalary(float salaries) {
		this.salary = salaries;
	}

	public String getName() {
		return name;

	}

	public String getCity() {
		return city;
	}

	public String getDepartment() {
		return department;
	}

	public float getSalary() {
		return salary;
	}
}
