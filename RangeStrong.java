import java.util.Scanner;
class RangeStrong {
	public static int Strong(int i) {
	    int calc=1;
		for(int j=1; j<=i; j++) {
			calc*=j;
		}
		return calc;
	}

	public static boolean Range(int x) {

		int val=x;
		int fin=x;
		int sum=0;

		while(fin>0) {
			int digi=fin%10;
			sum+=Strong(digi);
			fin/=10;
		}

		if(sum==x) {
			return true;
		}
		return false;
	}
	public static int Strong(int a, int b) {
	    int count=0;
	    
		for(int i=a; i<=b; i++) {
			boolean blue=Range(i);
			if(blue) {
				System.out.print(i+" ");
				count++;
			}

		}
		return count;

	}

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);

		int number1=sc.nextInt();
		int number2=sc.nextInt();

		System.out.println("\n count: "+Strong(number1,number2));

	}
}