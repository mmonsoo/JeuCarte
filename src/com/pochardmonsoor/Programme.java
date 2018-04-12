package com.pochardmonsoor;

import java.io.IOException;

public class Programme {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			JeuMethodes j = new JeuMethodes();
			GestionFenetreJeu jeu=new GestionFenetreJeu(j);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
