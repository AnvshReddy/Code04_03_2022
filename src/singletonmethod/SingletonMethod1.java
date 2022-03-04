package singletonmethod;
class Test1{
	static Test1 tes1 = new Test1();
	private Test1(){
		
	}
	static Test1 m1() {
		return tes1;
		
	}
}
public class SingletonMethod1 {

	public static void main(String[] args) {
		System.out.println(Test1.m1());
		System.out.println(Test1.m1());
		System.out.println(Test1.m1());
		
	}

}
