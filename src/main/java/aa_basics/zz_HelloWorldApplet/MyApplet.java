package aa_basics.zz_HelloWorldApplet;
import java.applet.* ;
import java.awt.* ;

public class MyApplet extends Applet {
    public void paint ( Graphics g ) {
	g.drawString ( "dies ist unten" , 50 , 100 ) ;
	g.drawString ( "dies ist mitte" , 50 , 50 ) ;
	g.drawString ( "dies ist oben" ,  50 , 250 ) ;
	System.out.println ( "tata" ) ;
    }
}