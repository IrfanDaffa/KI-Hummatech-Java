package ArrayDanArrayList;

public class Tugas12 {
    public static void main(String[] args) {
        int matriksA[][] = { { 4, 5 }, { 3, 2 } };
        int matriksB[][] = { { 6, 2 }, { 8, 4 } };

        int penjumlahanMatriks[][] = new int[2][2];

        System.out.println("matriks A");
        for (int i = 0; i < matriksA.length; i++) {
            for (int j = 0; j < matriksA[i].length; j++) {
                System.out.print(matriksA[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("\nmatriks B");
        for (int i = 0; i < matriksB.length; i++) {
            for (int j = 0; j < matriksB[i].length; j++) {
                System.out.print(matriksB[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println("\nHasil penjumlahan Matriks A + Matriks B");
        for (int i = 0; i < matriksB.length; i++) {
            for (int j = 0; j < matriksB[i].length; j++) {
                penjumlahanMatriks[i][j] = matriksA[i][j] + matriksB[i][j];
                System.out.print(penjumlahanMatriks[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
