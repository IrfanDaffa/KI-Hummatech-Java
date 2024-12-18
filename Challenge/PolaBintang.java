package Challenge;

public class PolaBintang {
    public static void main(String[] args) {
        int tinggi = 5;

        for (int i = 1; i <= tinggi; i++) {
            if(i == 4) {
                for (int k = 1; k <= 3; k++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = tinggi; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

