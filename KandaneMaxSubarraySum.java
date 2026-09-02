
/*
 * maximum sub array sum using the kandane's algorithm...
 *
 */
import java.util.Scanner;
class KandaneMaxSubarraySum {
	public static void main(String[] ar) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}


		int current=arr[0];
		int maximum=arr[0];
		for(int i=1; i<n; i++) {
			current=Math.max(arr[i], current+arr[i]);
			maximum=Math.max(current, maximum);
		}

		System.out.println(maximum);
	}
}