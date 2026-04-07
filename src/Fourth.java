/* Yogesh has a list of numbers where every number appears twice except one.
 He knows somebody removed one matching partner by mistake.
 He wants to find that single lonely number without counting every item repeatedly.
  The list may be large, so a smart trick is needed. Help Yogesh identify the unique element.
Task: Find the element that appears only once. Example: Input: 2 2 1 4 4 Output: 1 */

import java.util.*;

class Fourth{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            int count=arr[i];
           for(int j=0;j<n;j++){

           }
        }
    }
}