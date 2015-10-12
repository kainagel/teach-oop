package ll_gui.zz_Transition;
import java.awt.geom.*;
import javax.swing.*;        
import java.awt.*;
//import java.awt.event.*;

public class Transition extends JApplet
{
	int ii_ = 0 ;

	public void init () 
	{
		OtherComponent component = new OtherComponent() ;
		getContentPane().add( component ) ;
	}

//	public void start () 
//	{
//	for ( ii_ = 0 ; ii_ < 100 ; ii_++ ) {
//	repaint() ;
//	}
//	}

	public static void main(String[] args) 
	{
		// Create the window (= frame):
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("WindowName");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create an instance of myself, add it to the frame, and initialize it:
		Transition test = new Transition () ;
		frame.getContentPane().add(test) ;
		test.init() ;

		// pack the frame and display it:
		frame.setSize(new Dimension(300,150));
		frame.setVisible(true);
	}

	class OtherComponent extends JComponent {
		public void paintComponent(Graphics g) 
		{
//			super.paintComponent(g) ;

			Graphics2D g2 = (Graphics2D) g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			Dimension d = getSize();
			int gridWidth = d.width / 6;
			int gridHeight = d.height / 2;

			BasicStroke wideStroke = new BasicStroke(8.0f);

			g2.setStroke(wideStroke);


			g2.setPaint( Color.green );
			g2.draw3DRect(50, 50, d.width - 1, d.height - 1, true);
			g2.setPaint( Color.blue );
			g2.draw3DRect(3, 3, d.width - 7, d.height - 7, false);

			int x = 5;
			int y = 7;
			int rectWidth = gridWidth - 2*x;
			int stringY = gridHeight - 3 ;
			int rectHeight = stringY - y - 2;

			g2.setPaint( Color.red );
//			g2.draw(new Line2D.Double(x, y+rectHeight-1, x + rectWidth, y));
			g2.draw(new Line2D.Double(10,10,100,100));

			g2.setPaint( Color.orange );
			g2.draw(new Line2D.Double(100,100,100 + 10*ii_,200));
			ii_++ ;

		}
	}
}

//Local Variables:
//fill-column: 90
//c-basic-offset: 4
//indent-tabs-mode: f
//End: 
