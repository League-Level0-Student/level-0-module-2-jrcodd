import javax.swing.JOptionPane;

public class voting_booth {
	public static void main(String[] args) {
		String age = JOptionPane.showInputDialog("how old are you?");
		if (Integer.parseInt(age) > 18) {
			JOptionPane.showMessageDialog(null, "can you vote for me please?");
		} else {
			JOptionPane.showMessageDialog(null, "What do you want your job to be?");

		}

	}
}
