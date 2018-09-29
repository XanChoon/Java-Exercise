import java.util.Scanner;

class Calculator{
    public static void main (String [] args){
        int operationmenu = 0;
        int numberinput1 = 0;
        int numberinput2 = 0;
        int result = 0;
        
        System.out.println("Welcome to Java CMD Calculator" + "\n" + "1.Addition "
        + "\n" + "2.Subtraction " + "\n" + "3.Multiplication " + "\n" + "4.Division " + "\n" + 
        "Please choice your math operation");
        Scanner in = new Scanner(System.in);
        operationmenu = in.nextInt();
        
        
        if (operationmenu == 1){
            System.out.println("Please enter your first number");
            numberinput1 = in.nextInt();
            System.out.println("Please enter your second number");
            numberinput2 = in.nextInt();
            result = (numberinput1 + numberinput2);
            System.out.println("Your result is " + result);
        }else if (operationmenu == 2){
            System.out.println("Please enter your first number"); 
            numberinput1 = in.nextInt();
            System.out.println("Please enter your second number");
            numberinput2 = in.nextInt();
            result = (numberinput1 - numberinput2);
            System.out.println("Your result is " + result);
        }else if (operationmenu == 3){
            System.out.println("Please enter your first number"); 
            numberinput1 = in.nextInt();
            System.out.println("Please enter your second number");
            numberinput2 = in.nextInt();
            result = (numberinput1 * numberinput2);
            System.out.println("Your result is " + result);
        }else if (operationmenu == 4){
            System.out.println("Please enter your first number");
            numberinput1 = in.nextInt();
            System.out.println("Please enter your second number");
            numberinput2 = in.nextInt();
            result = (numberinput1 / numberinput2);
            System.out.println("Your result is " + result);
        }else{
            System.out.println("Your input is invalid!!!");
        }
    }
}