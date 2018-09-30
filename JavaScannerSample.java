import java.util.Scanner;
 
class JavaScannerSample{
 
	public static void main(String[] args) {
 
		//Create Scanner object to read command line input
	    Scanner in = new Scanner(System.in);
	    
	    //Pass scanner object to read method
	    String input = readInput(in);
	    
	    System.out.println("User Entered:"+input);
	    
	}
	public static String readInput(Scanner in) {
		
		String input = "";
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Enter String:");
		
		//Keep looping until user enters blank line
		while ((input = in.nextLine()).length() > 0 ) {
			System.out.println("Enter String: ");
			sb.append(input);
		}
		
		return sb.toString();
		
	}
 
}