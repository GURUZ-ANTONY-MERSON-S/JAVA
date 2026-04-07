import java.util.*;
class Logic{
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<i;j++){
                int value = (int)((8 * Math.pow(i, 2)) - (2 * i));
                System.out.printf("%05d",value);
                count++;
            }
        }
    }
}