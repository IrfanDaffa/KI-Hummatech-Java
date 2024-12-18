package Perulangan;

import java.util.Scanner;

public class Tugas13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int deret = 1;
        int deretSebelumnya = 1;
        int penjumlah = 0;
        System.out.print("Jumlah deret : ");
        int jumlahDeret = input.nextInt();

        int i = 1;
        do {
            System.out.print(deret + " ");
            deret = deretSebelumnya + penjumlah;
            penjumlah = deretSebelumnya;
            deretSebelumnya = deret;
            i++;
        } while (i <= jumlahDeret);

        input.close();
    }
}
