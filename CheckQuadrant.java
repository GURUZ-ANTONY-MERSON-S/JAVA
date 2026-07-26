import java.util.Scanner;
class CheckQuadrant{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        
        if(x==0 && y==0){
            System.out.println("Origin");
        }
        else if(x!=0 && y==0){
            System.out.println("On x-axis.");
        }
        else if(x==0 && y!=0){
            System.out.println("On y-axis.");
        }
        else if(x>0 && y>0){
            System.out.println("First quadrant");
        }
        else if(x<0 && y>0){
            System.out.println("Second quadrant.");
        }
        else if(x<0 && y<0){
            System.out.println("Third quadrant.");
        }
        else{
            System.out.println("Fourth quadrant.");
        }
        
        sc.close();
    }
}