import java.util.Scanner;
import java.util.ArrayList;

class RemoveElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        ArrayList <Integer> list=new ArrayList<>();
        
        System.out.println("Number of element to be added: ");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            int number=sc.nextInt();
            
            list.add(number);
        }
        
        for(int i=0;i<list.size();i++){
            int num=list.get(i);
            for(int j=i + 1;j<list.size();j++){
                if(num==list.get(j) && i!=j){
                    list.remove(j);
                    j--;
                }
            }
        }
        
        for(int result: list){
            System.out.print(result+" ");
        }
        sc.close();
    }
}