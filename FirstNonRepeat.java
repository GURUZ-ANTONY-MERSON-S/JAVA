import java.util.Arrays;
import java.util.Scanner;

class FirstNonRepeat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int size=sc.nextInt();
		int arr[]=new int[size];

		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}

		for(int i=0; i<size; i++) {
			boolean b=true;
			for(int j=0; j<size; j++) {
				if(arr[i]==arr[j] && i!=j) {

					b=false;
					break;
				}
			}
			if(b) {
				System.out.println(arr[i]);
				return;
			}
		}
		System.out.println(-1);
	}
}