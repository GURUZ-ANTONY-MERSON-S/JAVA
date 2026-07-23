import java.util.Scanner;
class NeonNumber{
    public static boolean neon(int n){
        int num=n;
        int square=num*num;
        int sum=0;
        
        while(square>0){
            int digit=square%10;
            sum+=digit;
            square/=10;
        }
        
        if(sum==num){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int number=sc.nextInt();
        
        if(number<1){
            System.out.println("The given number is not a neon number.");
            return;
        }
        boolean result=neon(number);
        
        if(result){
            System.out.println("The given number is Neon number.");
        }
        else{
            System.out.println("The given number is not a Neon number.");
        }
        sc.close();
    }
}