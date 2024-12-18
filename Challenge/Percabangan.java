package Challenge;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inputkan total belanja anda : ");
        int total = input.nextInt();

        if (total >= 500000) {
            System.out.println("Diskon 10%");
        }
        else if (total >= 300000) {
            System.out.println("Diskon 5%");
        }
        else if (total < 300000) {
            System.out.println("Tidak ada diskon");
        }

        input.close();
    }
}
