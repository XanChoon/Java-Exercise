import java.util.Scanner;

class NestedIfElse{
	public static void main(String[]args){
	int marksInput, passingMarks;
	char grade;

passingMarks = 40;

Scanner input = new Scanner(System.in);

System.out.println("Input marks scored by you");

marksInput=input.nextInt();

	if(marksInput>=passingMarks){
	
	if(marksInput>90)
		grade = 'A';
	else if (marksInput>75)
		grade = 'B';
	else if (marksInput>60)
		grade = 'C';
	else
		grade = 'D';

	System.out.println("You passed the exam and your grade is " + grade);
	}else{
		grade = 'F'; 
      		System.out.println("You failed and your grade is " + grade);

}
}
}