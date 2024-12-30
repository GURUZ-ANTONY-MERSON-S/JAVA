import java.util.Scanner;

public class Employe {
   public  String name;
    public String phNo;
   public  int age;
   public String Dept;
 void Name(String name){
    System.out.println("KURKUVIN name:"+name);
}
void phoneNumber(String phNo){
    System.out.println("Employee PH. NO:"+phNo);
}
void Age(int age){
    System.out.println("Employee Age"+age);
}
void Department(String Dept){
    System.out.println("Employee Department:"+Dept);
}

}
class Employee{
    public static void main(String[] args) {

    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Enter KURKUVIN name:");
        String name=scanner.next();

        System.out.println("Enter Employee Phone number:");
        String phNo=scanner.next();

        System.out.println("Enter Employee Age:");
        int age=scanner.nextInt();

        System.out.println("Enter Employee department:");
        String Dept=scanner.next(); 
    
       

        Employe obj=new Employe();
        obj.Name(name);
        obj.Age(age);
        obj.Department(Dept);
        obj.phoneNumber(phNo); 
    }
        catch (Exception E){
            System.out.println(E);
        }
    }
    
    
    } 
