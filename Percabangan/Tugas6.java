package Percabangan;

import javax.swing.JOptionPane;

public class Tugas6 {
    public static void main(String[] args) {
        String platNomor = JOptionPane.showInputDialog("Inputkan kode plat nomor kendaraaan");

        switch (platNomor) {
            case "P":
                System.out.println("Jember, Banyuwangi, Bondowoso, Situbondo");
                break;
            case "N":
                System.out.println("Lumajang, Probolinggo, Pasuruan, Malang");
                break;
            case "S":
                System.out.println("Bojonegoro, Lamongan, Tuban, Jombang");
                break;
            default:
                System.out.println("Yang Anda inputkan tidak tersedia dalam data kami");
        }
    }
}