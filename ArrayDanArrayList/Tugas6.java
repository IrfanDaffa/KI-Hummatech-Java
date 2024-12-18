package ArrayDanArrayList;

import java.util.Scanner;

public class Tugas6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan jumlah angka : ");
        int n = input.nextInt();

        int angka[] = new int[n];

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Inputkan angka ke - " + (i + 1) + " = ");
            angka[i] = input.nextInt();
        }

        int max = angka[0];
        for (int i = 0; i < angka.length; i++) {
            if(angka[i] > max) {
                max = angka[i];
            }
        }
        System.out.println("Maka Angka terbesar adalah : " + max);
        
        input.close();
    }
}
