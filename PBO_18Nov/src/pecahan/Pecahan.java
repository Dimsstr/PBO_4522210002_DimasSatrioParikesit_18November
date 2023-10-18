package pecahan;

public class Pecahan {
    private int pembilang;
    private int penyebut;

    public Pecahan(int pembilang, int penyebut) {
        this.pembilang = pembilang;
        this.penyebut = penyebut;
    }

    // Implementasi metode perjumlahan pecahan
    public Pecahan tambah(Pecahan other) {
        int newPembilang = (this.pembilang * other.penyebut) + (other.pembilang * this.penyebut);
        int newPenyebut = this.penyebut * other.penyebut;
        return sederhanakan(new Pecahan(newPembilang, newPenyebut));
    }

    // Implementasi metode perkurangan pecahan
    public Pecahan kurang(Pecahan other) {
        int newPembilang = (this.pembilang * other.penyebut) - (other.pembilang * this.penyebut);
        int newPenyebut = this.penyebut * other.penyebut;
        return sederhanakan(new Pecahan(newPembilang, newPenyebut));
    }

    // Implementasi metode perkalian pecahan
    public Pecahan kali(Pecahan other) {
        int newPembilang = this.pembilang * other.pembilang;
        int newPenyebut = this.penyebut * other.penyebut;
        return sederhanakan(new Pecahan(newPembilang, newPenyebut));
    }

    // Implementasi metode pembagian pecahan
    public Pecahan bagi(Pecahan other) {
        int newPembilang = this.pembilang * other.penyebut;
        int newPenyebut = this.penyebut * other.pembilang;
        return sederhanakan(new Pecahan(newPembilang, newPenyebut));
    }

    // Implementasi metode sederhanakan pecahan
    private Pecahan sederhanakan(Pecahan pecahan) {
        int gcd = greatestCommonDivisor(pecahan.pembilang, pecahan.penyebut);
        return new Pecahan(pecahan.pembilang / gcd, pecahan.penyebut / gcd);
    }

    // Metode untuk mencari FPB (Faktor Persekutuan Terbesar)
    private int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return greatestCommonDivisor(b, a % b);
        }
    }

    // Metode untuk menampilkan pecahan
    public void print() {
        System.out.println(this.pembilang + "/" + this.penyebut);
    }
}
