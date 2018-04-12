package com.pochardmonsoor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GestionFenetreJeu implements ActionListener {

	private FenetreJeu fenetreJeuCarte;
	private JeuMethodes j = new JeuMethodes();

	public GestionFenetreJeu(JeuMethodes j) throws IOException {
		// TODO Auto-generated constructor stub
		this.j=j;
		genererFenetreJeu(j);
	}

	public void genererFenetreJeu(JeuMethodes j) throws IOException {
		this.fenetreJeuCarte = new FenetreJeu ();
		for (JButton bouton : this.fenetreJeuCarte.getListeBouton()) {
			bouton.addActionListener(this);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int newScore = 0;
		JButton tmpCarte1=null;
		ImageIcon icon1=null;
		ImageIcon icon2=null;
		ImageIcon icon3=null;
		ImageIcon icon4=null;
		if (e.getActionCommand().equals("cart,1")) {
			int tab[]=j.clicCarte("cart1");
			newScore = tab[1];
			//System.out.println(j.clicCarte()[1]);
			if(tab[0]==3) {
				System.out.println("GAGNE");
				icon1=new ImageIcon("jokerCarte.jpg");
				icon2=new ImageIcon ("batmanCarte.jpg");
				icon3=new ImageIcon ("batmanCarte.jpg");
				icon4=new ImageIcon ("batmanCarte.jpg");
				
			}
			else {
				System.out.println("GAGNE");
				icon1=new ImageIcon("batmanCarte.jpg");
			}

		}
		else if (e.getActionCommand().equals("cart2")) {
			int tab[]=j.clicCarte();
			newScore = tab[1];
			//System.out.println(j.clicCarte()[1]);
			if(tab[0]==3) {
				System.out.println("GAGNE");
				icon2=new ImageIcon("jokerCarte.jpg");
				icon1=new ImageIcon ("batmanCarte.jpg");
				icon3=new ImageIcon ("batmanCarte.jpg");
				icon4=new ImageIcon ("batmanCarte.jpg");
			}
			else {
				System.out.println("GAGNE");
				icon2=new ImageIcon("batmanCarte.jpg");
			}
		}
		else if(e.getActionCommand().equals("cart3")) {
			int tab[]=j.clicCarte();
			newScore = tab[1];
			//System.out.println(j.clicCarte()[1]);
			if(tab[0]==3) {
				System.out.println("GAGNE");
				icon3=new ImageIcon("jokerCarte.jpg");
				icon2=new ImageIcon ("batmanCarte.jpg");
				icon1=new ImageIcon ("batmanCarte.jpg");
				icon4=new ImageIcon ("batmanCarte.jpg");
			}
			else {
				System.out.println("GAGNE");
				icon3=new ImageIcon("batmanCarte.jpg");
			}
		}
		else if (e.getActionCommand().equals("cart4")) {
			int tab[]=j.clicCarte();
			newScore = tab[1];
			//System.out.println(j.clicCarte()[1]);
			if(tab[0]==3) {
				System.out.println("GAGNE");
				icon4=new ImageIcon("jokerCarte.jpg");
				icon2=new ImageIcon ("batmanCarte.jpg");
				icon3=new ImageIcon ("batmanCarte.jpg");
				icon1=new ImageIcon ("batmanCarte.jpg");
			}
			else {
				System.out.println("GAGNE");
				icon4=new ImageIcon("batmanCarte.jpg");
			}
		}
		else if (e.getActionCommand().equals ("rejoue")) {
			newScore = 0;
		}
		try {
			fenetreJeuCarte.afficherFenetreJeu();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		fenetreJeuCarte.dispose();
		try {
			//Nouvelle fenetre générée
			genererFenetreJeu(j);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		fenetreJeuCarte.getRejouer().setVisible(true);
		fenetreJeuCarte.getScore().setText("Score : "+newScore);
		fenetreJeuCarte.getCarte1().setIcon(icon1);
		fenetreJeuCarte.getCarte2().setIcon(icon2);
		fenetreJeuCarte.getCarte3().setIcon(icon3);
		fenetreJeuCarte.getCarte4().setIcon(icon4);
	}
}


