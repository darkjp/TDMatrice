public interface IMatrice<T> {

	public int getLigne();

	public int getColonne();

	public T ReadIndice(int ligneI, int colonneJ);

	public T setIndice(int ligneI, int colonneJ, T t);
}
