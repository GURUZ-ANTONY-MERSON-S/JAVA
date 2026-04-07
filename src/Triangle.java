import java.util.*;
class Triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month you are going to stay: ");
        int month = sc.nextInt();
        if (month >= 1 && month <= 12) {

            System.out.print("Enter the rent per day: ");
            int rentPerDay = sc.nextInt();

            System.out.print("Enter the no of days you are going to stay: ");
            int days = sc.nextInt();

            if (month >= 4 && month <= 6 || month > 10 && month <= 12) {
                rentPerDay += (int) (20 * rentPerDay) / 100;

            }

            System.out.println("\n The total rent amount: " + (days * rentPerDay));


        }
        else{
            System.out.println("Invalid month entered...");
        }
    }
}