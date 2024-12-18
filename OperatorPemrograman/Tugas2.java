package OperatorPemrograman;

import java.io.*;

public class Tugas2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inputkan nilai a : ");
        double a = Double.parseDouble(input.readLine());

        System.out.print("Inputkan nilai b : ");
        double b = Double.parseDouble(input.readLine());

        System.out.print("Inputkan nilai c : ");
        double c = Double.parseDouble(input.readLine());

        double hasil = a + b * c;
        System.out.println("Maka Hasil Perhitungan : " + hasil);
    }
}


