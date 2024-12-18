package InputDanOutput;

import java.util.Scanner;
import java.util.Locale;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan nama lengkap : ");
        String namaLengkap = input.nextLine();

        System.out.print("Inputkan usia : ");
        int usia = input.nextInt();

        System.out.print("Inputkan kota asal : ");
        input.nextLine();
        String kotaAsal = input.nextLine();

        System.out.print("Inputkan tinggi (angka desimal) : ");
        input.useLocale(Locale.US);
        double tinggiBadan = input.nextDouble();

        System.out.println("======= Output =======");
        System.out.println("Nama Lengkap : " + namaLengkap);
        System.out.println("Usia : " + usia + " Tahun");
        System.out.println("Kota Asal : " + kotaAsal);
        System.out.println("Tinggi Badan : " + tinggiBadan);

        input.close();
    }
}
