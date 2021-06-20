 import java.util.Scanner;

public class InputSceaner {
    public static void main(String[] args) {
        String nama, alamat;
        int usia, gaji;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("### Pendataan Kariyawan PT.Petani Kode ###");
        System.out.print("Nama Kariyawan");
        nama = keyboard.nextLine();

        System.out.print("Alamat: ");
        alamat = keyboard.nextLine();

        System.out.print("Usia: ");
        usia = keyboard.nextInt();

        System.out.print("Gaji: ");
        gaji = keyboard.nextInt();

        System.out.println("---------------------");
        System.out.println("Nama Kariyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + "tahun");
        System.out.println("GAji: Rp " + gaji);

    }
}