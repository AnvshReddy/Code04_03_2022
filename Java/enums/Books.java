package enums;

enum Books1 {
	A(500, 600), B(700, 800), C(900, 1000);

	int pages;
	int cost;

	Books1(int pages, int cost) {
		this.pages = pages;
		this.cost = cost;
	}

	public void booksCost() {
		System.out.println("No.of.pages in the book         Cost of the Book");
		System.out.println(this.pages + "                                      " +this.cost);
	}
}

class Books {
	public static void main(String[] args) {
		Books1.A.booksCost();
		Books1.B.booksCost();
		Books1.C.booksCost();
	}
}
