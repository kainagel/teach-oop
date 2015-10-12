package ll_gui.ff_Applet;
import java.applet.* ;
import java.awt.* ;
import javax.swing.* ;

public class MyApplet extends JApplet
{
	// ############################################
	// ############################################

	public void init()
	{
		JPanel myItem = new MyPanel() ; // could also be JComponent
		getContentPane().add( myItem ) ;
	}

	// ############################################
	// ############################################

	public static void main(String s[]) 
	{
		// make the window:
		JFrame f = new JFrame("Test");

		// when the window is closed, the pgm exits:
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// generate an applet and add it to the window:
		MyApplet applet = new MyApplet();
		f.getContentPane().add("Center", applet);

		// initialize the applet (not done by ctor)
		applet.init() ;

		// sequence to display frame:
		f.pack();
		f.setSize(new Dimension(300,150));
		f.setVisible(true) ;
	
	}

	// ############################################
	// ############################################

	class MyPanel extends JPanel // could also be JComponent
	{
		public void paintComponent(Graphics g) 
		{
			super.paintComponent(g);

			int xx = 50 ;
			int yy = 50 ;
			g.drawString("Hello world!", xx, yy ) ;
		}
	}

	// ############################################
	// ############################################

}

