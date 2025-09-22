package oving6;

public class Task3 {

    public static void main(String[] args) {


        double[][] Adata = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double[][] Bdata = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        double[][] Cdata = {
                {-9, -8, -7},
                {-6, -5, -4},
                {-3, -2, -1}
        };

        Matrix A = new Matrix(Adata);
        Matrix B = new Matrix(Bdata);
        Matrix C = new Matrix(Cdata);

        System.out.println(A);
        System.out.println(B);

        System.out.println(A.addMatrix(B));
        System.out.println(A.addMatrix(C));

        System.out.println(A.transposeMatrix());

        System.out.println(A.multiplyMatrix(B));







    }


}
