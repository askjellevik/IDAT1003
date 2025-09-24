package oving6;
import java.util.Scanner;
public class Task3 {


    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);


        double[][] Adata = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double[][] Bdata = {
                {9, 8, 7},
                {6, 5, 4}
                //{3, 2, 1}
        };

        double[][] Cdata = {
                {-9, -8, -7},
                {-6, -5, -4},
                {-3, -2, -1}
        };

        Matrix A = new Matrix(Adata);
        Matrix B = new Matrix(Bdata);
        Matrix C = new Matrix(Cdata);

        System.out.println("Matrise A:");
        System.out.println(A);

        System.out.println("Matrise B:");
        System.out.println(B);

        System.out.println("Matrise C:");
        System.out.println(C);

        //^ testdata ^

        System.out.println("Velg hvilken matrise du vil jobbe ut i fra ved å skrive inn ønsket alternativ:");
        System.out.println("    1: Matrise A");
        System.out.println("    2: Matrise B");
        System.out.println("    3: Matrise C");


        try {
            int userInp = scannerObj.nextInt();
            if (userInp != 1 && userInp != 2 && userInp != 3 ) {
                throw new RuntimeException("Du kan kun skrive inn 1, 2 eller 3");
            }

            Matrix chosenMatrix;
            String chosenMatrixString;
            Matrix resultMatrix = null;
            chosenMatrixString = switch (userInp) {
                case 1 -> {
                    chosenMatrix = A;
                    yield "A";
                }
                case 2 -> {
                    chosenMatrix = B;
                    yield "B";
                }
                case 3 -> {
                    chosenMatrix = C;
                    yield "C";
                }
                default -> throw new IllegalStateException("Unexpected value: " + userInp);
            };
            System.out.println("Du valgte matrise: " + chosenMatrixString);


            System.out.println("Velg hva du ønsker å gjøre med " + chosenMatrixString + ":");
            System.out.println("    1: Addere matrisen med en annen matrise");
            System.out.println("    2: Multiplisere matrisen med en annen matrise");
            System.out.println("    3: Transponere matrisen");

            userInp = scannerObj.nextInt();
            if (userInp != 1 && userInp != 2 && userInp != 3 ) {
                throw new RuntimeException("Du kan kun skrive inn 1, 2 eller 3");
            }

            switch (userInp) {
                case 1:
                    System.out.println("Hvilken matrise vil du addere " + chosenMatrixString + " med:");
                    System.out.println("    1: Matrise A");
                    System.out.println("    2: Matrise B");
                    System.out.println("    3: Matrise C");
                    userInp = scannerObj.nextInt();
                    if (userInp != 1 && userInp != 2 && userInp != 3 ) {
                        throw new RuntimeException("Du kan kun skrive inn 1, 2 eller 3");
                    }

                    resultMatrix = switch (userInp) {
                        case 1 -> chosenMatrix.addMatrix(A);
                        case 2 -> chosenMatrix.addMatrix(B);
                        case 3 -> chosenMatrix.addMatrix(C);
                        default -> resultMatrix;
                    };
                    if (resultMatrix != null) {
                        System.out.println("Resultat:");
                        System.out.println(resultMatrix);
                    }


                    break;
                case 2:
                    System.out.println("Hvilken matrise vil du multiplisere " + chosenMatrixString + " med:");
                    System.out.println("    1: Matrise A");
                    System.out.println("    2: Matrise B");
                    System.out.println("    3: Matrise C");
                    userInp = scannerObj.nextInt();
                    if (userInp != 1 && userInp != 2 && userInp != 3 ) {
                        throw new RuntimeException("Du kan kun skrive inn 1, 2 eller 3");
                    }

                    resultMatrix = switch (userInp) {
                        case 1 -> chosenMatrix.multiplyMatrix(A);
                        case 2 -> chosenMatrix.multiplyMatrix(B);
                        case 3 -> chosenMatrix.multiplyMatrix(C);
                        default -> resultMatrix;
                    };
                    if (resultMatrix != null) {
                        System.out.println("Resultat:");
                        System.out.println(resultMatrix);
                    }
                    break;
                case 3:
                    resultMatrix = chosenMatrix.transposeMatrix();
                    if (resultMatrix != null) {
                        System.out.println("Resultat:");
                        System.out.println(resultMatrix);
                    }
                    break;

            }




        } catch (IllegalArgumentException e) {
            System.err.println("Feil: " + e.getMessage());
        } catch (RuntimeException e) {
            System.err.println("Uventet feil: " + e.getMessage());
        } finally {
            scannerObj.close();
        }








    }


}
