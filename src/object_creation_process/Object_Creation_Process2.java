package object_creation_process;

public class Object_Creation_Process2 {

	public static void main(String[] args) {
		ObjectCreationProcess objs = new ObjectCreationProcess();
		String string = objs.toString();
		int hash_code = objs.hashCode();
//	   Class<? extends ObjectCreationProcess> getClass = objs.getClass();
		System.out.println("StringValue:" + string);
		System.out.println("HashCode value:" + hash_code);
//	    System.out.println("GetClass:"+getClass);
		System.out.println(hash_code);
		System.out.println(objs.hashCode());

	}

}
