package OperatorPemrograman;

import java.util.Scanner;

public class Tugas13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Berikut ini manakah yang termasuk jenis operator di dalam pemrograman Java?");
        System.out.println("A. Operator Indosat");
        System.out.println("B. Operator Aritmatika");
        System.out.println("C. Operator Telkomsel");
        System.out.println("D. Operator Assignment");

        System.out.print("Jawaban Anda: ");
        String jawaban = input.nextLine();

        boolean benar = jawaban.equalsIgnoreCase("B") || jawaban.equalsIgnoreCase("D");
        System.out.println("Hasil jawaban: " + benar);

        input.close();
    }
}

