import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameJ extends JFrame {
	private JLabel item1;
	
	public FrameJ(){
		super("I am learnign Java now");
		setLayout(new FlowLayout());
		
		item1 = new JLabel ("I am the CTO of the new company.");
		item1.setToolTipText("Chief Technology Officer");
		add(item1);
	}
	
}
