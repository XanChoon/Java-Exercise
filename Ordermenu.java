import java.util.Scanner;

class Ordermenu{
	public static void main (String[]args){
		
	int home = 0;
    int drinkinput = 0;
	double payment = 0;
	double balance = 0;
	double coloaprice = 2;
	double miloprice = 3;
	double drink3 = 1;
	double drink4 = 3.5;
		
	System.out.println("Welcome to Vendor Machine");
	System.out.println("Please select your option " + "\n" 
	+ "1. Menu "+ "\n" 
	+ "2. Exit "+ "\n");
	Scanner input = new Scanner(System.in);
	home = input.nextInt();
		
	if (home == 1){
		System.out.println("Welcome to order menu"+ "\n" +
		"1.Cola RM2.00 " + "\n" + 
		"2.Milo RM3.00"+ "\n" +
		"3.Teh Tarik RM1.00"+ "\n" + 
		"4.Mineral Water RM3.5");
		System.out.println("Please choice one drink number for order");
		drinkinput = input.nextInt();
		if (drinkinput == 1){
			System.out.println("Your drink is " + "RM" + coloaprice 
			+ "\n" + "Please insert your money ");
			payment = input.nextDouble();
			balance = payment - coloaprice;
			System.out.println("Your balance is" + "RM" + balance + "\n" 
			+ "Thank you ");
		}else if (drinkinput == 2){
			System.out.println("Your drink is " + "RM" + miloprice 
			+ "\n" + "Please insert your money ");
			payment = input.nextDouble();
			balance = payment - miloprice;
			System.out.println("Your balance is" + "RM" + balance + "\n" 
			+ "Thank you ");
		}else if (drinkinput == 3){
			System.out.println("Your drink is " + "RM" + drink3 + "\n" 
			+ "Please insert your money ");
		    payment = input.nextDouble();
		    balance = payment - drink3;
			System.out.println("Your balance is" + "RM" + balance + "\n" 
			+ "Thank you ");
		}else if (drinkinput == 4){
		System.out.println("Your drink is " + "RM" + drink4 + "\n" 
		+ "Please insert your money ");
			payment = input.nextDouble();
			balance = payment - drink4;
			System.out.println("Your balance is" + "RM" + balance + "\n" 
			+ "Thank you ");
			}else{
				System.out.println("Your drink input invalid");
			}
	}else if(home == 2){
			System.out.println("Thank you!!! Please come again. ");
	}else{
			System.out.println("Invalid Input!!! Bye bye!!!");
		}
	}
}