package ll_gui.bb_ClickCount.archive;
import javax.swing.*;        
import java.awt.*;
import java.awt.event.*;

    class GuiTestObject
    {

	JLabel label_ = null ;

	private class ClickCounter implements ActionListener
	{
	    // ############################################
	    int numClicks_ = 0 ;
	    public void actionPerformed(ActionEvent e) {
		numClicks_++;
		label_.setText("tata: " + numClicks_);
	    }

	    // ############################################
	}

	public void run () 
	{
	    System.out.println ( "entering run ..." ) ;
	
	    // ############################################
	    // ############################################

	    // replace default window manager decoration by java decoration (good for
	    // compatibility, but in my view should be configurable)
	    JFrame.setDefaultLookAndFeelDecorated(true);

	    //Create the window (= frame):
	    JFrame frame = new JFrame("WindowName");

	    // without this, the pgm does not exit when the window is closed
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // ############################################
	    // ############################################

	    // Create and add a button:
	    JButton button = new JButton("this is a button");
	    ClickCounter clickCounter = new ClickCounter() ;
	    button.addActionListener(clickCounter);

	    // ############################################
	    // ############################################

	    // Create and add label:
	    label_ = new JLabel("this is a label",SwingConstants.CENTER);
	    label_.setLabelFor(button);

	    // ############################################
	    // ############################################

	    JPanel panel = new JPanel(new GridLayout(0, 1));
	    panel.setBorder(BorderFactory.createEmptyBorder(
				30, //top
				30, //left
				30, //bottom
				30) //right
		);
	    panel.add(label_);
	    panel.add(button);

	    // ``add'' adds to the end of the container.  So if the panel is vertically
	    // stacked, then the addition is vertically.  Etc.  This is decided by the
	    // GridLayout.

	    // ############################################
	    // ############################################

	    frame.getContentPane().add(panel);

	    // ############################################
	    // ############################################

	    //Display the window.
	    frame.pack();
	    frame.setVisible(true);

	    // ############################################
	    // ############################################
	}
    }

