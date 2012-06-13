import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyInfo {
	
	//create generic labels to be filled in based on the button pressed
	JLabel keyName;
	JLabel noteList;
	JLabel chordPic;
	
	JLabel chord1;
	JLabel chord2;
	JLabel chord3;
	JLabel chord4;
	JLabel chord5;
	JLabel chord6;
	
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
			chord1 = new JLabel("A");
			chord2 = new JLabel("Bm");
			chord3 = new JLabel("C#m");
			chord4 = new JLabel("D");
			chord5 = new JLabel("E");
			chord6 = new JLabel("F#m");
		}
		else if(buttonName == "A#" || buttonName == "Gm") {
			if(buttonName == "A#") 
				keyName = new JLabel("A# Major");
			else
				keyName = new JLabel("G Minor");
			noteList = new JLabel("A#  B  C#  D  E  F#  G#");
			chord1 = new JLabel("A#");
			chord2 = new JLabel("Cm");
			chord3 = new JLabel("Dm");
			chord4 = new JLabel("D#");
			chord5 = new JLabel("F");
			chord6 = new JLabel("Gm");
		}
		else if(buttonName == "B" || buttonName == "G#m") {
			if(buttonName == "B") 
				keyName = new JLabel("B Major");
			else
				keyName = new JLabel("G# Minor");
			noteList = new JLabel("B  C#  D#  E  F#  G#  A#");
			chord1 = new JLabel("B");
			chord2 = new JLabel("C#m");
			chord3 = new JLabel("D#m");
			chord4 = new JLabel("E");
			chord5 = new JLabel("F#");
			chord6 = new JLabel("G#m");
		}
		else if(buttonName == "C" || buttonName == "Am") {
			if(buttonName == "C") 
				keyName = new JLabel("C Major");
			else
				keyName = new JLabel("A Minor");
			noteList = new JLabel("C  D  E  F  G  A  B");
			chord1 = new JLabel("Am");
			chord2 = new JLabel("C");
			chord3 = new JLabel("Dm");
			chord4 = new JLabel("Em");
			chord5 = new JLabel("F");
			chord6 = new JLabel("G");
		}
		else if(buttonName == "C#" || buttonName == "A#m") {
			if(buttonName == "C#") 
				keyName = new JLabel("C# Major");
			else
				keyName = new JLabel("A# Minor");
			noteList = new JLabel("C#  D#  F  F#  G#  A#  C");
			chord1 = new JLabel("C#");
			chord2 = new JLabel("D#m");
			chord3 = new JLabel("E#m");
			chord4 = new JLabel("F#");
			chord5 = new JLabel("G#");
			chord6 = new JLabel("A#m");
		}
		else if(buttonName == "D" || buttonName == "Bm") {
			if(buttonName == "D") 
				keyName = new JLabel("D Major");
			else
				keyName = new JLabel("B Minor");
			noteList = new JLabel("D  E  F#  G  A  B C#");
			chord1 = new JLabel("D");
			chord2 = new JLabel("Em");
			chord3 = new JLabel("F#m");
			chord4 = new JLabel("G");
			chord5 = new JLabel("A");
			chord6 = new JLabel("Bm");
		}
		else if(buttonName == "D#" || buttonName == "Cm") {
			if(buttonName == "D#") 
				keyName = new JLabel("D# Major");
			else
				keyName = new JLabel("C Minor");
			noteList = new JLabel("D#  F  G  G#  A#  C  D");
			chord1 = new JLabel("D#");
			chord2 = new JLabel("Fm");
			chord3 = new JLabel("Gm");
			chord4 = new JLabel("G#");
			chord5 = new JLabel("A#");
			chord6 = new JLabel("Cm");
		}
		else if(buttonName == "E" || buttonName == "C#m") {
			if(buttonName == "E") 
				keyName = new JLabel("E Major");
			else
				keyName = new JLabel("C# Minor");
			noteList = new JLabel("E  F#  G#  A  B C#  D#");
			chord1 = new JLabel("E");
			chord2 = new JLabel("F#m");
			chord3 = new JLabel("G#m");
			chord4 = new JLabel("A");
			chord5 = new JLabel("B");
			chord6 = new JLabel("C#m");
		}
		else if(buttonName == "F" || buttonName == "Dm") {
			if(buttonName == "F") 
				keyName = new JLabel("F Major");
			else
				keyName = new JLabel("D Minor");
			noteList = new JLabel("F  G  A  A# C  D  E");
			chord1 = new JLabel("F");
			chord2 = new JLabel("Gm");
			chord3 = new JLabel("Am");
			chord4 = new JLabel("A#");
			chord5 = new JLabel("C");
			chord6 = new JLabel("Dm");
		}
		else if(buttonName == "F#" || buttonName == "D#m") {
			if(buttonName == "F#") 
				keyName = new JLabel("F# Major");
			else
				keyName = new JLabel("D# Minor");
			noteList = new JLabel("F#  G#  A#  B  C#  D#  F");
			chord1 = new JLabel("F#");
			chord2 = new JLabel("G#m");
			chord3 = new JLabel("A#m");
			chord4 = new JLabel("B");
			chord5 = new JLabel("C#");
			chord6 = new JLabel("D#m");
		}
		else if(buttonName == "G" || buttonName == "Em") {
			if(buttonName == "G") 
				keyName = new JLabel("G Major");
			else
				keyName = new JLabel("E Minor");
			noteList = new JLabel("G  A  B  C  D  E  F#");
			chord1 = new JLabel("G");
			chord2 = new JLabel("Am");
			chord3 = new JLabel("Bm");
			chord4 = new JLabel("C");
			chord5 = new JLabel("D");
			chord6 = new JLabel("Em");
		}
		else if(buttonName == "G#" || buttonName == "Fm") {
			if(buttonName == "G#") 
				keyName = new JLabel("G# Major");
			else
				keyName = new JLabel("F Minor");
			noteList = new JLabel("G#  A#  C  C#  D#  F  G");
			chord1 = new JLabel("G#");
			chord2 = new JLabel("A#m");
			chord3 = new JLabel("Cm");
			chord4 = new JLabel("C#");
			chord5 = new JLabel("D#");
			chord6 = new JLabel("Fm");
		}		
	}
	
	//method to build the KeyInfo GUI 
	public void buildGUI() {
		
		//place a generic music based image to start
		ImageIcon placeholder = new ImageIcon("images/note.jpeg");
		chordPic = new JLabel(placeholder);
		
		//add the mouse handler to the chord names
	    MouseHandler handler = new MouseHandler(chordPic);
		chord1.addMouseListener(handler);
		chord2.addMouseListener(handler);
		chord3.addMouseListener(handler);
		chord4.addMouseListener(handler);
		chord5.addMouseListener(handler);
		chord6.addMouseListener(handler);
		
		//set the font and color for the dynamic labels
		keyName.setForeground(Color.RED);
		keyName.setFont(new Font("Serif", Font.PLAIN, 25));
		
		noteList.setForeground(Color.BLACK);
		noteList.setFont(new Font("Serif", Font.PLAIN, 25));
		
		chord1.setFont(new Font("Serif", Font.PLAIN, 25));
		chord2.setFont(new Font("Serif", Font.PLAIN, 25));
		chord3.setFont(new Font("Serif", Font.PLAIN, 25));
		chord4.setFont(new Font("Serif", Font.PLAIN, 25));
		chord5.setFont(new Font("Serif", Font.PLAIN, 25));
		chord6.setFont(new Font("Serif", Font.PLAIN, 25));
		
		//set font and color for the static labels -- same for every key
		JLabel noteTitle = new JLabel("Notes in the Scale");
		noteTitle.setForeground(Color.BLUE);
		noteTitle.setFont(new Font("Serif", Font.PLAIN, 25));
		
		JLabel chordTitle = new JLabel("Chords in the Key");
		chordTitle.setForeground(Color.BLUE);
		chordTitle.setFont(new Font("Serif", Font.PLAIN, 25));
		
		//create the main panel for the key info screen with a GridBag layout
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(new GridBagLayout());	
		infoPanel.setBackground(Color.WHITE);
		
		//assign grid positions for each component of the panel and add them to the view
		GridBagConstraints c0 = new GridBagConstraints();
		c0.gridx = 1;
		c0.gridy = 0;
		infoPanel.add(keyName, c0);
		
		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx = 1;
		c1.gridy = 1;
		infoPanel.add(noteTitle, c1);
		
		GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx = 1;
		c2.gridy = 2;
		infoPanel.add(noteList, c2);
		
		GridBagConstraints c3 = new GridBagConstraints();
		c3.gridx = 1;
		c3.gridy = 3;
		infoPanel.add(chordTitle, c3);
		
		GridBagConstraints c4 = new GridBagConstraints();
		c4.gridx = 0;
		c4.gridy = 4;
		infoPanel.add(chord1, c4);
		
		GridBagConstraints c5 = new GridBagConstraints();
		c5.gridx = 0;
		c5.gridy = 5;
		infoPanel.add(chord2, c5);
		
		GridBagConstraints c6 = new GridBagConstraints();
		c6.gridx = 0;
		c6.gridy = 6;
		infoPanel.add(chord3, c6);
		
		GridBagConstraints c7 = new GridBagConstraints();
		c7.gridx = 2;
		c7.gridy = 4;
		infoPanel.add(chord4, c7);
		
		GridBagConstraints c8 = new GridBagConstraints();
		c8.gridx = 2;
		c8.gridy = 5;
		infoPanel.add(chord5, c8);
		
		GridBagConstraints c9 = new GridBagConstraints();
		c9.gridx = 2;
		c9.gridy = 6;
		infoPanel.add(chord6, c9);
		
		GridBagConstraints c10 = new GridBagConstraints();
		c10.gridx = 1;
		c10.gridy = 7;
		infoPanel.add(chordPic, c10);
		
		//create the main window for the application
		JFrame window = new JFrame("Test");
			
		//set the JPanel with all the components to be included in the main window
	    window.setContentPane(infoPanel);
			    
	    //set size large enough horizontally and vertically
		window.setSize(500,500);
			    
	    window.setLocation(300,500);
		
		window.setVisible(true);
	}
}