/* Nila has a line of gift boxes, each with some chocolates inside.
She wants to distribute only a continuous set of boxes to two children so that both get the same total chocolates.
The split should happen inside that chosen part only.
Many combinations seem possible, but only continuous boxes are allowed.
Help Nila check whether such an equal split exists.
Task:
Given an array, determine whether a continuous subarray can be split into two parts with equal sum.
Example:
Input: 1 2 3
Output: Yes
*/

import java.util.*;

public class Eight {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];int total=0;
        int rsum=0;
        int lsum=0;
        boolean bool=false;

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            total+=arr[i];
        }

        for(int i=0;i<n;i++){
            lsum+=arr[i];
            rsum=total-lsum;

            if(rsum==lsum){
                bool=true;
                break;
            }

        }
        if(bool){
            System.out.println("They are equal");
        }
        else{
            System.out.println("They are not equal");
        }



    }
}
