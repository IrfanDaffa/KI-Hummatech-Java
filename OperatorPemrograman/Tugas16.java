package OperatorPemrograman;

import java.util.Scanner;

public class Tugas16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Jawab pertanyaan dengan memasukkan (ya) atau (tidak)");
        System.out.println("Apakah nilai akademik kamu lebih dari 70?");
        String nilai = input.nextLine();

        System.out.println("Apakah ketidakhadiran kamu selama 1 semester kurang dari 10?");
        String kehadiran = input.nextLine();

        String hasil = (nilai.equalsIgnoreCase("ya") && kehadiran.equalsIgnoreCase("ya")) ? "Selamat kamu naik kelas...:)" : 
        (nilai.equalsIgnoreCase("tidak") && kehadiran.equalsIgnoreCase("tidak")) ? "Selamat belajar lagi" :
        "Semangat belajar lagi";

        System.out.println(hasil);

        String tambahan = (nilai.equalsIgnoreCase("ya") && kehadiran.equalsIgnoreCase("ya")) ? "Pertahankan nilaimu" : 
        (nilai.equalsIgnoreCase("tidak") && kehadiran.equalsIgnoreCase("tidak")) ? "Maaf,kamu tidak naik kelas" :
        "Pertahankan nilaimu";

        System.out.println(tambahan);

        input.close();
    }
}

