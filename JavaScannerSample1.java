import java.util.Scanner;
 
class JavaScannerSample1{
 
	public static void main(String[] args) {
		//Create Scanner object to read command line input
	    Scanner in = new Scanner(System.in);
	    
	    //Pass scanner object to read method
	    inputNumber = readInput(in);
	    
	    System.out.println("User Entered:"+inputNumber);
	}
	public static String readInput(Scanner in) {
		
		inputNumber = 0;
		System.out.println("Enter your number:");
        if (inputNumber = 1){
            System.out.println("One");
        }else{
            System.out.println("Goodbye");
        }
    }
}    