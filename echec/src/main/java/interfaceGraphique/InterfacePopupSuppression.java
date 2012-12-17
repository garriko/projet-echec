package interfaceGraphique;

<<<<<<< HEAD

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
=======
import java.awt.Container;
>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
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
 * Fenêtre de l'interface graphique de la popup de confirmation de suppression 
 * d'une partie ou de la liste d'une partie
 *
 */

>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
public class InterfacePopupSuppression {
	
	JFrame fenetre=new JFrame("Popup");
	Container tmp = fenetre.getContentPane();
<<<<<<< HEAD
	JButton Bouton1 = new JButton(new ImageIcon("oui.png"));
	JButton Bouton2 = new JButton(new ImageIcon("non.png"));
	
=======
	JButton Bouton1 = new JButton(new ImageIcon("images/oui.png"));
	JButton Bouton2 = new JButton(new ImageIcon("images/non.png"));
	
	/**
	 * Constructeur de la classe
	 */
>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
	public InterfacePopupSuppression() {
		
		Bouton1.setBounds(105, 175, 105, 52); //position x, position y, largeur, hauteur
		Bouton2.setBounds(275, 175, 105, 52); 
		
		Ecouteur listen=new Ecouteur();
		Bouton1.addActionListener(listen);
		Bouton2.addActionListener(listen);
	
<<<<<<< HEAD
		JPanel boutonsChoix = new TestImagePanel(new ImageIcon("popup.png").getImage());
=======
		JPanel boutonsChoix = new TestImagePanel(new ImageIcon("images/suppression.png").getImage());
>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
		boutonsChoix.setLayout(null);	 
		boutonsChoix.add(Bouton1);   
		boutonsChoix.add(Bouton2);
		boutonsChoix.setOpaque(false);
		tmp.add(boutonsChoix);
    
		fenetre.setSize(507,286); // taille de l'image de fond
		fenetre.setResizable(false);
		fenetre.setVisible(true);
	}
	
		
	public class Ecouteur implements ActionListener{		
		public void actionPerformed(ActionEvent e){
		}
	}
	
	public static void main(String[] args){
		new InterfacePopupSuppression();
	}
<<<<<<< HEAD
}


class TestImagePanel extends JPanel {
	 
	private static final long serialVersionUID = 1L;
	private Image img;
 
	public TestImagePanel(String img) {
		this(new ImageIcon(img).getImage());
	}
 
	public TestImagePanel(Image img) {
		this.img = img;
	}
 
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
=======
>>>>>>> a8bca3d337f875e41fdcb04f3e288a7eb48b608e
}