package com.pochardmonsoor;

import java.io.IOException;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JeuMethodes {

	//Attributs
	private int score =0;
	private int seuil=-2;

	public JeuMethodes() {
		// TODO Auto-generated constructor stub
	}

	public int [] clicCarte(int numerocarte,int [] tmpEtatCarteTab) {
		int [] tab=etatCarte();
		//Random sur l'élément du tableau qui va être le joker
		Random r = new Random();
		int choix = r.nextInt(4);
		tmpEtatCarteTab[choix]=2;
		for(int i=0;i<4;i++) {
			if(i!=choix) {
				tmpEtatCarteTab[i]=1;
			}
		}
		
		//On teste si on a gagné
		if(numerocarte==(choix+1)) {
			System.out.println("GAGNE");
			score = this.getScore() +5;
		}
		else {
			System.out.println("PERDU");
			score = this.getScore() -1;
		}
		System.out.println("Choix:"+choix);
		System.out.println("Score"+score);
		return tmpEtatCarteTab;
	}

	public int[] etatCarte() {
		int[]tabEtat = new int [4];
		for (int i=0; i<tabEtat.length; i++) {
			tabEtat[i] = 2;
		}
		Random r= new Random();
		int choix= r.nextInt(4);
		tabEtat[choix]=1;
		return tabEtat;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getSeuil() {
		return seuil;
	}

	public void setSeuil(int seuil) {
		this.seuil = seuil;
	}
}
/*
int newScore = 0;
JButton tmpCarte1=null;
ImageIcon icon1=null;
ImageIcon icon2=null;
ImageIcon icon3=null;
ImageIcon icon4=null;

if (e.getActionCommand().equals("1")) {
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
 */