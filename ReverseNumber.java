import java.util.Scanner;
class ReverseNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int number=n;
        int rem=0;
        while(number>0){
            int digit=number%10;
            rem=rem*10 + digit;
            number/=10;
        }
        System.out.println(rem);
    }
}