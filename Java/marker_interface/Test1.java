package marker_interface;

//Deep cloning > In Deep cloning Developers need to specify Explicitly; 
class Account1 {
	String accId;
	String accHolderName;
	String accType;

	Account1(String accId, String accHolderName, String accType) {
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.accType = accType;
	}
}

class Employee1 implements Cloneable {
	String empId;
	String empName;
	String empSalary;
	String empAddress;
	Account1 account1;

	Employee1(String empId, String empName, String empSalary, String empAddress, Account1 account1) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.account1 = account1;
	}

	public Object clone() throws CloneNotSupportedException {
		Account1 duplicateAccount = new Account1(account1.accId, account1.accHolderName, account1.accType);
		Employee1 duplicateEmployeeAccount = new Employee1(empId, empName, empSalary, empAddress, duplicateAccount);
		return duplicateEmployeeAccount;
	}

	public void getEmployeeDetails() {
		System.out.println("Employee Details");
		System.out.println("----------------------");
		System.out.println("Employee Name:" + empName);
		System.out.println("Employee Id:" + empId);
		System.out.println("Employee Salary:" + empSalary);
		System.out.println("Employee Address:" + empAddress);
		System.out.println();
		System.out.println("Employee Account Details:");
		System.out.println("-----------------------------");
		System.out.println("Employee Acount Id:" + account1.accId);
		System.out.println("Employee Account type:" + account1.accType);
		System.out.println("Employee Account Holder Name:" + account1.accHolderName);
	}
}

public class Test1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Account1 originalAccount = new Account1("123456", "Savings", "Mittapally Anvesh");
		Employee1 originalEmployee = new Employee1("12345", "Mittapally Anvesh", "120000", "Hyderabad",
				originalAccount);
		originalEmployee.getEmployeeDetails();
		System.out.println();
		Employee1 duplicateEmployee = (Employee1) originalEmployee.clone();
		duplicateEmployee.getEmployeeDetails();
		System.out.println();
		System.out.println("Original Employee Account :"+originalAccount);
		System.out.println("Original  Employee Object:"+originalEmployee);
		System.out.println("Duplicate Employee:"+duplicateEmployee);
		System.out.println("Duplicate Employee Account:"+duplicateEmployee.account1);

	}

}
