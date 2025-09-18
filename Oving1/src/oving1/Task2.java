package oving1;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("Skriv inn antall timer:");
        Scanner scanner = new Scanner(System.in);

        try {
            int timer = scanner.nextInt();

            System.out.println("Skriv inn antall minutter:");
            int minutter = scanner.nextInt();

            System.out.println("Skriv inn antall sekunder:");
            int sekunder = scanner.nextInt();

            int totalSekunder = timer * 3600 + minutter * 60 + sekunder;
            System.out.println("Totalt antall sekunder: " + totalSekunder);
        }
        catch (Exception e) {
        System.err.println(e.getMessage());
            System.out.println("Du skrev sannsynligvis inn et ugyldig tall.");
    }
        finally {
            scanner.close();
        }
    }

}
