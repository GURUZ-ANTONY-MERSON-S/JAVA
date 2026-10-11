import java.util.Scanner;

class javaSample{
    public static void main(String[] args) {
        

        Scanner scc=new Scanner(System.in);


        System.out.println("Enter your grade:");
        float percent=scc.nextFloat();

        if(percent>=85){
            System.out.println("You are eligible for premium package");
        }
        else if(percent>=60 && percent<85 ){
            System.out.println("You are eligible for medium package");

        }
        else{
            System.out.println("Sorry you are not elligible for placement");
        }

    }
}