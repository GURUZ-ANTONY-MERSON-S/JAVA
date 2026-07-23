import java.util.Scanner;

class HappyNumber{
    public static boolean happy(int n){
        if(n == 1){
            return true;
        }
        
        if(n==4){
            return false;
        }
        int nums=n;
        
        int sum=0;
         while(nums>0){
            int digit=nums%10;
            sum+=(int)Math.pow(digit,2);
            nums/=10;
        }
        
        return happy(sum);
        
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int number=num;
        
        
        if(number<1){
            System.out.println("Not a happy number.");
            return;
        }
        
        boolean result=happy(number);
        if(result){
            System.out.println("The given number is happy number.");
        }
        else{
            System.out.println("The given number is not a happy number.");
        }
        sc.close();
    }
}