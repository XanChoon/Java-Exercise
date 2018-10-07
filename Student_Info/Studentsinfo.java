import java.util.Scanner;
class Studentsinfo {
 
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
 
		//Decide the number of students
		System.out.print("Enter how many students: ");
		int numOfStudents = Integer.parseInt(scan.nextLine());
 
		//Create a string array to store the names of your students
		String arrayOfNames[] = new String[numOfStudents];
		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.print("Enter the name of students " + (i+1) + " : ");
		    arrayOfNames[i] = scan.nextLine();
		}
        
        String arrayOfMarks[] = new String[numOfStudents];
        for (int i = 0; i < arrayOfMarks.length; i++) {
            System.out.print("Enter the students marks " + (i+1) + " : ");
            arrayOfMarks[i] = scan.nextLine();
		}
        
		//Now show your friend's name one by one
		for (int i = 0; i < arrayOfNames.length; i++) {
			System.out.print("Students name " + (i+1) + " : ");
		    System.out.print(arrayOfNames[i] + "\n");
		} 
        
        for (int i = 0; i < arrayOfMarks.length; i++) {
			System.out.print("Students marks " + (i+1) + " : ");
		    System.out.print(arrayOfMarks[i] + "\n");
		}
	}
}
 
		  
 
 
