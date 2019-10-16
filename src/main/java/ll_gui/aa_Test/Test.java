package ll_gui.aa_Test;
import javax.swing.*;        
import java.awt.*;
import java.awt.event.*;

class Test implements Runnable
{
	public void run () 
	{
		// ############################################
		// ############################################

//		// replace default window manager decoration by java decoration
//		JFrame.setDefaultLookAndFeelDecorated(true);

		//Create the window (= frame):
		JFrame frame = new JFrame("WindowName");
//		JWindow frame = new JWindow() ;

//		// without this, the pgm does not exit when the window is closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ############################################
		// ############################################

		// Create and add a button:
		JButton button = new JButton("this is a nice button");
		JButton button2 = new JButton("this is a nice button 2");
		JButton button3 = new JButton("this is a nice button 3");
		JButton button4 = new JButton("this is a nice button 4");
		JButton button5 = new JButton("this is a nice button 5");
		JButton button6 = new JButton("this is a nice button 6");
		JButton button7 = new JButton("this is a nice button 7");

//		frame.getContentPane().add(button);

		// ############################################
		// ############################################

		// Create and add label:
		JLabel label = new JLabel("this is a label",SwingConstants.CENTER);
//		frame.getContentPane().add(label);

		// ############################################
		// ############################################

		JPanel panel = new JPanel(new GridLayout(2, 2));
		panel.setBorder(BorderFactory.createEmptyBorder(
				30, //top
				30, //left
				30, //bottom
				30) //right
		);
		panel.add(label);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);

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

		Test test = new Test () ;

		javax.swing.SwingUtilities.invokeLater( test ) ;
//		test.run() ;

	}
}

//Local Variables:
//fill-column: 90
//c-basic-offset: 4
//indent-tabs-mode: f
//End: 
