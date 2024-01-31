package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class _5_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String correctPassword = new StringBuilder(username).reverse().toString();
        int attempts=0;

        String enteredPassword=scanner.nextLine();
        while (!enteredPassword.equals(correctPassword)) {
            attempts++;
            if (attempts==4) {
                System.out.println("User " + username + " blocked!");
                return;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword=scanner.nextLine();

        }
        System.out.println("User " + username + " logged in.");
    }
}
