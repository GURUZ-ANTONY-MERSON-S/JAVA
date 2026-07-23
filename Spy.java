import java.util.Scanner;
class Spy{
    public static void main(String[]  args){
        Scanner sc=new Scanner(System.in);
        
        int number=sc.nextInt();
        if(number<1){
            System.out.println("The given number is not a spy number.");
            return;
        }
        
        int sum=0;
        int product=1;
        
        while(number>0){
            int digit=number%10;
            sum+=digit;
            product*=digit;
            
            number/=10;
        }
        
        if(sum==product){
            System.out.println("The given number is a spy number.");
        }
        else{
            System.out.println("The given number is not a spy number.");
        }
        sc.close();
    }
}