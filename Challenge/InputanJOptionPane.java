package Challenge;

import javax.swing.JOptionPane;

public class InputanJOptionPane {
    public static void main(String[] args) {
        String namaSekolah =  JOptionPane.showInputDialog("Inputkan Nama Sekolah");
        Double jarak = Double.parseDouble(JOptionPane.showInputDialog("Inputkan Jarak Rumah Ke Sekolah"));
        int kelas = Integer.parseInt(JOptionPane.showInputDialog("Inputkan Kelas"));

        System.out.println("\n======= Output =======");
        System.out.println("Nama Sekolah : " + namaSekolah);
        System.out.println("Jarak Rumah Ke Sekolah : " + jarak + " Km");
        System.out.println("Kelas : " + kelas + " RPL 3");
    }
}
