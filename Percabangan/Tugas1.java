package Percabangan;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int belanja;

        System.out.print("Inputkan total belanja anda : ");
        belanja = input.nextInt();

        if (belanja >= 500000) {
            System.out.println("Selamat! anda mendapatkan hadiah gantungan kunci");
        }

        input.close();
    }
}