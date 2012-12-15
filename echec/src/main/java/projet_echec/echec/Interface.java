package projet_echec.echec;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interface {
	
	JFrame fenetre=new JFrame("Popup");
	Container tmp = fenetre.getContentPane();
	JButton Bouton1 = new JButton(new ImageIcon("oui.png"));
	JButton Bouton2 = new JButton(new ImageIcon("non.png"));
	
	public Interface() {
		
		Bouton1.setBounds(105, 175, 105, 52); //position x, position y, largeur, hauteur
		Bouton2.setBounds(275, 175, 105, 52); 
		
		Ecouteur listen=new Ecouteur();
		Bouton1.addActionListener(listen);
		Bouton2.addActionListener(listen);
	
		JPanel boutonsChoix = new TestImagePanel(new ImageIcon("popup.png").getImage());
		boutonsChoix.setLayout(null);	 
		boutonsChoix.add(Bouton1);   
		boutonsChoix.add(Bouton2);
		boutonsChoix.setOpaque(false);
		tmp.add(boutonsChoix);
    
		fenetre.setSize(517,290); // taille de l'image de fond
		fenetre.setVisible(true);
	}
	
		
	public class Ecouteur implements ActionListener{		
		public void actionPerformed(ActionEvent e){
		}
	}
	
	public static void main(String[] args){
		new Interface();
	}
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
}