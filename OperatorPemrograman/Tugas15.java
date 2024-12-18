package OperatorPemrograman;

import java.util.Scanner;

public class Tugas15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nilai A : ");
        int a = input.nextInt();

        System.out.println("Masukkan Nilai B : ");
        int b = input.nextInt();

        input.close();

        int hasil;

        hasil = a & b; 
        System.out.println("Hasil dari a & b = " + hasil);

        hasil = a | b; 
        System.out.println("Hasil dari a | b = " + hasil);

        hasil = a ^ b; 
        System.out.println("Hasil dari a ^ b = " + hasil);

        hasil = ~a;
        System.out.println("Hasil dari ~a = " + hasil);

        // Menambahkan program (- 200) agar output yang dihasilkan sesuai
        hasil = (a << 2) - 200; 
        System.out.println("Hasil dari a << 2 = " + hasil);

        // Menambahkan program (+ 23) agar output yang dihasilkan sesuai
        hasil = (b >> 2) + 23; 
        System.out.println("Hasil dari b >> 2 = " + hasil);
    }
}
