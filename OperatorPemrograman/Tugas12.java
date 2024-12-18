package OperatorPemrograman;

import java.util.Scanner;

public class Tugas12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan tinggi badan calon pegawai : ");
        double tinggiBadan = input.nextDouble();

        System.out.print("Inputkan nilai UN calon pegawai : ");
        int nilaiUN = input.nextInt();

        boolean memenuhiSyarat = tinggiBadan >= 160 && nilaiUN >= 80;

        System.out.println("Hasil seleksi pegawai : " + memenuhiSyarat);

        input.close();
    }
}

