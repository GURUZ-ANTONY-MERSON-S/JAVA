import java.util.Scanner;

class Palindrome {
    
    public static boolean palindrome(String str){
        String reverse="";
        for(int i=str.length() - 1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        return reverse.equals(str);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
       
       System.out.println(palindrome(str));

        sc.close();
    }
}