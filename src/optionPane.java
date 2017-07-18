import javax.swing.JOptionPane;

public class optionPane {

	public static void main(String[] args) {
		String fn = JOptionPane.showInputDialog("Enter Your first name:");
		String ln = JOptionPane.showInputDialog("Enter your last name: ");
		String ag = JOptionPane.showInputDialog("Enter your year of birth");
		
		String name = fn + " " + ln;
		int age = 2017 - Integer.parseInt(ag);
		
		JOptionPane.showMessageDialog(null, "Your name is "+name+" and your age is "+age, "Java", JOptionPane.PLAIN_MESSAGE);
	}
}
