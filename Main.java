public class Main {
    public static void main(String args[]) {

        Matrice<Integer> mint = new MatriceTab<Integer>(4, 4, 0);
        Matrice<String> mstring = new MatriceTab<String>(4, 4, "");

        System.out.println(mint.toString());
        System.out.println("*******");
        System.out.println(mstring.toString());
    }
}
