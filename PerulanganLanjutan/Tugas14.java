package PerulanganLanjutan;

import java.util.Scanner;

public class Tugas14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inputkan tinggi piramida : ");
        int tinggi = input.nextInt();

        System.out.println("Output : ");
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
