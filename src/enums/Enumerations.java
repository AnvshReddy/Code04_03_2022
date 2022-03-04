package enums;

enum Apple {
	A(500,400),B(700,600),C(900,700);
	int price;
	int cost;
	Apple(int price, int cost){
       this.price = price;
       this.cost = cost;
	}
	int apple() {
		banana();
		return price;
	}
	int banana() {
//		System.out.println("Banana");
		return cost;
	}
}
class Enumerations{
public static void main(String []args) {
//	System.out.println(Apple.A.banana());
	System.out.println(Apple.A.apple());
//	System.out.println(Apple.B.banana());
	System.out.println(Apple.B.apple());
//	System.out.println(Apple.C.banana());
	System.out.println(Apple.C.apple());
}
}


