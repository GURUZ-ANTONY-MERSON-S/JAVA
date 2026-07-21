import java.util.Scanner;
class VowelsConsonantsCount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        String str=sc.next();
        String Str=str.toLowerCase();
        
        int VowelsCount=0;
        int ConsonantsCount=0;
        
        for(int i=0;i<str.length();i++){
            char ch=Str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                VowelsCount++;
            }
            else{
                ConsonantsCount++;
            }
            
        }
        System.out.println("Vowels count = "+VowelsCount);
        System.out.println("Consonants count = "+ConsonantsCount);
        
        sc.close();
    }
}