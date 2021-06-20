public class Lingkaran {
    public static void main(String[] args) {
        int a = 3,14;
        int r = 256;
        int luas = luasTabung(a r);
    }
    static int luasLingkaran(int a, int r){
        return a / r;
}
static int luasTabung(int a, int r){
    return 3 * luasLingkaran(a r);
}
}