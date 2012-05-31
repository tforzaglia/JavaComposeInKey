import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Main {
	
	public static void main(String[] args) {
		//MajorDisplay keyname = new MajorDisplay();
		
		//Create the label and buttons for major keys
		JLabel major = new JLabel("MAJOR");
		JButton aButton = new JButton("A");
		JButton asButton = new JButton("A# / Bb");
		JButton bButton = new JButton("B");
		JButton cButton = new JButton("C");
		JButton csButton = new JButton("C# / Db");
		JButton dButton = new JButton("D");
		JButton dsButton = new JButton("D# / Eb");
		JButton eButton = new JButton("E");
		JButton fButton = new JButton("F");
		JButton fsButton = new JButton("F# / Gb");
		JButton gButton = new JButton("G");
		JButton gsButton = new JButton("G# / Ab");
		
		//Create the label and buttons for minor keys
		JLabel minor = new JLabel("MINOR");
		JButton amButton = new JButton("Am");
		JButton asmButton = new JButton("A#m / Bbm");
		JButton bmButton = new JButton("Bm");
		JButton cmButton = new JButton("Cm");
		JButton csmButton = new JButton("C#m / Dbm");
		JButton dmButton = new JButton("Dm");
		JButton dsmButton = new JButton("D#m / Ebm");
		JButton emButton = new JButton("Em");
		JButton fmButton = new JButton("Fm");
		JButton fsmButton = new JButton("F#m / Gbm");
		JButton gmButton = new JButton("Gm");
		JButton gsmButton = new JButton("G#m / Abm");
		
		//content JPanel is the content of the entire window
		JPanel content = new JPanel();
		
		//left is JPanel for the major keys
		JPanel left = new JPanel();
		
		//right is JPanel for the minor keys
		JPanel right = new JPanel();
		
		//use a Border Layout for the main window display to have the parts arranged side by side
		content.setLayout(new BorderLayout());
		
		//add the major key (left) panel to the West side of the border layout
		content.add(left, BorderLayout.WEST);
		
		//add the minor key (right) panel to the East side of the border layout
		content.add(right, BorderLayout.EAST);
		
		//left and right panels are set up with Box Layout to have the content displayed one on top of the other
		//add the title and buttons to the panel for major keys
		left.setLayout(new BoxLayout(left, BoxLayout.PAGE_AXIS));
		left.add(major);
		left.add(aButton);
		left.add(asButton);
		left.add(bButton);
		left.add(cButton);
		left.add(csButton);
		left.add(dButton);
		left.add(dsButton);
		left.add(eButton);
		left.add(fButton);
		left.add(fsButton);
		left.add(gButton);
		left.add(gsButton);
	
		//add the title and buttons to the panel for minor keys
		right.setLayout(new BoxLayout(right, BoxLayout.PAGE_AXIS));
		right.add(minor);
		right.add(amButton);
		right.add(asmButton);
		right.add(bmButton);
		right.add(cmButton);
		right.add(csmButton);
		right.add(dmButton);
		right.add(dsmButton);
		right.add(emButton);
		right.add(fmButton);
		right.add(fsmButton);
		right.add(gmButton);
		right.add(gsmButton);
		
		//create the main window for the application
		JFrame window = new JFrame("Test");
		
		//set the size large enough horizontally and vertically
	    window.setContentPane(content);
	    window.setSize(250,500);
	    window.setLocation(100,100);
        window.setVisible(true);

	   }//close main method
}//close Main close

