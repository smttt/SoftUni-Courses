package LabBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _11_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number=Integer.parseInt(scanner.nextLine());

        while (number%2!=0) {
            System.out.println("Please write an even number.");
            number=Integer.parseInt(scanner.nextLine());
        }
        System.out.print("The number is: " + Math.abs(number));
    }
}
