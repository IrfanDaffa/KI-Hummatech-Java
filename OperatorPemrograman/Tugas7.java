package OperatorPemrograman;

public class Tugas7 {
    public static void main(String[] args) {
        boolean hasilPerbandingan;
        int a = 10;
        int b = 15;

        System.out.println("Nilai a = " + a + "\nNilai b = " + b + "\n");

        // membandingkan apakah a sama dengan b?
        hasilPerbandingan = a == b;
        System.out.println("a == b ? " + hasilPerbandingan);

        // membandingkan apakah a tidak sama dengan b?
        hasilPerbandingan = a != b;
        System.out.println("a != b ? " + hasilPerbandingan);

        // membandingkan apakah a lebih besar dari b?
        hasilPerbandingan = a > b;
        System.out.println("a > b ? " + hasilPerbandingan);

        // membandingkan apakah a lebih kecil dari b?
        hasilPerbandingan = a < b;
        System.out.println("a < b ? " + hasilPerbandingan);

        // membandingkan apakah a lebih besar sama dengan b?
        hasilPerbandingan = a >= b;
        System.out.println("a >= b ? " + hasilPerbandingan);

        // membandingkan apakah a lebih kecil sama dengan b?
        hasilPerbandingan = a <= b;
        System.out.println("a <= b ? " + hasilPerbandingan);
    }
}
