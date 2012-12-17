package projet_echec.echec.jeu;

<<<<<<< HEAD
/**
 * 
 * @author Adrien
=======
import java.util.Vector;

/**
 * 
 * @author Kevin
>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
 * @version 0.0.1
 * @see 
 *
 * Cette classe abstraite permet de définir ce qu’il se passe sur l’échiquier avec comme classes filles : échiquier passif et échiquier actif (cf. Echiquier actif et Echiquier passif).
 */
<<<<<<< HEAD

public abstract class Echiquier {
=======
>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e

public abstract class Echiquier {
	/**
	 * Plateau de jeu
	 */
	protected Vector<Case> plateau;
	/**
	 * Liste des pièces toujours sur le plateau
	 */
	protected Vector<Piece> listePieceEnJeu;
	/**
	 * Liste des pièces prises
	 */
	protected Vector<Piece> listePiecePrises;
	
	
	/**
	 * Initialise l'echiquier de façon classique
	 */
	public Echiquier(){
		Variantes v = new Variantes("classique");
		this.plateau = new Vector<Case>(v.getPlateau());
		this.listePieceEnJeu = new Vector<Piece>(v.getListePieces());
		this.listePiecePrises=new Vector<Piece>();
	}
	/**
	 * Initialise l'echiquier selon la variante v
	 * @param v variante utilisée pour la partie
	 */
	public Echiquier(Variantes v)
	{
		this.plateau = new Vector<Case>(v.getPlateau());
		this.listePieceEnJeu = new Vector<Piece>(v.getListePieces());
		this.listePiecePrises=new Vector<Piece>();
	}
	
	
	
	
}
