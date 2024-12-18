package Percabangan;

import java.util.Scanner;

public class Tugas7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inputkan angka pertama : ");
        int angkaPertama = input.nextInt();

        System.out.print("Inputkan angka kedua : ");
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
}
