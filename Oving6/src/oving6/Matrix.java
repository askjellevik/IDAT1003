package oving6;


public class Matrix {


    private final int rows;
    private final int cols;
    private final double[][] data;

    public Matrix (double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            System.arraycopy(data[i], 0, this.data[i], 0, cols);
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public Matrix addMatrix(Matrix secMatrix) {

        double[][] newData = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newData[i][j] = this.data[i][j] + secMatrix.data[i][j];
            }
        }
        
        return new Matrix(newData);
    }

    public Matrix multiplyMatrix(Matrix secMatrix) {
        double[][] newData = new double[rows][secMatrix.data[0].length];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < secMatrix.data[0].length; j++) {
                for (int k = 0; k < cols; k++) {
                    newData[i][j] += data[i][k] * secMatrix.data[k][j];
                }
            }
        }
        return new Matrix(newData);

    }

    public Matrix transposeMatrix() {

        double[][] newData = new double[data[0].length][data.length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                newData[i][j] = data[j][i];
            }
        }

        return new Matrix(newData);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            sb.append("[");
            for (int j = 0; j < cols; j++) {
                sb.append(data[i][j]);
                if (j < cols - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]\n");
        }
        return sb.toString();
    }









}


