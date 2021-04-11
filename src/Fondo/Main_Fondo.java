package Fondo;
import javax.swing.*;

public class Main_Fondo {
	public static void main(String [] args)
	{
		JFrame frame = new JFrame("Rebound");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new Fondo());
		
		frame.pack();
		frame.setVisible(true);
	}
}
