public class OperatorLogika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c;

        c = a && b;
        System.out.println("true && false = "+c);
        c = a || b;
        System.out.println("true || false = "+c);
    }
}