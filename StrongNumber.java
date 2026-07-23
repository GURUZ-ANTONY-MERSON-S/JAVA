import java.util.Scanner;
class StrongNumber {

	public static int Factorial(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact*=i;
		}
		return fact;
	}


	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);

		int number=sc.nextInt();
		if(number<1) {
			System.out.println("Not possible.");
			return;
		}
		int duplicate=number;
		int result=0;
		int factorial=1;

		while(duplicate>0) {
			int digit=duplicate%10;
			result+=Factorial(digit);
			duplicate/=10;
		}

		if(result==number) {
			System.out.println("The given number is strong number.");
		}
		else {
			System.out.println("The given number is not a strong number.");
		}
		sc.close();
	}
}