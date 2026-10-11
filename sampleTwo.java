
import java.util.Scanner;

public class sampleTwo {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial..:");
        int num=a.nextInt();
        
        int tot=1;
        for (int i=1;i<=num;i++){
            tot=tot*i;
        }
        System.out.println("The factorial result is...:"+tot);
        
        

        
    }
}