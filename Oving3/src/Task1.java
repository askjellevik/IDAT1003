
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Skriv inn tallet tabellen skal starte med:");
            int inp1 = scanner.nextInt();
            System.out.println("Skriv inn tallet tabellen skal slutte med");
            int inp2 = scanner.nextInt();

            for(int i = inp1; i < inp2 + 1; ++i) {
                for(int j = 1; j < 11; ++j) {
                    System.out.println(i + " * " + j + " = " + i * j);
                }

                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Skriv inn et gyldig heltall");
            e.printStackTrace();
        } finally {
            scanner.close();
        }

    }
}
