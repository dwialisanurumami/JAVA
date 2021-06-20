import java.util.HashMap;

public class UbahCobaHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> days = new HashMap<Integer, String>();

        days.put(1, "Minggu");
        days.put(2, "Senin");
        days.put(3, "Selasa");
        days.put(4, "Rabu");
        days.put(5, "kamis");
        days.put(6, "Jum'at");
        days.put(7, "Sabtu");

        days.put(1, "Ahad");
        days.replace(4, "Rebo");
        System.out.println("Isi objek days: " + days);
    }
}