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
	//Etat 0: cartefachecaché    1: BatmanPerte  2: JokerGain
	private int [] tabCarteEtat= {0,0,0,0};

	//Constructeur de classe
	public FenetreJeu() {
		this.setTitle("Le jeu de carte");
		this.setSize(700, 500);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		afficherFenetreJeu();
	}
	public void afficherFenetreJeu(){
		panneau=new JPanel();
		panneau.setLayout(null);
		this.setContentPane(panneau);
		score=new JLabel();
		score.setBounds(0, 1, 400, 50);
		score.setText("Score : 0");
		panneau.add(score);
		//Création boutons
		int intpixels=0;
		//monImage = ImageIO.read(new File("carteFaceCachee.jpg"));
		ImageIcon icon=new ImageIcon ("carteFaceCachee.jpg");
		for (int i=1;i<5;i++) {
			JButton carte= new JButton();
			carte.setBounds(intpixels, 51, 150, 150);
			carte.setActionCommand("Carte,"+i);
			if(tabCarteEtat[i-1]==0) {
				icon=new ImageIcon ("carteFaceCachee.jpg");
			}
			else if (tabCarteEtat[i-1]==2){
				icon=new ImageIcon ("jokerCarte.jpg");

			}
			else if (tabCarteEtat[i-1]==1) {
				icon=new ImageIcon ("batmanCarte.jpg");
			}
			carte.setIcon(icon);
			panneau.add(carte);
			listeBouton.add(carte);
			intpixels+=170;	
		}
		rejouer=new JButton();
		rejouer.setText("Rejouer");
		rejouer.setBounds(510, 250, 150, 50);
		rejouer.setActionCommand("rejoue");
		rejouer.setVisible(false);
		panneau.add(rejouer);
		panneau.repaint();
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
	public int[] getTabCarteEtat() {
		return tabCarteEtat;
	}
	public void setTabCarteEtat(int[] tabCarteEtat) {
		this.tabCarteEtat = tabCarteEtat;
	}


}
