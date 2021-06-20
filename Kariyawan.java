import java.util.HashMap;

public class Kariyawan {
    public static void main(String[] args) {
    HashMap<Integer, String> nama = new HashMap<Integer,String>();

    nama.put(1, "Feri");
    nama.put(2, "Anang");
    nama.put(3, "Riri");
    nama.put(4, "Juli");
    nama.put(5, "Dwi");
    nama.put(6, "Putra");
    nama.put(7, "Pak Ahamad");
    nama.put(8, "Pak Ali");
    nama.put(9, "Fajar");
    nama.put(10, "Udin");
    nama.put(11, "Irsyad");

    System.out.println("Isi objek nama: " + nama);
    System.out.println("Nama Kariyawan: " + nama.get(4));
    nama.remove(3);
    System.out.println("Isi objek nama: " + nama);
    nama.replace(4, "Agustus");
    System.out.println("Isi objek nama: " + nama);
}
}