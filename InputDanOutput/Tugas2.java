package InputDanOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tugas2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inputkan nama sekolah : ");
        String namaSekolah = input.readLine();

        System.out.print("Inputkan jarak rumah ke sekolah : ");
        double jarak = Double.parseDouble(input.readLine());

        System.out.print("Inputkan kode plat nomor kendaraan : ");
        char kodePlat = input.readLine().charAt(0);

        System.out.print("Inputkan anak ke berapa : ");
        int anakKe = Integer.parseInt(input.readLine());

        printOutput(namaSekolah, jarak, kodePlat, anakKe);
    }
    private static void printOutput(String namaSekolah, double jarak, char kodePlat, int anakKe) {
        System.out.println("\n======= Output =======");
        System.out.println("Nama Sekolah : " + namaSekolah);
        System.out.println("Jarak Rumah ke Sekolah : " + jarak + " km");
        System.out.println("Kode Plat Nomor Kendaraan : " + kodePlat);
        System.out.println("Anak ke Berapa : " + anakKe);
    }
}
