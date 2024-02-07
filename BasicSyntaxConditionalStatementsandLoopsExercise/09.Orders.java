package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class _9_Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int orders=Integer.parseInt(scanner.nextLine());
        double totalSum=0;

        for (int i = 1; i <=orders; i++) {

            double pricePerCapsule=Double.parseDouble(scanner.nextLine());
            int days=Integer.parseInt(scanner.nextLine());
            int capsuleCount=Integer.parseInt(scanner.nextLine());

            double total=(days*capsuleCount) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n",total);
            totalSum+=total;

        }
        System.out.printf("Total: $%.2f",totalSum);
    }
}
