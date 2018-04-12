package com.pochardmonsoor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

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
		if (e.getActionCommand().equals("cart1")) {
			newScore = j.clicCarte();
		}
		else if (e.getActionCommand().equals("cart2")) {
			newScore = j.clicCarte();
		}
		else if(e.getActionCommand().equals("cart3")) {
			newScore = j.clicCarte();
		}
		else if (e.getActionCommand().equals("cart4")) {
			newScore = j.clicCarte();
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
			genererFenetreJeu(j);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		fenetreJeuCarte.getScore().setText("Score : "+newScore);
	}
}


