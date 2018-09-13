import java.awt.Point;


public interface IMatrice {
    public int getLignes();
	public int getColonnes();
	public Point getIndice(int ligneI, int colonneJ);
	public int setIndice(int colonneJ);
}
