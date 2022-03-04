package uses_a_relationship;

class Account {
	String accId;
	String accName;
	String accAddress;
	int balance = 30000;

	Account(String accId, String accName, String accAddress) {
		this.accId = accId;
		this.accName = accName;
		this.accAddress = accAddress;
	}
}

class Transaction {
	String transactionId;
	String transactionType;

	Transaction(String transactionId, String transactionType) {
		this.transactionId = transactionId;
		this.transactionType = transactionType;

	}

	public void deposit(Account acc, float deposit_Amt) {
		int initialBalance = acc.balance;
		float availableBalance = initialBalance + deposit_Amt;
		System.out.println("Transaction_Details");
		System.out.println("--------------------------------");
		System.out.println("Transaction Id          :" + transactionId);
		System.out.println("Transactiontype         :" + transactionType);
		System.out.println("Initial Amount          :"+acc.balance);
		System.out.println("Deposited Amount        :"+deposit_Amt);
		System.out.println();
		System.out.println("Account_Details");
		System.out.println("-------------------------");
		System.out.println("Account Id              :" + acc.accId);
		System.out.println("Account Name            :" + acc.accName);
		System.out.println("Account Address         :" + acc.accAddress);
		System.out.println("Account Balance         :" + availableBalance);
	}

}

public class Test {

	public static void main(String[] args) {
		Account acc = new Account("123456","AnveshReddy","Hyderabad");
		Transaction trans = new Transaction("123456XXXX90","Deposit");
		trans.deposit(acc,20000.0f);

	}

}
