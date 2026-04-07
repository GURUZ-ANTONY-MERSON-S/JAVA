/* Meena is arranging a small company event and writes all guest names in a list.
Because she is busy, sometimes the same guest name is written more than once.
She wants to quickly find the first name that appears again while reading from left to right.
A name may repeat many times, but only the earliest repeated one matters.
Help Meena identify that first repeated guest name.
Task:
Given a list of names/numbers, find the first repeating element.
Example:
Input: 4 5 1 2 5 1 4
Output: 5
 */

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


       HashSet<Integer> obj;
        obj = new HashSet<>();

        for (int i=0;i<n;i++){
            if(obj.contains(arr[i])){
                System.out.println(arr[i]);
                break;
            }
            else{
                obj.add(arr[i]);
            }
        }
    }
}