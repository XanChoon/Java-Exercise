import java.util.Scanner;
class TakingInput {
    public static void main(String[] args){
        int a[] = null;
        int i = 1;
        Scanner s=new Scanner(System.in);
        while (s.hasNextLine()){
            int temp[] = null;
            if(a!=null){
                 temp = a;
            }
            a = new int[i];
            a[i-1]=s.nextInt();         
            if(temp!= null){
                for(int j=0;j<temp.length;j++){
                a[j]=temp[j];   
                }
            }
            i++;
        }
    }
}