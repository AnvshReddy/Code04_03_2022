package instances;

class Test1{
	 static void m1() {
		 System.out.println("m1-a");
	 }
	 void m2() {
		 System.out.println("m2-a");
	 }
}
	 class Test2{
	 public static void main(String[] args) {
		 Test1 tes = new Test1();
		 Test1 tes1 = null;
		 Test1.m1();
		 Test1.m1();
		 Test1.m1();
		 tes1.m2();
		tes1.m1();
	}
}