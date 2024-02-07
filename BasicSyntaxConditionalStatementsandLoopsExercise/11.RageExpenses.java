package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class _11_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostCounts=Integer.parseInt(scanner.nextLine());
        double headsetPrice=Double.parseDouble(scanner.nextLine());
        double mousePrice=Double.parseDouble(scanner.nextLine());
        double keyboardPrice=Double.parseDouble(scanner.nextLine());
        double displayPrice=Double.parseDouble(scanner.nextLine());

        int headsetTrashCount=0;
        int mouseTrashCount=0;
        int keyboardTrashCount=0;
        int displayTrashCount=0;

        for (int i = 1; i <=lostCounts; i++) {

            if (i % 2==0) {
                headsetTrashCount++;
            }
            if (i % 3==0) {
                mouseTrashCount++;
            }
            if (i % 6==0) {
                keyboardTrashCount++;
            }
            if (i % 12==0) {
                displayTrashCount++;
            }


        }
        double totalExpenses=(headsetTrashCount*headsetPrice)+(mouseTrashCount*mousePrice)
                +(keyboardTrashCount*keyboardPrice)+(displayTrashCount*displayPrice);
        System.out.printf("Rage expenses: %.2f lv.",totalExpenses);;
    }
}
