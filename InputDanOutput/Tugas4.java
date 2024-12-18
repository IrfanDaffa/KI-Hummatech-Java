package InputDanOutput;

import javax.swing.JOptionPane;

public class Tugas4 {
    public static void main(String[] args) {
        String namalengkap =  JOptionPane.showInputDialog("Inputkan nama lengkap");
        int nis = Integer.parseInt(JOptionPane.showInputDialog("Inputkan NIS"));
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Inputkan umur"));

        System.out.println("\n======= Output =======");
        System.out.println("Nama Lengkap : " + namalengkap);
        System.out.println("NIS : " + nis);
        System.out.println("Umur : " + umur + " Tahun");
    }
}
