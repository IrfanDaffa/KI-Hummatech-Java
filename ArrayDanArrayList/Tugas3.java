package ArrayDanArrayList;

import java.io.*;

public class Tugas3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] laptop = new String[3];
        String[] handphone = new String[3];

        for (int i = 0; i < laptop.length; i++) {
            System.out.print("Masukkan nama merk laptop : ");
            laptop[i] = br.readLine();
        }

        for (int i = 0; i < handphone.length; i++) {
            System.out.print("Masukkan nama merk handphone : ");
            handphone[i] = br.readLine();
        }

        System.out.println();

        System.out.println("-------Data Laptop-------");
        for (int i = 0; i < laptop.length; i++) {
            System.out.println((i+1) + " " + laptop[i]);
        }

        System.out.println();

        System.out.println("-------Data Handphone-------");
        for (int i = 0; i < handphone.length; i++) {
            System.out.println((i+1) + " " + handphone[i]);
        }

    }
}
