package Fondo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fondo extends JPanel {


	private final int WIDTH = 600, HEIGHT = 700;

	private ImageIcon fondo,escalera2,escalera1,vacuna,personaje,covid1,covid2,covid3;
	private int xfondo, yfondo,xescalera2,yescalera2,xescalera1,yescalera1,xvacuna,yvacuna,xpersonaje,ypersonaje,xcovid1,ycovid1,xcovid2,ycovid2,xcovid3,ycovid3;

	public Fondo(){
		
	
		fondo = new ImageIcon("background.png");
		escalera2= new ImageIcon("escalera2.png");
		escalera1= new ImageIcon("escalera1.png");
		vacuna= new ImageIcon("vacuna.png");
		personaje= new ImageIcon("prota.png");
		covid1= new ImageIcon("covid.png");
		covid2= new ImageIcon("covid.png");
		covid3= new ImageIcon("covid.png");


		xcovid1=520;
		ycovid1=552;//568-16
		xcovid2=520;
		ycovid2=301;//317-16
		xcovid3=520;
		ycovid3=93;//105-12
		
		xpersonaje=30;
		ypersonaje=532;
		xvacuna=240;
		yvacuna=150;
		xescalera1=100;
		yescalera1=177;
		xescalera2=300;
		yescalera2=390;
		
		xfondo = 0;
		yfondo = 0;
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.black);
		
	}

	public void paintComponent(Graphics page){
		super.paintComponent(page);
		fondo.paintIcon(this,  page,  xfondo,  yfondo);
		escalera2.paintIcon(this, page, xescalera2, yescalera2);
		escalera1.paintIcon(this, page, xescalera1, yescalera1);
		vacuna.paintIcon(this, page, xvacuna, yvacuna);
		personaje.paintIcon(this, page, xpersonaje, ypersonaje);
		covid1.paintIcon(this, page, xcovid1, ycovid1);
		covid2.paintIcon(this, page, xcovid2, ycovid2);
		covid3.paintIcon(this, page, xcovid3, ycovid3);





	}

	private class ReboundListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			
			repaint();
	}
}
}
