package ballWorld;
import java.awt.*;
import javax.swing.JFrame;

public class BallWorld extends JFrame {

	public static void main (String[] args){
		BallWorld world = new BallWorld(Color.red);
	}
	
	public sttatic final int FrameWidth = 600;
	public static final int FrameHeight = 400;
	private Ball aBall = new Ball (new Point(50,50), 20);
	
	private BallWorld(Color ballColor){
		setSize (FrameWidth, FrameHeight);
		setTitle("Ball World");
		
		aBall.setColor(ballColor);
		aBall.setMotion(3.0, 6.0);
	}
	
	public void paint()
	
}
