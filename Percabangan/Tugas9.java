package Percabangan;

import java.util.Scanner;

public class Tugas9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihan Menu :");
        System.out.println("1. Penentuan Angka Terbesar");
        System.out.println("2. Penentuan Angka Ganjil dan Genap");
        System.out.print("Masukkan Pilihan Anda : ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                PenentuanAngkaTerbesar();
                break;
            case 2:
                PenentuanAngkaGanjilDanGenap();
                break;
            default:
                System.out.println("Angka yang anda inputkan tidak tersedia");
        }

        input.close();
    }

    private static void PenentuanAngkaTerbesar() {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan angka pertama: ");
        int angkaPertama = input.nextInt();

        System.out.print("Inputkan angka kedua: ");
        int angkaKedua = input.nextInt();

        if (angkaPertama > angkaKedua) {
            System.out.println("Angka terbesar adalah : " + angkaPertama);
        } else if (angkaKedua > angkaPertama) {
            System.out.println("Angka terbesar adalah : " + angkaKedua);
        } else {
            System.out.println("Angka pertama dan kedua sama besar : " + angkaPertama);
        }

        input.close();
    }

    private static void PenentuanAngkaGanjilDanGenap() {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan angka pertama : ");
        int angkaPertama = input.nextInt();

        System.out.print("Inputkan angka kedua : ");
        int angkaKedua = input.nextInt();

        if (angkaPertama % 2 == 0) {
            System.out.println(angkaPertama + " adalah bilangan genap.");
        } else {
            System.out.println(angkaPertama + " adalah bilangan ganjil.");
        }

        if (angkaKedua % 2 == 0) {
            System.out.println(angkaKedua + " adalah bilangan genap.");
        } else {
            System.out.println(angkaKedua + " adalah bilangan ganjil.");
        }

        input.close();
    }
}

