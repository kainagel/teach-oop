package ll_gui.cc_Graphics;
import java.awt.geom.*;
import javax.swing.*;        
import java.awt.*;
//import java.awt.event.*;

public class GraphicsTest
{
	JFrame frame_ ;
	int counter_ = 0 ;

//	public void createWindow () 
	public void run () 
	{
		//Create the window (= frame):
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame_ = new JFrame("WindowName");
		frame_.setSize(new Dimension(350,200));
		frame_.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ############################################
		// ############################################

		MyComponent component = new MyComponent() ;
		frame_.getContentPane().add(component);

		// ############################################
		// ############################################

		frame_.pack() ;
		frame_.setSize(new Dimension(300,150));
		frame_.setVisible(true);

		// ############################################
		// ############################################
	}

//	public void run ()
//	{
//	System.out.println ( " running ... " ) ;
//	while ( counter_ < 80) {
//	counter_ ++ ;
//	frame_.repaint();
//	}
//	}

	// ############################################
	// ############################################
	public static void main(String[] args) {

		GraphicsTest test = new GraphicsTest () ;
//		test.createWindow() ;
		test.run() ;

	}

	class MyComponent extends JComponent {
		int count = 0 ;

		public void paintComponent(Graphics g) 
		{
			super.paintComponent(g) ;

			count ++ ;
			System.out.println ( " count: " + count ) ;

			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

			Dimension d = this.getSize();

			BasicStroke wideStroke = new BasicStroke(8.0f);

			g2.setStroke(wideStroke);


			g2.setPaint( Color.green );
			g2.draw3DRect(50, 50, d.width - 65, d.height - 65, true);

			g2.setPaint( Color.blue );
			g2.draw3DRect(3, 3, d.width - 7, d.height - 7, false);

			g2.setPaint( Color.red );
			g2.draw(new Line2D.Double(10,10,100,100));

		}
	}
}

//Local Variables:
//fill-column: 90
//c-basic-offset: 4
//indent-tabs-mode: f
//End: 
