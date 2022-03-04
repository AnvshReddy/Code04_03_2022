package command_line_arguments;

public class CommandLineArguments {
/*
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
*/	
	public static void main(String ... args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}


