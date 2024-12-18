package OperatorPemrograman;

import javax.swing.JOptionPane;

public class Tugas5 {
    public static void main(String[] args) {
        int jumlahSirup = 5;
        int jumlahDeterjen = 6;
        int jumlahMieInstan = 10;

        int inputSirup = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah sirup yang datang?"));
        int inputDeterjen = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah deterjen yang datang"));
        int inputMieInstan = Integer.parseInt(JOptionPane.showInputDialog("Berapa jumlah mie instan yang datang"));

        jumlahSirup += inputSirup;
        jumlahDeterjen += inputDeterjen;
        jumlahMieInstan += inputMieInstan;

        System.out.println("Berikut ini daftar stok barang yang ada di toko");
        System.out.println("Sirup: " + jumlahSirup + " botol");
        System.out.println("Deterjen: " + jumlahDeterjen + " bungkus");
        System.out.println("Mie Instan: " + jumlahMieInstan + " bungkus");
    }
}
