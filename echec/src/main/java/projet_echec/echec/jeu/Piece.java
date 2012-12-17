package projet_echec.echec.jeu;

import java.util.ArrayList;

/**
 * 
 * @author Kevin
 * @see Case, Echiquier
 * Cette classe permet de définir ce qu’il se passe sur l’échiquier lorsque l’on veut revoir une partie
 */


public abstract class Piece {
	/**
	 * Camp de la pièce.
	 * Valeurs possibles : "blanc" ou "noir"
	 */
	protected String camp;
	
	public Piece(String camp){
		this.camp=camp;
	}
	
	public abstract ArrayList<Case> getDeplacementPossible(Case caseActuelle);
	
	
}
