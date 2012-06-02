import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class GoToKeyInfo implements ActionListener {
	
	//constructor 
	public GoToKeyInfo() {
	}
	
	//method to act on the button presses
	public void actionPerformed(ActionEvent e) {
		
		//create a JButton that will hold the object on which the event occurred
		JButton button = (JButton) e.getSource();
		
		//create a string to hold the text on the JButton
		String buttonName = button.getText();
		
		//Create the keyWindow object and pass in the string button name
		KeyInfo keyWindow = new KeyInfo(buttonName);
		
		//Find out which key to load based on the button pressed
		keyWindow.determineKey();
		
		//build the GUI after finding out which key
		keyWindow.buildGUI();	
	}
}
