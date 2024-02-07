package LabBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _6_ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country=scanner.nextLine();

        switch (country) {
            case "USA":
            case "England":
                System.out.print("English");
                break;
            case "Argentina":
            case "Mexico":
            case "Spain":
                System.out.print("Spanish");
                break;
            default:
                System.out.print("unknown");
                break;
        }
    }
}
