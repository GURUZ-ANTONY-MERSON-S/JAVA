import java.util.Scanner;
class Lcm{
    //LCM of the two given number...
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
        
        int GCD=Gcd(n,m);
        
        int Lcm=(n*m)/GCD;
        
        System.out.println(Lcm);
        
        
    }
}