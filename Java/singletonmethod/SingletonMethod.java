package singletonmethod;
class Test{
	static Test tes = null; 
	private Test() {
		
	}
	static {
		 tes = new Test();
  }
	static Test m1() {
		return tes;
	}
}
public class SingletonMethod {

	public static void main(String[] args) {
		System.out.println(Test.m1());
		System.out.println(Test.m1());
		System.out.println(Test.m1());
	}

}
