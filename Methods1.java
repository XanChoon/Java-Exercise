import java.util.Scanner;
class Methods1 {  
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int a = 0;
        System.out.println("This is first");
        a = in.nextInt();

        int b = 0;
        System.out.println("This is second");
        b = in.nextInt();
      
        int c = addition(a, b);
        System.out.println("Total is = " + c);
      
        int d = subtraction(a, b);
        System.out.println("Total is = " + d);
    
        int e = multiplication(a, b);
        System.out.println("Total is = " + e);

        int f = division(a, b);
        System.out.println("Total is = " + f);
    }

    public static int addition(int n1, int n2) {
    
        int ans = n1 + n2;
        return ans; 
    }

    public static int subtraction(int n1, int n2) {
        
        int ans = n1 - n2;
        return ans; 
    }
    
    public static int  multiplication(int n1, int n2) {
        
        int ans = n1 * n2;
        return ans; 
   }

    public static int division(int n1, int n2) {
        
        int ans = n1 / n2;
        return ans; 
   }
}