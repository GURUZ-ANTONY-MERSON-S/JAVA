import java.util.Scanner;
class TargetCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int count=0;
        
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                count++;
            }
        }
        
        if(count==0){
            System.out.println("No element present");
        }
        else{
            System.out.println(count);
        }
    }
}