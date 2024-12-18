package Challenge;

import java.io.*;

public class InputanBuffereader {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Inputkan nama lengkap : ");
        String namaLengkap = input.readLine();
        
        System.out.print("Inputkan nomor absen : ");
        int nomorAbsen = Integer.parseInt(input.readLine());

        System.out.print("Inputkan jenis kelamin : ");
        char jenisKelamin = input.readLine().charAt(0);

        System.out.println("======= Output =======");
        System.out.println("Nama Lengkap : " + namaLengkap);
        System.out.println("Nomor Absen : " + nomorAbsen);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
    }
}
