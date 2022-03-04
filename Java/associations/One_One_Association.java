package associations;

class Account {
	String accId;
	String accType;
	float accBalance;

	Account(String accId, String accType, float accBalance) {
		this.accId = accId;
		this.accType = accType;
		this.accBalance = accBalance;
	}

}

class Employee {
	String name;
	String id;
	float salary;
	String address;
	Account acc;

	Employee(String name, String id, float salary, String address,Account acc) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
		this.acc = acc;
		
	}

	public void getEmployeeDetails() {
		System.out.println("Employee Details");
		System.out.println("----------------------------------");
		System.out.println("Name of the Employee---->" + name);
		System.out.println("Id of the Employee ----->" + id);
		System.out.println("salary of the Employee--->" + salary);
		System.out.println("Address of the Employee-->" + address);
		System.out.println();
		System.out.println("Account Details of the Employee");
		System.out.println("--------------------------------------------");
		System.out.println("Account Id------------------>" + acc.accId);
		System.out.println("Accoutn Type---------------->" + acc.accType);
		System.out.println("Account Balance------------->" +acc.accBalance);

	}
}

public class One_One_Association {

	public static void main(String[] args) {
		Account acc = new Account("1234","Savings",26000.0f); 
		Employee emp = new Employee("Anvesh","22345",15000.0f,"Hyderabad",acc);
		emp.getEmployeeDetails();
		
	}

}
