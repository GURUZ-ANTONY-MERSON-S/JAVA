import java.util.*;
public class Tenth {

    public static boolean plan(String s, int start, int end){
        while(start>end){
            if (s.charAt(start) != s.charAt(end)) {
                return false;

            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String a=sc.next();


    }
}
