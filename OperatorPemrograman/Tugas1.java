package OperatorPemrograman;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan alas segitiga : ");
        double alas = input.nextDouble();

        System.out.print("Inputkan tinggi segitiga : ");
        double tinggi = input.nextDouble();

        double luasSegitiga = 0.5 * alas * tinggi;
        System.out.println("Maka luas segitiga adalah : " + luasSegitiga);

        input.close();
    }
}
