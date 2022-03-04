package marker_interface;

//Shallow Cloning or Default Cloning
class Account {
	String accId;
	String accHolderName;
	String accType;

	Account(String accId, String accHolderName, String accType) {
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.accType = accType;
	}

}

class Employee implements Cloneable {
	String empName;
	String empId;
	String empAddress;
	String empSalary;
	Account account;

	Employee(String empName, String empId, String empAddress, String empSalary, Account account) {
		this.empName = empName;
		this.empId = empId;
		this.empAddress = empAddress;
		this.empSalary = empSalary;
		this.account = account;

	}

	public void getEmployeeDetails() {
		System.out.println("Employee details");
		System.out.println("----------------------------");
		System.out.println("Employee Name:" + empName);
		System.out.println("Employee Id:" + empId);
		System.out.println("Employee Address:" + empAddress);
		System.out.println("Employee Salary:" + empSalary);
		System.out.println();
		System.out.println("Employee Account Details:");
		System.out.println("------------------------------");
		System.out.println("Account Id:" + account.accId);
		System.out.println("Account Holder Name" + account.accHolderName);
		System.out.println("Account Type" + account.accType);
	}

	public Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		return obj;
	}

}

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Account account = new Account("123", "Mittapally Anvesh", "Savings");
		Employee originalemp = new Employee("12345", "Mittapally Anvesh", "Hyderabad", "20000", account);
		Employee duplicateemp = (Employee) originalemp.clone();
		System.out.println("Originalemp:"+originalemp);
		System.out.println("Duplicateemp:"+duplicateemp);
		System.out.println();
		System.out.println("Original Account:"+originalemp.account);
		System.out.println("Duplicate Account:"+duplicateemp.account);
		originalemp.getEmployeeDetails();
		System.out.println();
		duplicateemp.getEmployeeDetails();

	}

}
