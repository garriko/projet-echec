package projet_echec.echec.jeu.piece;
import projet_echec.echec.jeu.Case;
import projet_echec.echec.jeu.Piece;
import projet_echec.echec.jeu.Position;

/**
 * 
 * @author Kevin
 * @version 0.0.1
 * @see Piece
 * Cette classe sert à définir les attributs de la pièce Pion.
 * 
 */

public class Pion extends Piece {

	private boolean dejaBouge;

	public Pion(String camp) {
		super(camp);
		// TODO Auto-generated constructor stub
	}
	
	public Position[] presenceAdversaire(Case caseActuelle){
		return null;
		
	}
	
	@Override
	public Position[] getDeplacementPossible(Case caseActuelle) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return dejaBouge
	 */
	public boolean isDejaBouge() {
		return dejaBouge;
	}

	/**
	 * @param dejaBouge dejaBouge to set
	 */
	public void setDejaBouge(boolean dejaBouge) {
		this.dejaBouge = dejaBouge;
	}

}
