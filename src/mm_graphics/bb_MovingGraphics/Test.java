package mm_graphics.bb_MovingGraphics;
import javax.swing.*;        
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Test
{

	private JLabel label_ = null ;
	private MyPanel displayPanel_ = null ;

	private int counter_ = 0 ;

	private AdvanceActionListener advanceActionListener_ = null ;

	private Timer timer_ = null ;

	private class MyPanel extends JPanel {
		protected void paintComponent ( Graphics g ) {
			super.paintComponent(g) ;
			Graphics2D g2 = (Graphics2D) g ;

			double ww = this.getSize().width ;
			double hh = this.getSize().height ;

			g2.setPaint ( Color.green ) ;

			double xx = ww/2 + ww/2.1*Math.sin( counter_/100.) ;
			double yy = hh/2 + hh/2.1*Math.cos( counter_/100.) ;

			double rr = ww/100. ;

			g2.fill( new Ellipse2D.Double( xx-rr, yy-rr, 2*rr, 2*rr ) ) ;
		}
	}

	private class AdvanceActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			counter_ ++ ;
			label_.setText ( "counter: " + counter_ ) ;
			displayPanel_.repaint() ;
//			displayPanel_.paintImmediately( displayPanel_.getVisibleRect() ) ;
		}
	}

	private class PlayActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			if ( timer_ == null ) {
				timer_ = new Timer( 1 , advanceActionListener_ ) ;
			}
			timer_.start() ;
		}
	}

	private class StopActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			if ( timer_ != null ) {
				timer_.stop() ;
			}
		}
	}


	public void run () 
	{
		System.out.println ( "entering run ..." ) ;

		// ############################################
		// ############################################
		// create containing frame:

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("WindowName");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ############################################
		// ############################################
		// create buttons and respective listeners

		JButton advanceButton = new JButton("advance") ;
		advanceActionListener_ = new AdvanceActionListener() ;
		advanceButton.addActionListener( advanceActionListener_ ) ;

		JButton playButton = new JButton("play") ;
		PlayActionListener playActionListener = new PlayActionListener() ;
		playButton.addActionListener( playActionListener ) ;

		JButton stopButton = new JButton("stop") ;
		StopActionListener stopActionListener = new StopActionListener() ;
		stopButton.addActionListener( stopActionListener ) ;

		// ############################################
		// ############################################
		// create a status label:

		label_ = new JLabel("this is a label",SwingConstants.CENTER);

		// ############################################
		// ############################################
		// put buttons, label into a panel:

		JPanel buttonPanel = new JPanel();
		buttonPanel.add(advanceButton);
		buttonPanel.add(playButton);
		buttonPanel.add(stopButton);
		buttonPanel.add(label_) ;

		// ############################################
		// generate a panel where we will display the graphics:

		displayPanel_ = new MyPanel() ;
		Dimension preferredSize = new Dimension ( 400, 400 ) ;
		displayPanel_.setPreferredSize( preferredSize ) ;

		// ############################################
		// generate a mother panel into which the two other panels go:

		JPanel motherPanel = new JPanel( ) ;
		motherPanel.setLayout( new BoxLayout(motherPanel, BoxLayout.Y_AXIS) ) ;
		motherPanel.add(buttonPanel) ;
		motherPanel.add(displayPanel_);

		// ############################################
		// ############################################
		// add mother panel to the fame:

		frame.getContentPane().add(motherPanel);

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

		test.run() ;

	}
}

//Local Variables:
//fill-column: 90
//c-basic-offset: 4
//indent-tabs-mode: f
//End: 
