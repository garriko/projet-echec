package interfaceGraphique;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

<<<<<<< HEAD
=======
/**
 * 
 * @author Anne-Sophie
 * 
 * Fenêtre de la popup de demande de sauvegarde lorsque l'utilisateur 
 * quitte une partie en cours
 *
 */

>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
public class InterfacePopupSauvegarderQuitter {
	
	JFrame fenetre=new JFrame("Popup");
	Container tmp = fenetre.getContentPane();
<<<<<<< HEAD
	JButton Bouton1 = new JButton(new ImageIcon("oui.png"));
	JButton Bouton2 = new JButton(new ImageIcon("non.png"));
	JTextField texte = new JTextField("sauvegarde");
	
=======
	JButton Bouton1 = new JButton(new ImageIcon("images/oui.png"));
	JButton Bouton2 = new JButton(new ImageIcon("images/non.png"));
	JTextField texte = new JTextField("sauvegarde");
	
	/**
	 * Constructeur de la classe
	 */
>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
	public InterfacePopupSauvegarderQuitter() {
		
		Bouton1.setBounds(105, 257, 105, 52); //position x, position y, largeur, hauteur
		Bouton2.setBounds(275, 257, 105, 52); 
		texte.setBounds(22, 145, 375, 40);
		
		Ecouteur listen=new Ecouteur();
		Bouton1.addActionListener(listen);
		Bouton2.addActionListener(listen);
	
<<<<<<< HEAD
		JPanel boutonsChoix = new TestImagePanel(new ImageIcon("sauvegarderQuitter.png").getImage());
=======
		JPanel boutonsChoix = new TestImagePanel(new ImageIcon("images/sauvegarderQuitter.png").getImage());
>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
		boutonsChoix.setLayout(null);	 
		boutonsChoix.add(Bouton1);   
		boutonsChoix.add(Bouton2);
		boutonsChoix.add(texte);
		boutonsChoix.setOpaque(false);
		tmp.add(boutonsChoix);
    
		fenetre.setSize(503,377); // taille de l'image de fond
		fenetre.setResizable(false);
		fenetre.setVisible(true);
	}
	
		
	public class Ecouteur implements ActionListener{		
		public void actionPerformed(ActionEvent e){
		}
	}
	
	public static void main(String[] args){
		new InterfacePopupSauvegarderQuitter();
	}
}
