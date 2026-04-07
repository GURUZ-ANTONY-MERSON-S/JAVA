import java.util.*;
class Logictwo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n];
        int s[]=new int[n-1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int secmax=0;

        for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }

        for(int i=0;i<n-1;i++){
            int j=0;
            if(arr[i]<max){
                s[j]=arr[i];
                j++;
            }
        }
         secmax=s[0];
        for(int i=1;i<n-1;i++){
            if(secmax<s[i]){
                secmax=s[i];
            }
        }
        System.out.println("The second largest element in the array: "+secmax);

    }
}