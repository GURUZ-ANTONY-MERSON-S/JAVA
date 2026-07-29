import java.util.Scanner;
class SortedOrNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		if(n<1) {
			System.out.println("No elements exists.");
			return;
		}

		int arr[]=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}

		for(int i=1; i<n; i++) {
			if(arr[i - 1]>arr[i]) {
				System.out.println("The array is not sorted.");
				return;
			}
		}
		System.out.println("All elements are sorted.");
		sc.close();
	}
}