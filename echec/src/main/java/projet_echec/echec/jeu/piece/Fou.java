package projet_echec.echec.jeu.piece;
<<<<<<< HEAD

import java.util.ArrayList;

import projet_echec.echec.jeu.Case;

=======
<<<<<<< HEAD
=======
import java.util.ArrayList;

import projet_echec.echec.jeu.Case;
>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
>>>>>>> c082a5230af751e843e156e75ffd23569a6e7386
import projet_echec.echec.jeu.Piece;
<<<<<<< HEAD
import projet_echec.echec.jeu.Position;
=======
/**
 * 
 * @author Adrien
 * @version 0.0.1
 * @see Piece
 * Cette classe sert à définir les attributs de la pièce Fou.
 * 
 */
>>>>>>> 01b639306f100061a12593054ab9c9f1dd03d9da

import projet_echec.echec.jeu.Position;

/**
 * 
 * @author Adrien
<<<<<<< HEAD
 * @version 0.0.1
 * @see Piece
 * Cette classe sert à définir les attributs de la pièce Fou.
 * 
 */


/**
 * 
 * @author Adrien
=======
>>>>>>> c082a5230af751e843e156e75ffd23569a6e7386
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
