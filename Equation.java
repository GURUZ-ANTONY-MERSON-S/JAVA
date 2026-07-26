import java.util.Scanner;
class Equation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();

		int d= (b * b) - 4 * a * c;
		
		if(d<0){
		    System.out.println("Imaginary roots.");
		}
		else if(d==0){
		    System.out.println("Two real roots.");
		}
		else{
		    System.out.println("Two distinct real roots.");
		}
		
		sc.close();
	}
}