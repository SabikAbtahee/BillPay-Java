import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String [] args) {
		boolean firstTime=true;
		homepage J = new homepage(firstTime);
//		Balance J =new Balance();
		
		J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		J.setSize(700, 225);
		J.setVisible(true);
		
	}

}
