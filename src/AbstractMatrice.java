import java.awt.Point;

public abstract class AbstractMatrice<T> implements IMatrice<T> {
    private int mLigne;
    private int mColonne;
    private T mValue;;
    
	public AbstractMatrice (int ligne, int colonne, T t) {
		mLigne = ligne; 
		mColonne = colonne;
		mValue = t;
		}


	public int getLigne() {
	   return mLigne;   
	}
	
	public int getColonne(){
	    return mColonne;
	}
		
	public String toString () {
	   	StringBuilder strResult = new StringBuilder();
		for (int i = 0; i < getLigne(); ++i) {
			for (int j = 0; j < getColonne(); ++j) {
			    if (j == getColonne())
			         str.append("E" + getIndice(i, j) + " \n");
				else 
                    strResult.append("E" + getIndice(i, j));
			}

	    return (String)strResult;
	}
	
}