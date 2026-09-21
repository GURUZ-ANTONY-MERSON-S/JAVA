import java.util.Scanner;
import java.util.HashSet;
class ContainDuplicates{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashSet <Integer>set=new HashSet<>();
        
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid array size.");
            return;
        }
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int x: arr){
            if(set.contains(x)){
                System.out.println("Yes this array contains duplicates.");
                return;
            }
            set.add(x);
        }
        System.out.println("All elements are unique.");
        
        sc.close();
        
    }
}