import java.util.Scanner;
public class ExampleMinNumber {
   
   public static void main(String[] args) {
      int a = 0;
      int b = 0;
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter your first number");
      a = in.nextInt();
      System.out.println("Please enter your second number");
      b = in.nextInt();
      int c = minFunction(a, b);
      System.out.println("Minimum Value = " + c);
   }

   /** returns the minimum of two numbers */
   public static int minFunction(int n1, int n2) {
      int min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min; 
   }
}