import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//have the button pressed string passed into the constructor
//determine what label will be set based on the name of the button
//set up the GUI for the window and set visible

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
				keyName = new JLabel("A#");
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
	}
	
	//method to build the GUI 
	public void buildGUI() {
		
		//static labels -- same for every key
		JLabel noteTitle = new JLabel("Notes in the Scale");
		JLabel chordTitle = new JLabel("Chords in the Key");
		
		JPanel infoPanel = new JPanel();
		infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.PAGE_AXIS));
		
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
