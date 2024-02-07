package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class _10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyOfGeorge=Double.parseDouble(scanner.nextLine());
        int studentsCount=Integer.parseInt(scanner.nextLine());
        double lightSabersPrice=Double.parseDouble(scanner.nextLine());
        double robesPrice=Double.parseDouble(scanner.nextLine());
        double beltsPrice=Double.parseDouble(scanner.nextLine());

        double sabersPriceTotal=Math.ceil(studentsCount*1.10) * lightSabersPrice;
        double robesPriceTotal=robesPrice*studentsCount;
        double beltsPriceTotal=(studentsCount-(studentsCount/6))*beltsPrice;
        double totalPrice=sabersPriceTotal+robesPriceTotal+beltsPriceTotal;

        if (moneyOfGeorge>=totalPrice) {
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        }
        else {
            System.out.printf("George Lucas will need %.2flv more.",totalPrice-moneyOfGeorge);
        }


    }
}
