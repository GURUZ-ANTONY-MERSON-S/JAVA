import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class ReverseList
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(32);
        list.add(9);
        list.add(98);
        list.add(0);
        
        Collections.sort(list,Collections.reverseOrder());
        
        for(int x: list){
            System.out.println(x);
        }
    }
}