package Challenge;

import java.util.Scanner;

public class InputanScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan nama lengkap : ");
        String namaLengkap = input.nextLine();

        System.out.print("Inputkan umur : ");
        int umur = input.nextInt();

        System.out.print("Inputkan apakah sekolah di SMKN 4 BOJONEGORO? : ");
        boolean sekolah = input.nextBoolean();

        System.out.println("\n======= Output =======");
        System.out.println("Nama Lengkap : " + namaLengkap);
        System.out.println("Umur : " + umur +" Tahun");
        System.out.println("Sekolah di SMKN 4 BOJONEGORO? : " + sekolah);

        input.close();
    }
}
