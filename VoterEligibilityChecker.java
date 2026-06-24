import java.util.*;

class VoterEligibilityChecker{
    
      String ageCheck(int age){
        if(age<18){
            throw new ArithmeticException("You are not eligible");
        }
        return "You can vote this year...";
    }
    public static void main(String [] args){
        
        VoterEligibilityChecker obj=new VoterEligibilityChecker();
        Scanner sc=new Scanner(System.in);
        
        System.out.print("\t ...VOTER ELIGIBILITY CHECKER...\n");
        System.out.print("Enter your age: ");
        
        try{
             int age=sc.nextInt();
             System.out.println(obj.ageCheck(age));
        }
        catch(Exception e){
            System.out.println(e+"\" Enter the valid age\"");
        }
        
    }
}