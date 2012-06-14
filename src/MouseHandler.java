import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MouseHandler implements MouseListener {

	JLabel picture;
	
	public MouseHandler(JLabel l) {
		picture = l;
	}

	//method to display pictures when mouse hovers over chord names (labels)
	public void mouseEntered(MouseEvent ev) {
		
		JLabel chordLabel = (JLabel)ev.getSource();
		String chordName = chordLabel.getText();
		
		//create the image icons for each chord
		ImageIcon a = new ImageIcon(getClass().getResource("a.gif"));
		ImageIcon as = new ImageIcon(getClass().getResource("asharp.gif"));
		ImageIcon b = new ImageIcon(getClass().getResource("b.gif"));
		ImageIcon c = new ImageIcon(getClass().getResource("c.gif"));
		ImageIcon cs = new ImageIcon(getClass().getResource("csharp.gif"));
		ImageIcon d = new ImageIcon(getClass().getResource("d.gif"));
		ImageIcon ds = new ImageIcon(getClass().getResource("dsharp.gif"));
		ImageIcon e = new ImageIcon(getClass().getResource("e.gif"));
		ImageIcon f = new ImageIcon(getClass().getResource("f.gif"));
		ImageIcon fs = new ImageIcon(getClass().getResource("fsharp.gif"));
		ImageIcon g = new ImageIcon(getClass().getResource("g.gif"));
		ImageIcon gs = new ImageIcon(getClass().getResource("gsharp.gif"));

		ImageIcon am = new ImageIcon(getClass().getResource("am.gif"));
		ImageIcon asm = new ImageIcon(getClass().getResource("asharpm.gif"));
		ImageIcon bm = new ImageIcon(getClass().getResource("bm.gif"));
		ImageIcon cm = new ImageIcon(getClass().getResource("cm.gif"));
		ImageIcon csm = new ImageIcon(getClass().getResource("csharpm.gif"));
		ImageIcon dm = new ImageIcon(getClass().getResource("dm.gif"));
		ImageIcon dsm = new ImageIcon(getClass().getResource("dsharpm.gif"));
		ImageIcon em = new ImageIcon(getClass().getResource("em.gif"));
		ImageIcon fm = new ImageIcon(getClass().getResource("fm.gif"));
		ImageIcon fsm = new ImageIcon(getClass().getResource("fsharpm.gif"));
		ImageIcon gm = new ImageIcon(getClass().getResource("gm.gif"));
		ImageIcon gsm = new ImageIcon(getClass().getResource("gsharpm.gif"));
		
		//set the appropriate picture based on the position of the mouse pointer
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

	public void mouseClicked(MouseEvent e) {
	}
	
	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}	
}