package ll_gui.ff_Applet.archive;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class MyApplet extends JApplet
{

	private static final long serialVersionUID = 1L;

	public void init()
	{
		MyComponent myItem = new MyComponent() ;
		getContentPane().add( myItem ) ;
	}

	public static void main(String s[]) 
	{
		// make the window:
		JFrame f = new JFrame("Test");

		// when the window is closed, the pgm exits:
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// generate an applet and add it to the window:
		JApplet applet = new MyApplet();
		f.getContentPane().add("Center", applet);

		// initialize the applet (not done by ctor)
		applet.init();

		// sequence to display frame:
		f.pack();
		f.setSize(new Dimension(300,150));
		f.setVisible(true) ;
	}

}

class MyComponent extends JComponent
{
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		int xx= 50 ;
		int yy=100 ;
		g.drawString("Hello world!", xx, yy);
	}
}
