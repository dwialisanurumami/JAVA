import java.io.Console;

public class tugas {
    public static void main(String[] args) {
        String nama;
        int usia;
        String jurusan;
        String alamat;

        Console con = System.console();
        System.out.print("Inputkan nama: ");
        nama = con.readLine();
        System.out.print("Inputkan usia: ");
        usia = Integer.parseInt(con.readLine());
        System.out.print("Inputkan jurusan: ");
        jurusan = con.readLine();
        System.out.print("Inputkan alamat: ");
        alamat = con.readLine();

        System.out.println("Nama kamu adalah: " + nama);
        System.out.println("Saat ini berusia " + usia + " tahun");
        System.out.println("Jurusanmu saat ini: " + jurusan);
        System.out.println("Alamat rumah: " + alamat);
    }
}