class LocalVariables{
int i = 10;
int j= 20 ;
void m1() {
	int i = 40;
	int j= 50;
	System.out.println(i);
	System.out.println(j);
	System.out.println(this.i);
	System.out.println(this.j);
}
void m2() {
	System.out.println("Accessing another Method");
	m1();
}
}
public class Local_Class_Level {

	public static void main(String[] args) {
	   LocalVariables loc = new LocalVariables();
	   System.out.println();
//	   loc.m1();
	   System.out.println(loc.i);
	   System.out.println(loc.j);
	   loc.m2();
	   
		
		}
	}


