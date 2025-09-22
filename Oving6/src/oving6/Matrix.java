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

    public Matrix addMatrix(double[][] secMatrix) {

        double[][] newData = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newData[i][j] = this.data[i][j] + secMatrix[i][j];
            }
        }
        
        return new Matrix(newData);
    }







}


