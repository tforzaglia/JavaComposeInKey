import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {
	
	public static void main(String[] args) {
		
		//Create the label and buttons for major keys
		JLabel major = new JLabel("    MAJOR");
		major.setForeground(Color.RED);
		JButton aButton = new JButton("A");
		JButton asButton = new JButton("A#");
		JButton bButton = new JButton("B");
		JButton cButton = new JButton("C");
		JButton csButton = new JButton("C#");
		JButton dButton = new JButton("D");
		JButton dsButton = new JButton("D#");
		JButton eButton = new JButton("E");
		JButton fButton = new JButton("F");
		JButton fsButton = new JButton("F#");
		JButton gButton = new JButton("G");
		JButton gsButton = new JButton("G#");
		
		//Create the label and buttons for minor keys
		JLabel minor = new JLabel("    MINOR");
		minor.setForeground(Color.RED);
		JButton amButton = new JButton("Am");
		JButton asmButton = new JButton("A#m");
		JButton bmButton = new JButton("Bm");
		JButton cmButton = new JButton("Cm");
		JButton csmButton = new JButton("C#m");
		JButton dmButton = new JButton("Dm");
		JButton dsmButton = new JButton("D#m");
		JButton emButton = new JButton("Em");
		JButton fmButton = new JButton("Fm");
		JButton fsmButton = new JButton("F#m");
		JButton gmButton = new JButton("Gm");
		JButton gsmButton = new JButton("G#m");
		
		//create the action listener
		GoToKeyInfo listener = new GoToKeyInfo();
		
		//add the action listener to all the buttons
		aButton.addActionListener(listener);
		asButton.addActionListener(listener);
		bButton.addActionListener(listener);
		cButton.addActionListener(listener);
		csButton.addActionListener(listener);
		dButton.addActionListener(listener);
		dsButton.addActionListener(listener);
		eButton.addActionListener(listener);
		fButton.addActionListener(listener);
		fsButton.addActionListener(listener);
		gButton.addActionListener(listener);
		gsButton.addActionListener(listener);
		
		amButton.addActionListener(listener);
		asmButton.addActionListener(listener);
		bmButton.addActionListener(listener);
		cmButton.addActionListener(listener);
		csmButton.addActionListener(listener);
		dmButton.addActionListener(listener);
		dsmButton.addActionListener(listener);
		emButton.addActionListener(listener);
		fmButton.addActionListener(listener);
		fsmButton.addActionListener(listener);
		gmButton.addActionListener(listener);
		gsmButton.addActionListener(listener);
		
		//content JPanel is the content of the entire window
		JPanel content = new JPanel();
		content.setBackground(Color.GRAY);
		
		//left is JPanel for the major keys
		JPanel left = new JPanel();
		left.setBackground(Color.BLACK);
		
		//right JPanel is for the minor keys
		JPanel right = new JPanel();
		right.setBackground(Color.BLACK);
		
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
		JFrame window = new JFrame("Compose in Key -- Java Edition");
		
		//set the content JPanel (which contains both the right and left panels) as the content pane for the frame
	    window.setContentPane(content);
	    
	    //set size large enough horizontally and vertically
	    window.setSize(275,400);
	    
	    window.setLocation(100,100);
        window.setVisible(true);

	   }//close main method
}//close Main class

