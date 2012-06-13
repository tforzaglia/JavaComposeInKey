import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MouseHandler implements MouseListener {

	JLabel picture;
	
	public MouseHandler(JLabel l) {
		picture = l;
	}

	public void mouseClicked(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent ev) {
		
		JLabel chordLabel = (JLabel)ev.getSource();
		String chordName = chordLabel.getText();
		
		ImageIcon a = new ImageIcon("src/a.jpeg");
		ImageIcon as = new ImageIcon("src/a.jpeg");
		ImageIcon b = new ImageIcon("src/b.jpg");
		ImageIcon c = new ImageIcon("src/a.jpeg");
		ImageIcon cs = new ImageIcon("src/a.jpeg");
		ImageIcon d = new ImageIcon("src/a.jpeg");
		ImageIcon ds = new ImageIcon("src/a.jpeg");
		ImageIcon e = new ImageIcon("src/a.jpeg");
		ImageIcon f = new ImageIcon("src/a.jpeg");
		ImageIcon fs = new ImageIcon("src/a.jpeg");
		ImageIcon g = new ImageIcon("src/a.jpeg");
		ImageIcon gs = new ImageIcon("src/a.jpeg");
		
		ImageIcon am = new ImageIcon("src/a.jpeg");
		ImageIcon asm = new ImageIcon("src/a.jpeg");
		ImageIcon bm = new ImageIcon("src/b.jpg");
		ImageIcon cm = new ImageIcon("src/a.jpeg");
		ImageIcon csm = new ImageIcon("src/a.jpeg");
		ImageIcon dm = new ImageIcon("src/a.jpeg");
		ImageIcon dsm = new ImageIcon("src/a.jpeg");
		ImageIcon em = new ImageIcon("src/a.jpeg");
		ImageIcon fm = new ImageIcon("src/a.jpeg");
		ImageIcon fsm = new ImageIcon("src/a.jpeg");
		ImageIcon gm = new ImageIcon("src/a.jpeg");
		ImageIcon gsm = new ImageIcon("src/a.jpeg");
		
		
		if(chordName == "A"){
			picture.setIcon(a);
		}
		else if(chordName == "A#"){
			picture.setIcon(as);
		}
		else if(chordName == "B"){
			picture.setIcon(b);
		}
		else if(chordName == "C"){
			picture.setIcon(c);
		}
		else if(chordName == "C#"){
			picture.setIcon(cs);
		}
		else if(chordName == "D"){
			picture.setIcon(d);
		}
		else if(chordName == "D#"){
			picture.setIcon(ds);
		}
		else if(chordName == "E"){
			picture.setIcon(e);
		}
		else if(chordName == "F"){
			picture.setIcon(f);
		}
		else if(chordName == "F#"){
			picture.setIcon(fs);
		}
		else if(chordName == "G"){
			picture.setIcon(g);
		}
		else if(chordName == "G#"){
			picture.setIcon(gs);
		}
		
		else if(chordName == "Am"){
			picture.setIcon(am);
		}
		else if(chordName == "A#m"){
			picture.setIcon(asm);
		}
		else if(chordName == "Bm"){
			picture.setIcon(bm);
		}
		else if(chordName == "Cm"){
			picture.setIcon(cm);
		}
		else if(chordName == "C#m"){
			picture.setIcon(csm);
		}
		else if(chordName == "Dm"){
			picture.setIcon(dm);
		}
		else if(chordName == "D#m"){
			picture.setIcon(dsm);
		}
		else if(chordName == "Em"){
			picture.setIcon(em);
		}
		else if(chordName == "Fm"){
			picture.setIcon(fm);
		}
		else if(chordName == "F#m"){
			picture.setIcon(fsm);
		}
		else if(chordName == "Gm"){
			picture.setIcon(gm);
		}
		else if(chordName == "G#m"){
			picture.setIcon(gsm);
		}	
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}	
}