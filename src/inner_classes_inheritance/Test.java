package inner_classes_inheritance;
//case1.Cannot extend inheritance between Inner classes which are completely in two different outer classes.

class A{
	class B{
		
		
	}
}
class C{
//	class D extends B{ ---->error 
	class D extends A{
		
	}
}
public class Test {

	public static void main(String[] args) {

	}

}
