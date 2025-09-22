package oving6;


public class Matrix {


    private final int rows;
    private final int cols;
    private final double[][] data;

    public Matrix (double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new double[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Matrix addMatrix() {

        double[][] newData = new double[rows][cols];
        return new Matrix(newData);
    }



    public static void main(String[] args) {

    }

}


