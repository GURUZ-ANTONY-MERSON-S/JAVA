import  java.util.Scanner;


public class pallindrome {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter a number:");
        int num=obj.nextInt();

        int remainder=0;
        
       int org=num;
        
        while(num>0){
            int mod=num%10;
            remainder=(remainder*10)+mod;
            num=num/10;


        }
        if(org==remainder){
             System.out.println("Yes the given number is pallindrome...");

        }
        else{
            System.out.println("No the given number is not a pallindrome");
        }


    }    
}
