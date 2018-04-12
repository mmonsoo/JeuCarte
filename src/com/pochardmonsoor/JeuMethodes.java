package com.pochardmonsoor;

import java.util.Random;

public class JeuMethodes {

	//Attributs
	private int score =0;
	private int seuil=-2;

	public JeuMethodes() {
		// TODO Auto-generated constructor stub
	}

	public int clicCarte() {
		Random r= new Random();
		int choix = r.nextInt(4);
		if ((choix == 0) || (choix == 1) || (choix == 2)) {
			score = this.getScore() -1;
		}
		else {
			score = this.getScore() +5;
		}
		return score;
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
