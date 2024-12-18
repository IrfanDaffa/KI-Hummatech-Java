package InputDanOutput;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan jenis kelamin : ");
        String jenisKelamin = input.nextLine();

        System.out.print("Inputkan nomor sepatu : ");
        int nomorSepatu = input.nextInt();

        System.out.print("Inputkan apakah sudah menikah? : ");
        boolean sudahMenikah = input.nextBoolean();

        System.out.println("\n======= Output =======");
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Nomor Sepatu : " + nomorSepatu);
        System.out.println("Sudah Menikah? : " + sudahMenikah);

        input.close();

    }
}
