package LabBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _7_TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfTheDay=scanner.nextLine();
        int age=Integer.parseInt(scanner.nextLine());

        switch (typeOfTheDay) {
            case "Weekday":
                if (age>=0 && age<=18 || age>64 && age<=122) {
                    System.out.print("12$");
                }
                else if (age>18 && age<=64) {
                    System.out.print("18$");
                } else {
                    System.out.print("Error!");
                }
                break;
            case "Weekend":
                if (age>=0 && age<=18 || age>64 && age<=122) {
                    System.out.print("15$");
                }
                else if (age>18 && age<=64) {
                    System.out.print("20$");
                } else {
                    System.out.print("Error!");
                }
                break;
            case "Holiday":
                if (age>=0 && age<=18) {
                    System.out.print("5$");
                }
                else if (age>18 && age<=64) {
                    System.out.print("12$");
                } else if (age>64 && age<=122) {
                    System.out.print("10$");
                } else {
                    System.out.print("Error!");
                }
                break;
        }
    }
}
