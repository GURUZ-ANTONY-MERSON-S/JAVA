import java.util.Scanner;

class Calc{
    public int a;
    public int b;

    void Add(int a, int b){
        System.out.println("Sum:"+a+b);
    }
    void Sub(int a ,int b){
        System.out.println("Sub:"+ (a-b));
    }
    void Multiply(int a ,int b){
        System.out.println("Product:"+(a*b));
    }
     void Divide(int a, int b){
        System.out.println("Divide:"+a/b);
    }
    void Modulo(int a, int b){
        System.out.println("Mod:"+a%b);
    }
}
class Operation extends Calc{
     public int choice;
   public int ch;
    void Calculate(){

    
    System.out.println("\t CALCULATOR");
    Scanner sc=new Scanner(System.in);
    System.err.println("1. Add\n 2. Sub\n 3. Multiply\n 4.Divide\n Modulo");
    int choice=sc.nextInt();
    sc.close();
   do { 
        switch (choice) {
            case 1 :
                Add(a,b);
                break;
            case 2:
                Sub(a, b);
                break;
            case 3:
                 Multiply(a, b);
                 break;
            case 4:
                 Divide(a, b);
                 break;
            case 5:
                Modulo(a,b);
                break;
            default:
                System.out.println("Enter a valid choice:");
        }
        Scanner A=new Scanner(System.in);
        System.out.println("Do you want to continue?");
        String ch=A.next();
    }    while (ch=='y'|| ch=='Y');
        
    }

    }
class Calculator{
    public static void main(String[] args) throws Exception{
   
       try {
           Scanner scanner=new Scanner(System.in);
           System.out.println("Enter first input:");
          
           int a = scanner.nextInt();
           System.out.println("Enter second Input:");
           int b=scanner.nextInt();
       } 
       catch (Exception E) {
        System.out.println(E);
       } 
       Operation obj=new Operation();
       obj.Calculate();
    }
}
