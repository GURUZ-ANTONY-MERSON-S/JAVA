import java.util.Scanner;
import java.util.Arrays;

class ArrayAnagram{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        if(n<=0 || m<=0){
            System.out.println("Anagram Not possible");
            return;
        }
        
        int arr1[]=new int[n];
        int arr2[]= new int[m];
        
        if(n!=m){
            System.out.println("Anagram not possible");
            return;
        }
        
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        for(int i=0;i<n;i++){
            if(arr1[i]!=arr2[i]){
                System.out.println("The given array is not an Anagram");
                return;
            }
        }
        System.out.println("The given array is an Anagram");
    }
}