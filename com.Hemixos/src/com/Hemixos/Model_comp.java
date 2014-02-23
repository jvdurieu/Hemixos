package com.Hemixos;

import gui_music_manager.Gmm_PlayerInfoLecture;
import gui_music_manager.Gmm_PlayerInfoVolume;
import gui_music_manager.Gmm_Window;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;


/**
 * 
 * Ce model connait la r�f�rence de certains �l�ments n�cessaires a diff�rent moment de l'ex�cution par des instances tr�s vari�es
 * 
 * @author Jean-Vital
 *
 */
public class Model_comp {



	private Model model;
	
	
	protected Gmm_PlayerInfoVolume jpVolume;
	public Gmm_PlayerInfoLecture jpInfo;
	public Gmm_Window gmm_Window;

	public JPanel jpHeadSpacerLeft;
	public JPanel jpHeadSpacerRight;

	public JList jlArtistes;
	public JTable jtTableTrack;

	public JButton jbPlay;
	public JButton jbNext;
	public JButton jbPrevious;

	public JButton jbRandom;
	public JButton jbRepeat;

	
	
	
	/**
	 * Constructor
	 * @param model
	 */
	public Model_comp(Model model) {
		
		this.model = model;
		
	}

	//public void regJpVolume(GmmC_Volume gmmC_Volume) {
	//	this.jpVolume = gmmC_Volume;
	//}

	public void regJpInfo(Gmm_PlayerInfoLecture gmm_PlayerInfoLecture) {
		this.jpInfo = gmm_PlayerInfoLecture;
	}

	public void regJpVolume(Gmm_PlayerInfoVolume gmm_PlayerInfoVolume) {
		this.jpVolume = gmm_PlayerInfoVolume;
	}

	public void regJfFrame(Gmm_Window gmm_Window) {
		this.gmm_Window = gmm_Window;		
	}
	
	public void regJpHeadSpacerLeft(JPanel j) {
		this.jpHeadSpacerLeft = j;
	}
	
	public void regJpHeadSpacerRight(JPanel j) {
		this.jpHeadSpacerRight = j;
	}

	public void regJlArtist(JList jlArtistes) {
		this.jlArtistes = jlArtistes;
	}
	
	public void regJtTableTrack(JTable jtTableTrack) {
		this.jtTableTrack = jtTableTrack;
	}
	
	public void regJbPlay(JButton play) {
		this.jbPlay = play;
	}

	public void regJbNext(JButton jbNext) {
		this.jbNext = jbNext;
	}

	public void regJbPrevious(JButton jbPrevious) {
		this.jbPrevious = jbPrevious;
	}
	
	public void regJbRepeat(JButton jbRepeat) {
		this.jbRepeat = jbRepeat;
	}

	public void regJbRandom(JButton jbRandom) {
		this.jbRandom = jbRandom;
	}
	
}
