public class Main {
	public static void main(String args[]) {

		IMatrice<Integer> mint = new MatriceTab<>(4, 4, 0);
		IMatrice<String> mstring = new MatriceTab<>(4, 4, "");

		System.out.println(mint.toString());
		System.out.println("*******");
		System.out.println(mstring.toString());
	}
}
