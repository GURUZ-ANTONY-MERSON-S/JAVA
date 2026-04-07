/* Harini and the Repeated Road
Harini travels through several checkpoints during office field work.
Each checkpoint has a number, and sometimes she unknowingly passes the same checkpoint again.
She wants to know the length of the largest continuous travel segment where every checkpoint is different.
Once a checkpoint repeats, that clean segment is broken.
The route appears simple, but keeping track of repeats makes it tricky.
Task:
Given an array, find the length of the longest subarray with all distinct elements.
Example:
Input: 1 2 3 1 2 3 2 2

Output: 3 */
import java.util.*;
public class Sixth {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        HashSet<Integer> obj=new HashSet<>();

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int b:arr){
            obj.add(b);
        }
        System.out.println(obj.size());

    }
}
