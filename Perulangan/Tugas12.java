package Perulangan;

import java.util.Scanner;

public class Tugas12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        while (true) {
            System.out.println("Menu :");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Keluar");
            System.out.print("Masukkan menu pilihan Anda : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih menu PENJUMLAHAN");
                    System.out.println("-----------------------------");
                    break;
                case 2:
                    System.out.println("Anda memilih menu PENGURANGAN");
                    System.out.println("-----------------------------");
                    break;
                case 3:
                    System.out.println("Program berhenti!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");
                    System.out.println("---------------------------------------");
            }
        }
    }
}
