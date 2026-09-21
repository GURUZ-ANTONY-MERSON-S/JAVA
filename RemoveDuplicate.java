import java.util.Scanner;
import java.util.HashSet;
class RemoveDuplicate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> hash=new HashSet<>();
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            hash.add(arr[i]);
        }
        System.out.println(hash);
        
        
    }
}