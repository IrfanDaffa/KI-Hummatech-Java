package Percabangan;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan score angka : ");
        int score = input.nextInt();
        String nilaiHuruf;

        if (score >= 80 && score <= 100) {
            nilaiHuruf = "A";
        } else if (score >= 71 && score <= 80) {
            nilaiHuruf = "B";
        } else if (score >= 51 && score <= 70) {
            nilaiHuruf = "C";
        } else if (score >= 21 && score <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("Nilainya adalah " + nilaiHuruf);

        input.close();
    }
}
