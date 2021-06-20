public class PersegiPanjang {
    public static void main(String[] args){
        int l = 15;
        int p = 5;
        int luas = luasBalok(p,l);
        System.out.println(luas);
    }
    static int luasPersegiPanjang(int luas, int panjang){
    return luas * panjang;
}
static int luasBalok(int luas, int panjang){
    return 6 * luasPersegiPanjang(luas,panjang);
}
}