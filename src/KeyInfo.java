import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class KeyInfo {
	
	//create generic labels to be filled in based on the button pressed
	JLabel keyName;
	JLabel noteList;
	JLabel chordList;
	
	String buttonName;
	
	//constructor -- pass in text on the button pressed
	public KeyInfo(String button) {
		
		buttonName = button;
	}
	
	//method to determine which key to load based on the button pressed
	public void determineKey() {
		
		if(buttonName == "A" || buttonName == "F#m") {
			if(buttonName == "A") 
				keyName = new JLabel("A Major");
			else
				keyName = new JLabel("F# Minor");
			noteList = new JLabel("A  B  C#  D  E  F#  G#");
			chordList = new JLabel("A  Bm  C#m  D  E  F#m");
		}
		else if(buttonName == "A#" || buttonName == "Gm") {
			if(buttonName == "A#") 
				keyName = new JLabel("A# Major");
			else
				keyName = new JLabel("G Minor");
			noteList = new JLabel("A#  B  C#  D  E  F#  G#");
			chordList = new JLabel("A#  Cm  Dm  D#  F  Gm");
		}
		else if(buttonName == "B" || buttonName == "G#m") {
			if(buttonName == "B") 
				keyName = new JLabel("B Major");
			else
				keyName = new JLabel("G# Minor");
			noteList = new JLabel("B  C#  D#  E  F#  G#  A#");
			chordList = new JLabel("B  C#m  D#m  E  F#  G#m");
		}
		else if(buttonName == "C" || buttonName == "Am") {
			if(buttonName == "C") 
				keyName = new JLabel("C Major");
			else
				keyName = new JLabel("A Minor");
			noteList = new JLabel("C  D  E  F  G  A  B");
			chordList = new JLabel("Am  C  Dm  Em  F  G");
		}
		else if(buttonName == "C#" || buttonName == "A#m") {
			if(buttonName == "C#") 
				keyName = new JLabel("C# Major");
			else
				keyName = new JLabel("A# Minor");
			noteList = new JLabel("C#  D#  F  F#  G#  A#  C");
			chordList = new JLabel("C#  D#m  E#m  F#  G#  A#m");
		}
		else if(buttonName == "D" || buttonName == "Bm") {
			if(buttonName == "D") 
				keyName = new JLabel("D Major");
			else
				keyName = new JLabel("B Minor");
			noteList = new JLabel("D  E  F#  G  A  B C#");
			chordList = new JLabel("D  Em  F#m  G  A  Bm");
		}
		else if(buttonName == "D#" || buttonName == "Cm") {
			if(buttonName == "D#") 
				keyName = new JLabel("D# Major");
			else
				keyName = new JLabel("C Minor");
			noteList = new JLabel("D#  F  G  G#  A#  C  D");
			chordList = new JLabel("D#  Fm  Gm  G#  A#  Cm");
		}
		else if(buttonName == "E" || buttonName == "C#m") {
			if(buttonName == "E") 
				keyName = new JLabel("E Major");
			else
				keyName = new JLabel("C# Minor");
			noteList = new JLabel("E  F#  G#  A  B C#  D#");
			chordList = new JLabel("E  F#m  G#m  A  B  C#m");
		}
		else if(buttonName == "F" || buttonName == "Dm") {
			if(buttonName == "F") 
				keyName = new JLabel("F Major");
			else
				keyName = new JLabel("D Minor");
			noteList = new JLabel("F  G  A  A# C  D  E");
			chordList = new JLabel("F  Gm  Am  A#  C  Dm");
		}
		else if(buttonName == "F#" || buttonName == "D#m") {
			if(buttonName == "F#") 
				keyName = new JLabel("F# Major");
			else
				keyName = new JLabel("D# Minor");
			noteList = new JLabel("F#  G#  A#  B  C#  D#  F");
			chordList = new JLabel("F#  G#m  A#m  B  C#  D#m");
		}
		else if(buttonName == "G" || buttonName == "Em") {
			if(buttonName == "G") 
				keyName = new JLabel("G Major");
			else
				keyName = new JLabel("E Minor");
			noteList = new JLabel("G  A  B  C  D  E  F#");
			chordList = new JLabel("G  Am  Bm  C  D  Em");
		}
		else if(buttonName == "G#" || buttonName == "Fm") {
			if(buttonName == "G#") 
				keyName = new JLabel("G# Major");
			else
				keyName = new JLabel("F Minor");
			noteList = new JLabel("G#  A#  C  C#  D#  F  G");
			chordList = new JLabel("G#  A#m  Cm  C#  D#  Fm");
		}
		keyName.setForeground(Color.RED);
		noteList.setForeground(Color.WHITE);
		chordList.setForeground(Color.WHITE);
	}
	
	//method to build the GUI 
	public void buildGUI() {
		
		//static labels -- same for every key
		JLabel noteTitle = new JLabel("Notes in the Scale");
		noteTitle.setForeground(Color.BLUE);
		JLabel chordTitle = new JLabel("Chords in the Key");
		chordTitle.setForeground(Color.BLUE);
		
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.PAGE_AXIS));
		infoPanel.setBackground(Color.GRAY);
		
		//add components to the panel
		infoPanel.add(keyName);
		infoPanel.add(noteTitle);
		infoPanel.add(noteList);
		infoPanel.add(chordTitle);
		infoPanel.add(chordList);
		
		//create the main window for the application
		JFrame window = new JFrame("Test");
				
	    window.setContentPane(infoPanel);
			    
	    //set size large enough horizontally and vertically
		window.setSize(300,200);
			    
	    window.setLocation(500,200);
		window.setVisible(true);
	}
}
