import java.util.Scanner;
class EvenInput{
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        int i=0;
        while(i<n){
            int a=sc.nextInt();
            if(a%2==0){
                arr[i]=a;
                i++;
            }
        }
        System.out.println("--------------------------------------------");
        for(int j=0;j<n;j++){
            System.out.println(arr[j]);
            
        }
    }
}