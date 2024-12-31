import java.util.Scanner;

class Value {
     public double Celsius;
     public double Farenheit;
     public double ktoc;
     public double ctok;
     public double ktof;
     public double ftok;

}

class farenheit extends Value{
  
    double Fdisplay( double Celsius){
       return (Celsius * 9.0 / 5.0) + 32;

    }
   

}
 class celsius extends Value {

     double Cdisplay(double Farenheit){
        return(Farenheit - 32) * 5.0 / 9.0;
     }
    
}


class Kelvin extends Values{
    double CtoK(double Celsius){
        return (Celsius+273.15);
    }
        double KtoC(double kelvin){
            return (kelvin-273.15);
        }

      
        double FtoK(double Farenheit){
            return  (Farenheit-32)*5.0/9.0+273.15;
        }
        double KtoF (double Kelvin){
            return (Kelvin-273.15)*9.0/5.0 + 32;
        }
}
 

public class Values {
     public int choice;

    public static void main(String[] args) {
        try {

            Scanner scanner=new Scanner(System.in);
            

            celsius f=new celsius(); 
            farenheit c=new farenheit();
            Kelvin k= new Kelvin();
             
            System.out.println("\t  TEMPERATURE CONVERTER");
            System.out.println("\t =======================\n");
            System.out.println("1. celsius-farenheit\n2.farenheit-celsius\n3.Celsius-kelvin\n4.kelvin-Celsius\n5.Fahrenheit-kelvin\n6.kelvin-Fahrenheit");
            System.out.print("Enter your choice:");
            int choice=scanner.nextInt();

          

            switch(choice){
                case 1:
                    System.out.print("Enter Celsius");
                    double Celsius=scanner.nextDouble();
                    System.out.print("Farenheit:"+c.Fdisplay(Celsius)+"F");
                    break;
                case 2:
                    System.out.print("Enter fahrenheit:");
                    double Farenheit=scanner.nextDouble();
                    System.out.println("Celsius:"+f.Cdisplay(Farenheit)+"C");
                    break;
                case 3:
                    System.out.println("Enter Celsius");
                    double ctok=scanner.nextDouble();
                    System.out.println("Kelvin:"+ k.CtoK(ctok)+"K");
                    break;
                case 4:
                   System.out.println("Kelvin:");
                   double ktoc =scanner.nextDouble();
                   System.out.println("Celsius:"+k.KtoC(ktoc)+"C");
                   break;
                case 5:
                    System.out.println("Enter Fahrenheit:");
                    double ftok=scanner.nextDouble();
                    System.out.println("Kelvin:"+k.FtoK(ftok)+"K");
                    break;
                case 6:
                    System.out.println("Enter Kelvin");
                    double ktof=scanner.nextDouble();
                    System.out.println("Fahrenheit:"+k.KtoF(ktof)+"F");
                    break;

                default:
                    System.out.println("Enter a valid temperature");
                    break;

            }

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }  
    }
    

