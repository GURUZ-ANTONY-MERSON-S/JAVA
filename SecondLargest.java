import java.util.Scanner;
import java.util.Arrays;

class SecondLargest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int size=sc.nextInt();
        if(size<2){
            System.out.println("Array size is too small to find 2nd largest element");
            return;
        }
        
        int array[]= new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        
        int Maximum=Integer.MIN_VALUE;
        int SecondMaximum=Integer.MIN_VALUE;
        
        for(int number:array){
            if(number>Maximum){
                SecondMaximum=Maximum;
                Maximum=number;
            }
            
            else if(number>SecondMaximum && Maximum!=x){
                SecondMaximum=number;
            }
        }
        
        if(SecondMaximum==Integer.MIN_VALUE){
            System.out.println("No second largest element found...");
        }
        else{
            System.out.println(SecondMaximum);
        }
        
        sc.close();
        
    }
}