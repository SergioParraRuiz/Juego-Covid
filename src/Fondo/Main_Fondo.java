package Fondo;
import javax.swing.*;




public class Main_Fondo {
	public static void main(String [] args)
	{
		JFrame frame = new JFrame("Rebound");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//String jugar;
		//jugar = JOptionPane.showInputDialog("¿Quieres jugar? ");

		
		Elemento d= new Elemento();
		Settings a=new Settings(d);
		
		
		JTabbedPane tp = new JTabbedPane(); 
		tp.addTab("Game",  d);
		tp.addTab("Settings", a );
		frame.getContentPane().add(tp);
		
		frame.pack();
		frame.setVisible(true);
		
	}
}


//new sett in main
//