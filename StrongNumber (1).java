import java.util.Scanner;
class StrongNumber{
    public static int Strong(int a){
        if(a==0){
            return a;
        }
        int result=1;
        for(int i=1;i<=a;i++){
            result*=i;
        }
        return result;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        int number=sc.nextInt();
        int fin=number;
        int sum=0;
        
        while(fin>0){
            int digi=fin%10;
            sum+=Strong(digi);
            fin/=10;
        }
        if(sum==number){
            System.out.println("Strong number.");
        }
        else{
            System.out.println("Not Strong number");
        }
    }
}