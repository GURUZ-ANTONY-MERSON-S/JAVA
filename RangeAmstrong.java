import java.util.Scanner;
class RangeAmstrong{
    
    public static boolean Range(int x){
        int val=x;
        int fin=x;
        int sum=0;
        
        int digits=0;
        while (val>0){
            digits++;
            val/=10;
        }
        
        while(fin>0){
            int digi=fin%10;
            sum+=(int)Math.pow(digi,digits);
            fin/=10;
        }
        if(sum==x){
            return true;
        }
        else{
            return false;
        }
    }
    public static int Strong(int a, int b){
        int count=0;
        for(int i=a;i<=b;i++){
            boolean blue=Range(i);
            if(blue){
                System.out.print(i+" ");
                count++;
            }
        }
        return count;
       
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        
        System.out.println("\ncount of amstrong: "+Strong(number1,number2));
        
    }
}