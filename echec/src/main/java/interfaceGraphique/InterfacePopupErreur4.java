package interfaceGraphique;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

<<<<<<< HEAD
=======
/**
 * 
 * @author Anne-Sophie
 *
 * Fenêtre de l'interface graphique de la popup lançant un message d'erreur 
 * lorsque l'utilisateur tente d'ouvrir plus de quatre parties simultanément.
 *
 */

>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
public class InterfacePopupErreur4 {
	
	JFrame fenetre=new JFrame("Popup");
	Container tmp = fenetre.getContentPane();
<<<<<<< HEAD
	JButton Bouton1 = new JButton(new ImageIcon("ok.png"));

	
=======
	JButton Bouton1 = new JButton(new ImageIcon("images/ok.png"));

	/**
	 * Constructeur de la classe
	 */
>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
	public InterfacePopupErreur4() {
		
		Bouton1.setBounds(150, 215, 160, 76); //position x, position y, largeur, hauteur
		
		Ecouteur listen=new Ecouteur();
		Bouton1.addActionListener(listen);
	
<<<<<<< HEAD
		JPanel boutonsChoix = new TestImagePanel(new ImageIcon("erreur.png").getImage());
=======
		JPanel boutonsChoix = new TestImagePanel(new ImageIcon("images/erreur.png").getImage());
>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
		boutonsChoix.setLayout(null);	 
		boutonsChoix.add(Bouton1);   
		boutonsChoix.setOpaque(false);
		tmp.add(boutonsChoix);
    
		fenetre.setSize(507,376); // taille de l'image de fond
		fenetre.setResizable(false);
		fenetre.setVisible(true);
	}
	
		
	public class Ecouteur implements ActionListener{		
		public void actionPerformed(ActionEvent e){
		}
	}
	
	public static void main(String[] args){
		new InterfacePopupErreur4();
	}
}

