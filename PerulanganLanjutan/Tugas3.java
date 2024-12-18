package PerulanganLanjutan;

public class Tugas3 {
    public static void main(String[] args) {
        int deret = 1;
        int deretSebelumnya = 1;
        int penjumlah = 0;

        while (true) {
            System.out.print(deret + " ");
            deret = deretSebelumnya + penjumlah;
            penjumlah = deretSebelumnya;
            deretSebelumnya = deret;
            if (deret >= 200) {
                break;
            }
        }
    }
}
