package getters_setters;

public class Customers {
	String customerName;
	String customerOrder;
	String customerType;
	int customerAge;
	float customerSalary;

	public void setCustomerName(String customerName1) {
		customerName = customerName1;
	}

	public void setCustomerOrder(String customerOrder1) {
		customerOrder = customerOrder1;
	}

	public void setCustomerType(String customerType1) {
		customerType = customerType1;
	}

	public void setCustomerAge(int customerAge1) {
		customerAge = customerAge1;
	}

	public void setCustomerSalary(float customerSalary1) {
		customerSalary = customerSalary1;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerOrder() {
		return customerOrder;
	}

	public String getCustomerType() {
		return customerType;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public float getCustomerSalary() {
		return customerSalary;
	}

}
