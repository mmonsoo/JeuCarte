package com.pochardmonsoor;

import java.util.Random;

public class JeuMethodes {

	//Attributs
	private int score =0;
	private int seuil=-2;

	public JeuMethodes() {
		// TODO Auto-generated constructor stub
	}

	public int [] clicCarte(int numerocarte) {
		int [] tab=etatCarte();
		int [] tab= new int [2];
		Random r = new Random();
		int choix = r.nextInt(4);
		tab[0]=choix;
		if (choix==3) {
			score = this.getScore() +5;
		}
		else {
			score = this.getScore() -1;
		}
		tab[1]=score;
		System.out.println("Choix:"+choix);
		System.out.println("Score"+score);
		return tab;
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
