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
 * Fenêtre de la popup de confirmation de sauvegarde d'une partie
 *
 */

>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
public class InterfacePopupSauvegarder {
	
	JFrame fenetre=new JFrame("Popup");
	Container tmp = fenetre.getContentPane();
<<<<<<< HEAD
	JButton Bouton1 = new JButton(new ImageIcon("okSauvegarde.png"));
	JButton Bouton2 = new JButton(new ImageIcon("annulerSauvegarde.png"));
	JTextField texte = new JTextField("sauvegarde");
	
=======
	JButton Bouton1 = new JButton(new ImageIcon("images/okSauvegarde.png"));
	JButton Bouton2 = new JButton(new ImageIcon("images/annulerSauvegarde.png"));
	JTextField texte = new JTextField("sauvegarde");
	
	/**
	 * Constructeur de la classe
	 */
>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
	public InterfacePopupSauvegarder() {
		
		Bouton1.setBounds(105, 195, 103, 50); //position x, position y, largeur, hauteur
		Bouton2.setBounds(275, 195, 150, 50); 
		texte.setBounds(22, 78, 375, 40);
		
		Ecouteur listen=new Ecouteur();
		Bouton1.addActionListener(listen);
		Bouton2.addActionListener(listen);
	
<<<<<<< HEAD
		JPanel boutonsChoix = new TestImagePanel(new ImageIcon("sauvegarde.png").getImage());
=======
		JPanel boutonsChoix = new TestImagePanel(new ImageIcon("images/sauvegarde.png").getImage());
>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
		boutonsChoix.setLayout(null);	 
		boutonsChoix.add(Bouton1);   
		boutonsChoix.add(Bouton2);
		boutonsChoix.add(texte);
		boutonsChoix.setOpaque(false);
		tmp.add(boutonsChoix);
    
		fenetre.setSize(507,310); // taille de l'image de fond
		fenetre.setResizable(false);
		fenetre.setVisible(true);
	}
	
		
	public class Ecouteur implements ActionListener{		
		public void actionPerformed(ActionEvent e){
		}
	}
	
	public static void main(String[] args){
		new InterfacePopupSauvegarder();
	}
}
