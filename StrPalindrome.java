public class StrPalindrome {
    import java.util.*;

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        String r=sc.next();
        StringBuilder str=new StringBuilder(r);
        
        String rev=str.reverse().toString();
        
        if(r.equals(rev)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
    
    
    }
}
