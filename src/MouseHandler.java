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
		
		ImageIcon a = new ImageIcon("images/a.gif");
		ImageIcon as = new ImageIcon("images/asharp.gif");
		ImageIcon b = new ImageIcon("images/b.gif");
		ImageIcon c = new ImageIcon("images/c.gif");
		ImageIcon cs = new ImageIcon("images/csharp.gif");
		ImageIcon d = new ImageIcon("images/d.gif");
		ImageIcon ds = new ImageIcon("images/dsharp.gif");
		ImageIcon e = new ImageIcon("images/e.gif");
		ImageIcon f = new ImageIcon("images/f.gif");
		ImageIcon fs = new ImageIcon("images/fsharp.gif");
		ImageIcon g = new ImageIcon("images/g.gif");
		ImageIcon gs = new ImageIcon("images/gsharp.gif");
		
		ImageIcon am = new ImageIcon("images/am.gif");
		ImageIcon asm = new ImageIcon("images/asharpm.gif");
		ImageIcon bm = new ImageIcon("images/bm.gif");
		ImageIcon cm = new ImageIcon("images/cm.gif");
		ImageIcon csm = new ImageIcon("images/csharpm.gif");
		ImageIcon dm = new ImageIcon("images/dm.gif");
		ImageIcon dsm = new ImageIcon("images/dsharpm.gif");
		ImageIcon em = new ImageIcon("images/em.gif");
		ImageIcon fm = new ImageIcon("images/fm.gif");
		ImageIcon fsm = new ImageIcon("images/fsharpm.gif");
		ImageIcon gm = new ImageIcon("images/gm.gif");
		ImageIcon gsm = new ImageIcon("images/gsharpm.gif");
		
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