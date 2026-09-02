import java.util.*;
 class HashSetImplementation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<Character> set=new HashSet<Character>();
        String res="";
       for(int i=0;i<str.length();i++){
           if(!set.contains(str.charAt(i))){
               set.add(str.charAt(i));
               res+=str.charAt(i);
           }
       }
       
       System.out.println(res);
    }
}