package PerulanganLanjutan;

//public class Tugas7 {
    //public static void main(String[] args) {
        //for (int i = 1; i <= 5; i++) {
            //for (int j = 1; j <= 5; j++) {
                //System.out.print(i + "\t");
            //}
            //System.out.println();
        //}
    //}
//}

//Program dengan menggunakan inputan user, sehingga jumlah baris dan kolomnya 
//bisa menyesuaikan dengan yang diinputkan oleh user

import java.util.Scanner;

public class Tugas7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan jumlah baris/kolom : ");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            for (int j = 1; j <= jumlah; j++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
        input.close();
    }
}
