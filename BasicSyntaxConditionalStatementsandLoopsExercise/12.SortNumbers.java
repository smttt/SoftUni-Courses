package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _12_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber=Integer.parseInt(scanner.nextLine());
        int secondNumber=Integer.parseInt(scanner.nextLine());
        int thirdNumber=Integer.parseInt(scanner.nextLine());

        int[] numbers={firstNumber,secondNumber,thirdNumber};
        Arrays.sort(numbers);
        double temp= numbers[0];
        numbers[0]=numbers[2];
        numbers[2]= (int) temp;

        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
