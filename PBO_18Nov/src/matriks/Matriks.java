package matriks;

public class Matriks {
    private int[][] matrix;

    public Matriks(int[][] matrix) {
        this.matrix = matrix;
    }

    // Implementasi metode perjumlahan matriks
    public Matriks tambah(Matriks other) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] + other.matrix[i][j];
            }
        }
        return new Matriks(result);
    }

    // Implementasi metode perkurangan matriks
    public Matriks kurang(Matriks other) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] - other.matrix[i][j];
            }
        }
        return new Matriks(result);
    }

    // Implementasi metode transpose matriks
    public Matriks transpose() {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return new Matriks(result);
    }

    // Implementasi metode perkalian matriks
    public Matriks dot(Matriks other) {
        int rowsA = matrix.length;
        int colsA = matrix[0].length;
        int colsB = other.matrix[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += matrix[i][k] * other.matrix[k][j];
                }
                result[i][j] = sum;
            }
        }
        return new Matriks(result);
    }

    // Implementasi metode invers matriks (belum lengkap)
    public Matriks invers() {
        // Implementasi invers matriks (bisa ditambahkan nanti)
        return this;
    }

    // Metode untuk menampilkan matriks
    public void print() {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
