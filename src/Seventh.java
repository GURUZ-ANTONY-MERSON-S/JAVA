/*
Vishwa’s team receives ID cards numbered from 1 to n.
After distribution, all cards are present except one, but the remaining cards are all mixed up.
He does not want to sort the whole list because that takes extra effort.
The missing card could be anywhere in the sequence.
Help him find the single missing ID quickly.
Task:
Given numbers from 1 to n with one missing, find the missing number.
Example:
Input: n = 5
Array: 1 2 3 5
Output: 4*/
import java.util.*;
public class Seventh {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                System.out.println(i);

            }
        }

    }
}
