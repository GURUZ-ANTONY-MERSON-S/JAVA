import java.util.Scanner;
class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int number=sc.nextInt();

		if(number<1) {
			System.out.println("Value too low...");
			return;
		}

		int sum=0;

		for(int i=1; i<number/2; i++) {
			if(number%i==0) {
				sum+=i;
			}
		}

		if(number==sum) {
			System.out.println("The given number is perfect number.");
		}
		else {
			System.out.println("The given nunber is not a perfect number.");
		}
	}
}