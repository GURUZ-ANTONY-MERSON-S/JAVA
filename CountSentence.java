import java.util.Scanner;

class CountSentence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String string=sc.nextLine();
        if(string.length()<1){
            System.out.println("No words...");
            return;
        }
        
        int count=1;
        for(int i=0;i<string.length();i++){
            if(string.charAt(i)==' ' &&
               (i == 0 || string.charAt(i - 1) == ' ')){
                count++;
            }
        }
        
        System.out.println(count);
        
        sc.close();
    }
}
