package ll_gui.zz_MovingGraphics;
import java.awt.geom.*;
import javax.swing.*;        
import java.awt.*;
// import java.awt.event.*;

public class MovingGraphics extends JApplet
{
    JFrame frame_ ;
    int counter_ = 0 ;

    public void init ()
    {
  	OtherComponent component = new OtherComponent() ;
 	frame_.getContentPane().add(component);
    }

    public void createWindow () 
    {
	// ############################################
	// ############################################
	//Create the window (= frame):

	JFrame.setDefaultLookAndFeelDecorated(true);
 	frame_ = new JFrame("WindowName");
	frame_.setSize(new Dimension(350,200));
	frame_.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// ############################################
	// ############################################


	// ############################################
	// ############################################

	frame_.pack() ;
        frame_.setSize(new Dimension(300,150));
	frame_.setVisible(true);

	// ############################################
	// ############################################
    }

    public void run ()
    {
	System.out.println ( " running ... " ) ;
	while ( counter_ < 80) {
	    counter_ ++ ;
	    frame_.repaint();
	}
    }

    // ############################################
    // ############################################
    public static void main(String[] args) {

	MovingGraphics test = new MovingGraphics () ;
	test.createWindow() ;
	test.init() ;
	test.run() ;

    }

    class OtherComponent extends JComponent {
	public void paintComponent(Graphics g) 
	{
//       	    super.paintComponent(g) ;

	    Graphics2D g2 = (Graphics2D) g;

	    BasicStroke wideStroke = new BasicStroke(8.0f);

	    g2.setStroke(wideStroke);
	    g2.setPaint( Color.orange );

	    g2.draw(new Line2D.Double(150,10+counter_,250,10+counter_));

	}
    }
}

// Local Variables:
// fill-column: 90
// c-basic-offset: 4
// indent-tabs-mode: f
// End: 
