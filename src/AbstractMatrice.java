public abstract class AbstractMatrice<T> implements IMatrice<T> {
	private int mLigne;
	private int mColonne;
	private T mValue;

	public AbstractMatrice(int ligne, int colonne, T t) {
		mLigne = ligne;
		mColonne = colonne;
		mValue = t;
	}

	public int getLigne() {
		return mLigne;
	}

	public int getColonne() {
		return mColonne;
	}

	public T ReadIndice(int ligneI, int colonneJ) {
		return mValue;
	}

	public T setIndice(int ligneI, int colonneJ, T t) {
		return mValue = t;
	}

	public String strResult() {
		StringBuilder strResult = new StringBuilder();
		for (int i = 0; i < getLigne(); ++i) {
			for (int j = 0; j < getColonne(); ++j) {
				if (j == getColonne())
					strResult.append("E" + ReadIndice(i, j) + " \n");
				else
					strResult.append("E" + ReadIndice(i, j));
			}
		}
		return strResult.toString();
	}

	public String toString(String s) {
		return s;

	}

}
