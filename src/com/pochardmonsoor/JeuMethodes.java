package com.pochardmonsoor;

import java.io.IOException;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class JeuMethodes {

	//Attributs
	private int score =0;
	private int seuil=-2;
	private boolean winlost=false;

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
			this.setWinlost(true);
		}
		else {
			System.out.println("PERDU");
			score = this.getScore() -1;
			this.setWinlost(false);
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

	public boolean isWinlost() {
		return winlost;
	}

	public void setWinlost(boolean winlost) {
		this.winlost = winlost;
	}
	
	public boolean getWinlost() {
		return winlost;
	}
	
}