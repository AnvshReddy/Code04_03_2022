package associations;

class Account1 {
	private String accId;
	private String accType;
	private float accBalance;

	Account1() {

	}

	public void setAccountId(String accId) {
		this.accId = accId;
	}

	public String getAccountId() {
		return accId;
	}

	public void setAccountType(String accType) {
		this.accType = accType;
	}

	public String getAccountType() {
		return accType;
	}

	public void setAccountBalance(float accBalance) {
		this.accBalance = accBalance;
	}

	public float getAccountBalance() {
		return accBalance;
	}

}

class Employee1 {
	String empName;
	String empId;
	String empDepartment;
	float empSalary;
	Account1 empAcc;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public Account1 getEmpAcc() {
		return empAcc;
	}

	public void setEmpAcc(Account1 empAcc) {
		this.empAcc = empAcc;
	}

	public void getEmployeeDetails() {
		System.out.println("Employee Details:");
		System.out.println("---------------------------------------------");
		System.out.println("Employee Name:            " + empName);
		System.out.println("Employee Id               " + empId);
		System.out.println("Employee Department       " + empDepartment);
		System.out.println("Employee salary           " + empSalary);
		System.out.println();
		System.out.println("Employee Account Details:");
		System.out.println("--------------------------------------------");
		System.out.println("Employee Account Number:     " + empAcc.getAccountId());
		System.out.println("Employee Account Type        " + empAcc.getAccountType());
		System.out.println("Employee Account Balance     " + empAcc.getAccountBalance());
	}
}

public class One_One_Association_BeanClasses {

	public static void main(String[] args) {
		Account1 empAcc = new Account1();
		empAcc.setAccountId("134567");
		empAcc.setAccountType("Savings");
		empAcc.setAccountBalance(9500000.0f);
		Employee1 emp = new Employee1();
		emp.setEmpName("Anvesh");
		emp.setEmpId("132546");
		emp.setEmpDepartment("Computer-Science");
		emp.setEmpSalary(60000.0f);
		emp.setEmpAcc(empAcc);
		emp.getEmployeeDetails();

	}

}
