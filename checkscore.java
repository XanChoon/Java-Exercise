import java.util.Scanner;

class IfElse{
	public static void main (String[]args){
	int marksInput, passingMarks;

	passingMarks = 40;

	Scanner input = new Scanner(System.in);	

	System.out.println("Input marks scored by you");
	
	marksInput = input.nextInt();
	
	if(marksInput >= passingMarks){
		System.out.println("You passed the exam.");
	}else{
		System.out.println("Unfortunately, you failed to pass the exam.");
	}
}
}