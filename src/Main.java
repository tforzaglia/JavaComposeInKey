import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		
		//create an AllKeys object to act as the main menu for the application
		AllKeys menu = new AllKeys();
		
		//create the main window for the application
		JFrame window = new JFrame("Compose in Key -- Java Edition");
		
		//set the content JPanel (which contains both the right and left panels) as the content pane for the frame
	    window.setContentPane(menu.content);
	    
	    //set size large enough horizontally and vertically
	    window.setSize(400,500);
	    
	    window.setLocation(100,100);
        window.setVisible(true);
	   }//close main method
}//close Main class

