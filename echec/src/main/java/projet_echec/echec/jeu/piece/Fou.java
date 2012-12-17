package projet_echec.echec.jeu.piece;

import java.util.ArrayList;

import projet_echec.echec.jeu.Case;

import projet_echec.echec.jeu.Piece;

import projet_echec.echec.jeu.Position;

/**
 * 
 * @author Adrien
 * @version 0.0.1
 * @see Piece
 * Cette classe sert à définir les attributs de la pièce Fou.
 * 
 */


/**
 * 
 * @author Adrien
 * @version 0.0.1
 * @see Piece
 * Cette classe sert à définir les attributs de la pièce Fou.
 * 
 */

public class Fou extends Piece {

	public Fou(String camp) {
		super(camp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Case> getDeplacementPossible(Case pos) {
				ArrayList<Case> lp= new ArrayList<Case>();
				Case hd = new Case(new Position(pos.getPosition().getHauteur(),pos.getPosition().getLargeur()));
				Case hg = new Case(new Position(pos.getPosition().getHauteur(),pos.getPosition().getLargeur()));
				Case bd = new Case(new Position(pos.getPosition().getHauteur(),pos.getPosition().getLargeur()));
				Case bg = new Case(new Position(pos.getPosition().getHauteur(),pos.getPosition().getLargeur()));
				for (int i=0;i<8;i++){
				hd.setPosition(hd.getPosition())
				if(isDeplacementOk(c)){
					lp.add(c);
					}
				}
		return lp;

		}
	}

}
