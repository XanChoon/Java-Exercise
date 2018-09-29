import java.util.Scanner;
class Companyaddressbook{
    public static void main(String [] args){
    
        int phonenoinput;
        System.out.println("XXX Company address book " + "\n" + "1.Finance "
        + "\n" + "2.HR/Admin "+ "\n" + "3.IT "+ "\n" + "4.Customer Service ");
        System.out.println("Enter your which department no you want to find.");
        Scanner in = new Scanner(System.in);
        phonenoinput = in.nextInt();
        if (phonenoinput == 1){
            System.out.println("Finance Department no is 101");
        }else if(phonenoinput == 2){
            System.out.println("HR/Admin Department no is 102");
        }else if(phonenoinput == 3){
            System.out.println("IT Department no is 103");
        }else if(phonenoinput == 4){
            System.out.println("Customer Service Department no is 104");
        }
        else{
            System.out.println("Your input is invalid!!!");
        }
    }
}