import javax.swing.JOptionPane;

public class Roller_Coster {
	public static void main(String[] args) {
		String ageString = JOptionPane.showInputDialog("How tall are you? (in inches)");
		int age = Integer.parseInt(ageString);
		if (age > 48) {

			System.out.println("You are tall enough to ride the rollar coster!!");
		} else {
			System.out.println("grow more!!");

		}

	}

}
