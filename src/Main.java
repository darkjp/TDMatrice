public class Main {
	public static void main(String args[]) {

		IMatrice<Integer> mint = new MatriceTab<>(6, 6, 0);
		int i, j, ii, jj;
		int valeur = 0;
		int valeur2 = mint.getColonne();
		
		for (i = 0; i < mint.getLigne(); i++)
			for (j = 0; j < mint.getColonne(); j++) {
				if (i <= j)
					mint.setIndice(i, j, valeur++);
				else mint.setIndice(i, j, valeur2--);
			}
					
		
		IMatrice<String> mstring = new MatriceTab<>(4, 4, "");

		System.out.println(mint.toString());
		System.out.println("*******");
		System.out.println(mstring.toString());
	}
}
