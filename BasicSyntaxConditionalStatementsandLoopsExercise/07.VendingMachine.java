package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class _7_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somOfCoins=0;

        String input=scanner.nextLine();
        while (!input.equals("Start")) {
            double coins=Double.parseDouble(input);

            if (coins==0.10 || coins==0.20 || coins==0.50 || coins==1 || coins==2){
                somOfCoins+=coins;
            }else {
                System.out.printf("Cannot accept %.2f%n",coins);
            }
            input=scanner.nextLine();

        }

        input =scanner.nextLine();
        while (!input.equals("End")) {

            switch (input) {
                case "Nuts":
                    if (somOfCoins<2.00) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    somOfCoins-=2.00;
                    System.out.println("Purchased Nuts");
                    break;
                case "Water":
                    if (somOfCoins<0.70) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    somOfCoins-=0.70;
                    System.out.println("Purchased Water");
                    break;
                case "Crisps":
                    if (somOfCoins<1.50) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    somOfCoins-=1.50;
                    System.out.println("Purchased Crisps");
                    break;
                case "Soda":
                    if (somOfCoins<0.80) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    somOfCoins-=0.80;
                    System.out.println("Purchased Soda");
                    break;
                case "Coke":
                    if (somOfCoins<1.0) {
                        System.out.println("Sorry, not enough money");
                        break;
                    }
                    somOfCoins-=1.00;
                    System.out.println("Purchased Coke");
                    break;

                default:
                    System.out.println("Invalid product");
            }
            input= scanner.nextLine();
        }
        System.out.printf("Change: %.2f",somOfCoins);


    }
}
