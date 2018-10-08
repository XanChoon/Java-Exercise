import java.util.Scanner;

class FindMin{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your first number: ");
        int a = in.nextInt();
        
        System.out.println("Enter your second number: ");
        int b = in.nextInt();

        System.out.println("Enter your third number: ");
        int c = in.nextInt();

        System.out.println("The most minimun value " +  min(a, b, c));
    }
 
    public static int min(int a, int b, int c) {
        return Math.min(Math.min(a,b),c);
    }
}