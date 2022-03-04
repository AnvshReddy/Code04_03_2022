package adapter_classes;
interface A{
	abstract void m1();
    abstract void m2();
    abstract void m3();
    abstract void m4();
	
}
abstract class B implements A{
	 abstract public void m1();
	 public void m2() {
		 
	 }
	 public void m3() {
		 
	 }
	 public void m4() {
		 
	 }
}
class C extends B{
	public void m1() {
	}
}
	
public class Test {

	public static void main(String[] args) {

	}

}
