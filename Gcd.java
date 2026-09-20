import java.util.Scanner;
class Gcd{
    //GCD of the two given number...
    public static int Gcd(int a , int b){
        if(b==0){
            return a;
        }
        return Gcd(b, a%b);
    }
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        System.out.println(Gcd(n,m));
    }
}