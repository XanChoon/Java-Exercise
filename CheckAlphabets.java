import java.util.Scanner;
class CheckAlphabets{
	public static void main(String args[]){
		char ch;
		System.out.println("Enter alphabets");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		
		while(ch <= 'z'){
			System.out.println(ch);
			ch++;
		}
}
}