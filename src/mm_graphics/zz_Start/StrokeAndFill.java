package mm_graphics.zz_Start;
/*
* @(#)StrokeandFill.java   1.2 98/07/31
*/


import java.lang.Integer;
import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;

/*
 * This applet renders a Shape, selected by the user, using the Stroke and Paint attributes and rendering method
 * also selected by the user.
*/

public class StrokeAndFill extends JApplet implements ItemListener {
    JLabel primLabel, lineLabel, paintLabel, strokeLabel;
    ShapePanel display;
    static JComboBox primitive, line, paint, stroke;
    int index = 0;
    public static boolean no2D = false;

    public void init() {
        GridBagLayout layOut = new GridBagLayout();
        getContentPane().setLayout(layOut);
        GridBagConstraints c = new GridBagConstraints();

        c.weightx = 1.0;
        c.fill = GridBagConstraints.BOTH;
        primLabel = new JLabel();
        primLabel.setText("Primitive");
        Font newFont = getFont().deriveFont(1);
        primLabel.setFont(newFont);
        primLabel.setHorizontalAlignment(JLabel.CENTER);
        layOut.setConstraints(primLabel, c);
        getContentPane().add(primLabel);

        lineLabel = new JLabel();
        lineLabel.setText("Lines");
        lineLabel.setFont(newFont);
        lineLabel.setHorizontalAlignment(JLabel.CENTER);
        layOut.setConstraints(lineLabel, c);
        getContentPane().add(lineLabel);

        c.gridwidth = GridBagConstraints.RELATIVE;
        paintLabel = new JLabel();
        paintLabel.setText("Paints");
        paintLabel.setFont(newFont);
        paintLabel.setHorizontalAlignment(JLabel.CENTER);
        layOut.setConstraints(paintLabel, c);
        getContentPane().add(paintLabel);

        c.gridwidth = GridBagConstraints.REMAINDER;
        strokeLabel = new JLabel();
        strokeLabel.setText("Rendering");
        strokeLabel.setFont(newFont);
        strokeLabel.setHorizontalAlignment(JLabel.CENTER);
        layOut.setConstraints(strokeLabel, c);
        getContentPane().add(strokeLabel);

        GridBagConstraints ls = new GridBagConstraints();
        ls.weightx = 1.0;
        ls.fill = GridBagConstraints.BOTH;
        primitive = new JComboBox( new Object []{
                                   "rectangle",
                                   "ellipse",
                                   "text"});
        primitive.addItemListener(this);
        newFont = newFont.deriveFont(0, 14.0f);
        primitive.setFont(newFont);
        layOut.setConstraints(primitive, ls);
        getContentPane().add(primitive);

        line = new JComboBox( new Object []{
                              "thin",
                              "thick",
                              "dashed"});
        line.addItemListener(this);
        line.setFont(newFont);
        layOut.setConstraints(line, ls);
        getContentPane().add(line);

        ls.gridwidth = GridBagConstraints.RELATIVE;
        paint = new JComboBox( new Object[]{
                               "solid",
                               "gradient",
                               "polka"});
        paint.addItemListener(this);
        paint.setFont(newFont);
        layOut.setConstraints(paint, ls);
        getContentPane().add(paint);

        ls.gridwidth = GridBagConstraints.REMAINDER;
        stroke = new JComboBox( new Object[]{
                                "Stroke",
                                "Fill",
                                "Stroke & Fill"});
        stroke.addItemListener(this);
        stroke.setFont(newFont);
        layOut.setConstraints(stroke, ls);
        getContentPane().add(stroke);

        GridBagConstraints sC = new GridBagConstraints();
        sC.fill = GridBagConstraints.BOTH;
        sC.weightx = 1.0;
        sC.weighty = 1.0;
        sC.gridwidth = GridBagConstraints.REMAINDER;
        display = new ShapePanel();
        layOut.setConstraints(display, sC);
        display.setBackground(Color.white);
        getContentPane().add(display);

        validate();

    }

    public void itemStateChanged(ItemEvent e){
        display.renderShape();
    }

    public static void main( String[] argv ) {
        if ( argv.length > 0 && argv[0].equals( "-no2d" ) ) {
	    StrokeAndFill.no2D = true;
	}
	      
        JFrame frame = new JFrame( "StrokeAndFill" );
	frame.addWindowListener( new WindowAdapter(){
	    public void windowClosing( WindowEvent e ){
	        System.exit( 0 );
	    }
	});

	JApplet applet = new StrokeAndFill();
	frame.getContentPane().add( BorderLayout.CENTER, applet );

	applet.init();

	frame.setSize( 450, 250 );
	frame.show();
    }
}

class ShapePanel extends JPanel {
    BasicStroke bstroke = new BasicStroke(3.0f);
    int w, h;
    Shape shapes[] = new Shape[3];

    public ShapePanel(){
        setBackground(Color.white);
        shapes[0] = new Rectangle(0, 0, 100, 100);
        shapes[1] = new Ellipse2D.Double(0.0, 0.0, 100.0, 100.0);
        TextLayout textTl = new TextLayout("Text", new Font("Helvetica", 1, 96), new FontRenderContext(null, false, false));
	AffineTransform textAt = new AffineTransform();
	textAt.translate(0, (float)textTl.getBounds().getHeight());
        shapes[2] = textTl.getOutline(textAt);
    }

    // Invokes the paint method.
    public void renderShape() {
        repaint();
    }


    public void paintComponent (Graphics g) {
        super.paintComponent(g);

	if ( !StrokeAndFill.no2D ) {
	    Graphics2D g2 = (Graphics2D) g;
	    Dimension d = getSize();
	    w = d.width;
	    h = d.height;
	    int width, height;

	    // Prints the initial instructions.
	    String instruct  = "Pick a primitive, line style, paint, and rendering method.";
	    TextLayout thisTl = new TextLayout(instruct, new Font("Helvetica", 0, 10), g2.getFontRenderContext());
	    Rectangle2D bounds = thisTl.getBounds();
	    width = (int)bounds.getWidth();
	    thisTl.draw(g2, w/2-width/2, 20);
	    
	    Stroke oldStroke = g2.getStroke();
	    
	    // Sets the Stroke.
	    switch ( StrokeAndFill.line.getSelectedIndex() ) {
	    case 0 : g2.setStroke(new BasicStroke(3.0f)); break;
	    case 1 : g2.setStroke(new BasicStroke(8.0f)); break;
	    case 2 : float dash[] = {10.0f};
	        g2.setStroke(new BasicStroke(3.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, dash, 0.0f));
		break;
	    }
	    
	    Paint oldPaint = g2.getPaint();
	    
	    // Sets the Paint.
	    switch ( StrokeAndFill.paint.getSelectedIndex() ) {
	    case 0 : g2.setPaint(Color.blue); break;
	    case 1 : g2.setPaint(new GradientPaint(0, 0, Color.lightGray, w-250, h, Color.blue, false)); 
	        break;
	    case 2 : BufferedImage bi = new BufferedImage(5, 5, BufferedImage.TYPE_INT_RGB);
	        Graphics2D big = bi.createGraphics();
		big.setColor(Color.blue);
		big.fillRect(0, 0, 5, 5);
		big.setColor(Color.lightGray);
		big.fillOval(0, 0, 5, 5);
		Rectangle r = new Rectangle(0,0,5,5);
		g2.setPaint(new TexturePaint(bi, r));
		break;
        }

	    // Sets the Shape.
	    Shape shape = shapes[StrokeAndFill.primitive.getSelectedIndex()];
	    Rectangle r = shape.getBounds();
	    
	    // Sets the selected Shape to the center of the Canvas.
            AffineTransform saveXform = g2.getTransform();
	    AffineTransform toCenterAt = new AffineTransform();
	    toCenterAt.translate(w/2-(r.width/2), h/2-(r.height/2));
	    g2.transform(toCenterAt);

	    // Determines whether to fill, stroke, or fill and stroke.
	    switch ( StrokeAndFill.stroke.getSelectedIndex() ) {
	    case 0 : g2.draw(shape); break;
	    case 1 : g2.fill(shape); break;
	    case 2 : Graphics2D tempg2 = g2;
	        g2.fill(shape);
		g2.setColor(Color.darkGray);
		g2.draw(shape);
		g2.setPaint(tempg2.getPaint()); break;
	    }
	    g2.setTransform(saveXform);
	    g2.setStroke(oldStroke);
	    g2.setPaint(oldPaint);

	} else {
            g.drawRect(0, 0, 100, 100);
        }
}}
