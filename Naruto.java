import java.util.ArrayList;

public class Naruto {
    public static void main(String[] args) {
        ArrayList kantongAjaib = new ArrayList();

        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add(532);
        kantongAjaib.add("tikus");
        kantongAjaib.add(1231234.132);
        kantongAjaib.add(true);

        kantongAjaib.remove("tikus");
        System.out.println(kantongAjaib);
        System.out.println("Kantong ajaib berisi "+ kantongAjaib.size() +" item");
    }
}