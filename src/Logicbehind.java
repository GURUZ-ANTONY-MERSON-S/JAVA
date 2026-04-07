import java.util.*;
class Logicbehind{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();

        int f=6;
        int diff=22;
        for(int i=1;i<start;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%05d ",f);

                f=f+diff;
                diff+=16;
            }
            System.out.println();
        }
    }
}
