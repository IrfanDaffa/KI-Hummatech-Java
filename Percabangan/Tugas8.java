package Percabangan;

import java.util.Scanner;

public class Tugas8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan angka pertama : ");
        int angkaPertama = input.nextInt();

        System.out.print("Inputkan angka kedua : ");
        int angkaKedua = input.nextInt();

        if (angkaPertama % 2 == 0) {
            System.out.println(angkaPertama + " adalah bilangan genap");
        } else {
            System.out.println(angkaPertama + " adalah bilangan ganjil");
        }
        if (angkaKedua % 2 == 0) {
            System.out.println(angkaKedua + " adalah bilangan genap");
        } else {
            System.out.println(angkaKedua + " adalah bilangan ganjil");
        }

        input.close();
    }
}
