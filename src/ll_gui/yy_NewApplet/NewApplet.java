package ll_gui.yy_NewApplet;
import javax.swing.*;        
import java.awt.*;
import java.awt.event.*;

public class NewApplet
{

    JLabel label_ = null ;

    private class ClickCounter implements ActionListener
    {
	// ############################################
	int numClicks_ = 0 ;
	public void actionPerformed(ActionEvent e) {
	    numClicks_++;
// 	    System.out.println ( " numClicks: " + numClicks_ ) ;
 	    label_.setText("numClicks: " + numClicks_);
	}

	// ############################################
    }

    public void run () 
    {
	System.out.println ( "entering run ..." ) ;
	
	// ############################################
	// ############################################

	JFrame.setDefaultLookAndFeelDecorated(true);

	JFrame frame = new JFrame("WindowName");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	// ############################################
	// ############################################

	JButton button = new JButton("this is a button");

 	ClickCounter clickCounter = new ClickCounter() ;

 	button.addActionListener(clickCounter);

	// ############################################
	// ############################################

	label_ = new JLabel("this is a label",SwingConstants.CENTER);

	// ############################################
	// ############################################

	JPanel panel = new JPanel(new GridLayout(1, 5));
	panel.setBorder(BorderFactory.createEmptyBorder(
			    30, //top
			    30, //left
			    30, //bottom
			    30) //right
	    );
 	panel.add(label_);
 	panel.add(button);

 	frame.getContentPane().add(panel);

	// ############################################
	// ############################################

	//Display the window.
	frame.pack();
	frame.setVisible(true);

	// ############################################
	// ############################################
    }

    // ############################################
    // ############################################
    public static void main(String[] args) {

	NewApplet ttt = new NewApplet () ;

	ttt.run() ;

    }
}

// Local Variables:
// fill-column: 90
// c-basic-offset: 4
// indent-tabs-mode: f
// End: 
