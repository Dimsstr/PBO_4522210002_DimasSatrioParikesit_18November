package matriks;

public class Matrikspecahan {
    private double[][] matrix;

    public Matrikspecahan(double[][] matrix) {
        this.matrix = matrix;
    }

    // Implementasi metode perjumlahan matriks
    public Matrikspecahan tambah(Matrikspecahan other) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] + other.matrix[i][j];
            }
        }
        return new Matrikspecahan(result);
    }

    // Implementasi metode perkurangan matriks
    public Matrikspecahan kurang(Matrikspecahan other) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] - other.matrix[i][j];
            }
        }
        return new Matrikspecahan(result);
    }

    // Implementasi metode transpose matriks
    public Matrikspecahan transpose() {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] result = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return new Matrikspecahan(result);
    }

    // Implementasi metode perkalian matriks
    public Matrikspecahan dot(Matrikspecahan other) {
        int rowsA = matrix.length;
        int colsA = matrix[0].length;
        int colsB = other.matrix[0].length;
        double[][] result = new double[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                double sum = 0.0;
                for (int k = 0; k < colsA; k++) {
                    sum += matrix[i][k] * other.matrix[k][j];
                }
                result[i][j] = sum;
            }
        }
        return new Matrikspecahan(result);
    }

    // Implementasi metode invers matriks (belum lengkap)
    public Matrikspecahan invers() {
        // Implementasi invers matriks (bisa ditambahkan nanti)
        return this;
    }

    // Metode untuk menampilkan matriks
    public void print() {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
