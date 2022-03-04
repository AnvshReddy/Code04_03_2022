package getters_setters;

public class Custoomers {

	public static void main(String[] args) {
		Customers cust = new Customers();

		cust.setCustomerName("Mittapally Anvesh Reddy");
		cust.setCustomerAge(25);
		cust.setCustomerOrder("Family Pack Biryani");
		cust.setCustomerSalary(10000.0f);
		cust.setCustomerType("New");
		System.out.println(cust.getCustomerName());
		System.out.println();
		System.out.println(cust.getCustomerOrder());
		System.out.println();
		System.out.println(cust.getCustomerType());
		System.out.println();
		System.out.println(cust.getCustomerSalary());
		System.out.println();
		System.out.println(cust.getCustomerAge());

	}

}
