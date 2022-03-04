package object_instance;

public class Instance {
	int i = 10;
	int j= 20;
	
	public static void main(String[] args) {
		Instance a = new Instance();
		for (int i = 1; i < 10; i++) {
			a.i = a.i + 1;
			a.j  = a.j +2;
		}
		System.out.println(a.i);
		System.out.println(a.j);
	}
}
