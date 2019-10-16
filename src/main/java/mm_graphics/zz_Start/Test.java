package mm_graphics.zz_Start;
import java.applet.* ;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Test
{
    private class MyPanel extends JPanel {
	protected void paintComponent (Graphics g) 
	{
	    super.paintComponent(g) ;

	    Graphics2D g2 = (Graphics2D) g;
	    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	    Dimension d = getSize();
	    int gridWidth = d.width / 6;
	    int gridHeight = d.height / 2;

	    g2.setPaint( Color.green );
	    g2.draw3DRect(10, 10, d.width - 20, d.height - 20, true);

	    g2.setPaint( Color.red );
	    g2.draw3DRect(20, 20, d.width - 40, d.height - 40, true);

// // 	    g2.draw3DRect(13, 13, d.width - 17, d.height - 17, false);
// 
	    int x = 5;
	    int y = 7;
	    int rectWidth = gridWidth - 2*x;
	    int stringY = gridHeight - 3 ;
	    int rectHeight = stringY - y - 2;

	    g2.setPaint( Color.red );
	    g2.draw(new Line2D.Double(x, y+rectHeight-1, x + rectWidth, y));

	}
    }

    void run() {
	// make the window:
        JFrame frame = new JFrame("Graphics2D-Demo");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// generate a Panel add it to the window:
        JPanel display = new MyPanel();
        frame.getContentPane().add("Center", display);

	// sequence to display frame:
        frame.pack();
        frame.setSize(new Dimension(100,100));
        frame.setVisible(true) ;
    }

    public static void main(String s[]) 
    {
	Test test = new Test() ;
	test.run() ;
    }

}
