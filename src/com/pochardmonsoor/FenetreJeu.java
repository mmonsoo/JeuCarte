package com.pochardmonsoor;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FenetreJeu extends JFrame {
	//Attributs de la classe
	private JPanel panneau;
	private JLabel score;
	private JButton carte1;
	private JButton carte2;
	private JButton carte3;
	private JButton carte4;
	private JButton rejouer;
	private BufferedImage monImage;
	private List<JButton> listeBouton = new ArrayList <JButton>();
	
	//Constructeur de classe
	public FenetreJeu() throws IOException {
		this.setTitle("Le jeu de carte");
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		afficherFenetreJeu();
	}
	public void afficherFenetreJeu() throws IOException {
		panneau=new JPanel();
		panneau.setLayout(null);
		this.setContentPane(panneau);
		score=new JLabel();
		score.setBounds(0, 1, 400, 50);
		score.setText("Score : 0");
		panneau.add(score);
		//Création boutons
		monImage = ImageIO.read(new File("carteFaceCachee.jpg"));
		carte1 = new JButton(new ImageIcon(monImage.getScaledInstance(150, 150, monImage.SCALE_FAST)));
		carte1.setBounds(0, 51, 150, 150);
		carte1.setActionCommand("cart1");
		panneau.add(carte1);
		carte2 = new JButton(new ImageIcon(monImage.getScaledInstance(150, 150, monImage.SCALE_FAST)));
		carte2.setBounds(170, 51, 150, 150);
		carte2.setActionCommand("cart2");
		panneau.add(carte2);
		carte3 = new JButton(new ImageIcon(monImage.getScaledInstance(150, 150, monImage.SCALE_FAST)));
		carte3.setBounds(340, 51, 150, 150);
		carte3.setActionCommand("cart3");
		panneau.add(carte3);
		carte4 = new JButton(new ImageIcon(monImage.getScaledInstance(150, 150, monImage.SCALE_FAST)));
		carte4.setBounds(510, 51, 150, 150);
		carte4.setActionCommand("cart4");
		panneau.add(carte4);
		rejouer=new JButton();
		rejouer.setText("Rejouer");
		rejouer.setBounds(510, 250, 150, 50);
		rejouer.setActionCommand("rejoue");
		rejouer.setVisible(false);
		panneau.add(rejouer);
		panneau.repaint();
		
		listeBouton.add(carte1);
		listeBouton.add(carte2);
		listeBouton.add(carte3);
		listeBouton.add(carte4);
		listeBouton.add(rejouer);


	}
	
	public JPanel getPanneau() {
		return panneau;
	}
	public void setPanneau(JPanel panneau) {
		this.panneau = panneau;
	}
	public JLabel getScore() {
		return score;
	}
	public void setScore(JLabel score) {
		this.score = score;
	}
	public JButton getCarte1() {
		return carte1;
	}
	public void setCarte1(JButton carte1) {
		this.carte1 = carte1;
	}
	public JButton getCarte2() {
		return carte2;
	}
	public void setCarte2(JButton carte2) {
		this.carte2 = carte2;
	}
	public JButton getCarte3() {
		return carte3;
	}
	public void setCarte3(JButton carte3) {
		this.carte3 = carte3;
	}
	public JButton getCarte4() {
		return carte4;
	}
	public void setCarte4(JButton carte4) {
		this.carte4 = carte4;
	}
	public JButton getRejouer() {
		return rejouer;
	}
	public void setRejouer(JButton rejouer) {
		this.rejouer = rejouer;
	}
	public BufferedImage getMonImage() {
		return monImage;
	}
	public void setMonImage(BufferedImage monImage) {
		this.monImage = monImage;
	}
	public List<JButton> getListeBouton() {
		return listeBouton;
	}
	public void setListeBouton(List<JButton> listeBouton) {
		this.listeBouton = listeBouton;
	}
	

}
