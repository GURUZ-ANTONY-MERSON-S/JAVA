import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class MoveZeros {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();

		int size=sc.nextInt();
		int arr[]=new int[size];

		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
		for(int x: arr) {
			if(x!=0) {
				list.add(x);
			}
		}
		for(int i=0; i<size; i++) {
			if(i>list.size()-1) {
				arr[i]=0;
			} else {
				arr[i]=list.get(i);
			}

		}
		for(int x:arr){
		    System.out.print(x+" ");
		}
		sc.close();
	}
}