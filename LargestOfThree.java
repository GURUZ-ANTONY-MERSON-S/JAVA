import java.util.Scanner;
class LargestOfThree{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        
        if(number1==number2 && number2==number3){
            System.out.println("All numbers are equal");
            return;
        }
        
        if(number1>number2){
            if(number1>number3){
                System.out.println(number1+ " is the greatest number");
            }
            else{
                System.out.println(number3+" is the greatest number");
            }
        }
        else if(number2>number3){
            System.out.println(number2+ " is the greatest number");
        }
        else{
            System.out.print(number3+" is the greatest number.");
        }
        
        sc.close();
    }
}