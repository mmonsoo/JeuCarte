package com.pochardmonsoor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GestionFenetreJeu implements ActionListener {

	private FenetreJeu fenetreJeuCarte;
	private JeuMethodes j = new JeuMethodes();

	public GestionFenetreJeu(JeuMethodes j){
		// TODO Auto-generated constructor stub
		this.j=j;
		genererFenetreJeu(j);
	}

	public void genererFenetreJeu(JeuMethodes j) {
		this.fenetreJeuCarte = new FenetreJeu ();
		generateButtons();
	}

	/**
	 * 
	 */
	public void generateButtons() {
		for (JButton bouton : this.fenetreJeuCarte.getListeBouton()) {
			bouton.addActionListener(this);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
			CharSequence c="Carte";
			int newScore = 0;
			int [] tabCarteEtat= {0,0,0,0};
			
			if (e.getActionCommand().contains(c)) {
				System.out.println("A cliquer sur la carte : "+e.getActionCommand().split(",")[1]);
				tabCarteEtat=j.clicCarte(Integer.parseInt(e.getActionCommand().split(",")[1]),fenetreJeuCarte.getTabCarteEtat());
				newScore = j.getScore();
				j.setScore(newScore);
				if(j.getWinlost()) {
					generateSon("Gain");
				}
				else {
					generateSon("Perte");
				}
			}
			else if (e.getActionCommand().equals ("rejoue")) {
				newScore = 0;
				j.setScore(newScore);
				for(int i=0;i<4;i++) {
					tabCarteEtat[i]=0;
				}
			}
			//fenetreJeuCarte.afficherFenetreJeu();
			fenetreJeuCarte.dispose();
			//Nouvelle fenetre générée
			this.genererFenetreJeu(j);
			this.fenetreJeuCarte.setTabCarteEtat(tabCarteEtat);
			this.generateButtons();
			this.fenetreJeuCarte.afficherFenetreJeu();
			this.generateButtons();
			this.fenetreJeuCarte.getRejouer().setVisible(true);
			this.fenetreJeuCarte.getScore().setText("Score : "+newScore);
	}

	/**
	 * @param soundName
	 */
	public void generateSon(String gainperte) {
		
		if(gainperte.equals("Gain")) {
			
			try {
				String soundName="JokerLaughing.wav";
				AudioInputStream audioInputStream;
				audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
				Clip clip = AudioSystem.getClip();
				clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		else {
			String soundName="BatmanTransition.wav";
			
			try {
				AudioInputStream audioInputStream;
				audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
				Clip clip = AudioSystem.getClip();
				clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				clip.start();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (UnsupportedAudioFileException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		
		
	}

}


