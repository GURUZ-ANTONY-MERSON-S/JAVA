 import java.util.Scanner;
import javax.naming.spi.DirStateFactory;

 class Input {
    public double height;
    public double weight; 
    public double result;
    
}
class  Calc{
  void find(double Sheight, double weight){
     double result=weight/Sheight;

     if(result<=18.5){
        System.out.println("You are Thin");
     } 
     else if((result>18.5)&&(result<=24.9)){
        System.out.println("You are healthy");
     }
     else if((result>=25)&&(result<=29.9)){
        System.out.println("you are Overweight");
     }
     else{
        System.out.println("you are obese");

     }
    }

}




public class BMI {
 
    public static void main(String[] args) {
        try{
        Scanner sc=new Scanner(System.in);


        System.out.println("Enter height");
        double height=sc.nextDouble();
        double heightCal=height/100;
        double Sheight=(heightCal*heightCal);
        
        System.out.println("Enter Your weight:");
        double weight=sc.nextDouble();

        Calc c=new Calc();
        c.find(Sheight, weight);

       
      }catch(Exception e){
        System.out.println(e);
      }
     
    }
}