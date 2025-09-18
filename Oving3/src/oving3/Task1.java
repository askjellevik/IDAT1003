package oving3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        try {
            int inp1 = inputObj.nextInt();
            int inp2 = inputObj.nextInt();


            for (int i = inp1; i < inp2 + 1; i++) {
                for (int j = 1; j < 11; j++) {
                    System.out.println(i + " * " + j + " = " + i * j);
                }
            }
        } catch (Exception e) {

            e.printStackTrace();

        }
        finally {
            inputObj.close();
        }
    }
}
