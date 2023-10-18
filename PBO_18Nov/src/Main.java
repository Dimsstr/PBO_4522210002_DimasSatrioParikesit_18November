import matriks.Matriks;
import matriks.Matrikspecahan;
import pecahan.Pecahan;

public class Main {
    public static void main(String[] args) {
        // Contoh penggunaan Pecahan
        Pecahan pecahan1 = new Pecahan(1, 2);
        Pecahan pecahan2 = new Pecahan(3, 4);

        System.out.println("2 pecahan yang ingin dieksekusi:");
        System.out.println("Pecahan 1: ");
        pecahan1.print();
        System.out.println("Pecahan 2: ");
        pecahan2.print();

        Pecahan hasilTambahPecahan = pecahan1.tambah(pecahan2);
        System.out.println("Hasil Penjumlahan Pecahan:");
        hasilTambahPecahan.print();

        Pecahan hasilKurangPecahan = pecahan1.kurang(pecahan2);
        System.out.println("Hasil Pengurangan Pecahan:");
        hasilKurangPecahan.print();

        Pecahan hasilKaliPecahan = pecahan1.kali(pecahan2);
        System.out.println("Hasil Perkalian Pecahan:");
        hasilKaliPecahan.print();

        Pecahan hasilBagiPecahan = pecahan1.bagi(pecahan2);
        System.out.println("Hasil Pembagian Pecahan:");
        hasilBagiPecahan.print();

        // Contoh penggunaan Matriks
        int[][] dataA = {{1, 2}, {3, 4}};
        int[][] dataB = {{5, 6}, {7, 8}};
        Matriks matriksA = new Matriks(dataA);
        Matriks matriksB = new Matriks(dataB);

        System.out.println("\n2 matriks bilangan bulat yang ingin dieksekusi:");
        System.out.println("Matriks A:");
        matriksA.print();
        System.out.println("Matriks B:");
        matriksB.print();

        Matriks hasilTambahMatriks = matriksA.tambah(matriksB);
        System.out.println("Hasil Penjumlahan Matriks:");
        hasilTambahMatriks.print();

        Matriks hasilKurangMatriks = matriksA.kurang(matriksB);
        System.out.println("Hasil Pengurangan Matriks:");
        hasilKurangMatriks.print();

        Matriks hasilDotMatriks = matriksA.dot(matriksB);
        System.out.println("Hasil Dot Product Matriks:");
        hasilDotMatriks.print();

        Matriks hasilTransposeMatriks = matriksA.transpose();
        System.out.println("Hasil Transpose Matriks A:");
        hasilTransposeMatriks.print();

        // Contoh penggunaan Matrikspecahan
        double[][] dataC = {{0.5, 0.25}, {0.75, 0.4}};
        double[][] dataD = {{0.1, 0.2}, {0.3, 0.4}};
        Matrikspecahan matriksC = new Matrikspecahan(dataC);
        Matrikspecahan matriksD = new Matrikspecahan(dataD);

        System.out.println("\n2 matriks pecahan yang ingin dieksekusi:");
        System.out.println("Matriks Pecahan C:");
        matriksC.print();
        System.out.println("Matriks Pecahan D:");
        matriksD.print();

        Matrikspecahan hasilTambahMatriksPecahan = matriksC.tambah(matriksD);
        System.out.println("Hasil Penjumlahan Matriks Pecahan:");
        hasilTambahMatriksPecahan.print();

        Matrikspecahan hasilKurangMatriksPecahan = matriksC.kurang(matriksD);
        System.out.println("Hasil Pengurangan Matriks Pecahan:");
        hasilKurangMatriksPecahan.print();

        Matrikspecahan hasilDotMatriksPecahan = matriksC.dot(matriksD);
        System.out.println("Hasil Dot Product Matriks Pecahan:");
        hasilDotMatriksPecahan.print();

        Matrikspecahan hasilTransposeMatriksPecahan = matriksC.transpose();
        System.out.println("Hasil Transpose Matriks Pecahan C:");
        hasilTransposeMatriksPecahan.print();
    }
}
