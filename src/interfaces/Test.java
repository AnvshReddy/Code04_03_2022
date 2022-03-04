package interfaces;

interface A {
	 void m1();
}
interface B{
	void m2();	
}
interface C{
	void m3();
}
interface D{
	void m4();
}
interface M extends B,C,D{
}

class Ba implements M{
	 public void m1() {
	System.out.println("Interface Implementations");
}
public void m2() {
	System.out.println("");
}
 public void m3() {
	System.out.println("");
}
public void m4() {
	System.out.println();
}
	
}
public class Test {

	public static void main(String[] args) {
		Ba b = new Ba();
		b.m1();
		
	}

}
