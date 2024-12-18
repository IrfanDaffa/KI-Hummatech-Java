package PerulanganLanjutan;

import java.util.Scanner;

public class Tugas6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            angka = input.nextInt();
            if (angka % 5 !=0) {
                continue;
            }
            total += angka;
        }
        System.out.println("Hasil penjumlahannya adalah : " + total);

        input.close();
    }
}
