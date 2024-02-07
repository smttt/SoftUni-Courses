package LabBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class _4_TimeAfter30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentHours = Integer.parseInt(scanner.nextLine());
        int currentMinutes = Integer.parseInt(scanner.nextLine());

        currentMinutes+=30;

        if (currentMinutes>59) {
            currentHours+=1;
            currentMinutes-=60;
        }
        if (currentHours>23) {
            currentHours=0;
        }
        if (currentMinutes<10){
            System.out.printf("%d:0%d",currentHours,currentMinutes);
        }else {
            System.out.printf("%d:%d", currentHours, currentMinutes);
        }
    }
}

