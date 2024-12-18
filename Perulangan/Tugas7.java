package Perulangan;

import java.util.Scanner;

public class Tugas7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int penambahan = 2;
        int nilai = 3;


        System.out.print("Inputkan jumlah deret : ");
        int jumlahderet = input.nextInt();

        for (int i = 1; i <= jumlahderet; i++) {
            System.out.print(nilai + "\t");
            nilai += penambahan;
            penambahan++;
        }

        input.close();
    }
}