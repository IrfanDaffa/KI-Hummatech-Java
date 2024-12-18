package ArrayDanArrayList;

import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan jumlah angka : ");
        int n = input.nextInt();

        int angka[] = new int[n];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Inputkan angka ke - " + (i + 1) + " = ");
            angka[i] = input.nextInt();
        }

        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            total = total + angka[i];
        }
        System.out.println("\nMaka total angkanya adalah : " + total);

        input.close();
    }
}
