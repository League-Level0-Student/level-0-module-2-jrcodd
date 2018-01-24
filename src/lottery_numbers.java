import java.util.Random;

import javax.swing.JOptionPane;

public class lottery_numbers {
	public static void main(String[] args) {
		String lottery = "";
		for (int i = 0; i < 5; i++) {
			int x = new Random().nextInt(1000);
			lottery += x;
			if (i != 4) {
				lottery += ",";
			}
		}
		JOptionPane.showMessageDialog(null, (lottery));
	}
}
