package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class _4_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber=Integer.parseInt(scanner.nextLine());
        int stopNumber=Integer.parseInt(scanner.nextLine());
        int sum=0;

        for (int i = startNumber; i <=stopNumber ; i++) {
            sum+=i;
            System.out.print(i +" ");

        }
        System.out.printf("%nSum: %d",sum);
    }
}
