package Fondo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import Fondo.Settings.SliderListener;




public class Elemento extends JPanel {

	private final int WIDTH = 600, HEIGHT = 700;
	private JPanel	etiqueta;

	private ImageIcon fondo,escalera2,escalera1,vacuna;
	private int xfondo, yfondo,xescalera2,yescalera2,xescalera1,yescalera1,xvacuna,yvacuna;
	
	private ImageIcon personaje,covid1,covid2,covid3;
	public int xpersonaje,ypersonaje,xcovid1,ycovid1,xcovid2,ycovid2,xcovid3,ycovid3;
	
	private final int DELAY = 20;
	private Timer timer;
	public int moveX1,moveX2,moveX3,aux,JUMP,playAgain;
	
	
	public Elemento(){
		
		timer = new Timer(DELAY, new ReboundListener());

		
		//ElementoEstatico fondo= new ElementoEstatico(this.fondo=new ImageIcon("background.png"),xfondo=0,yfondo=0);
		//ElementoEstatico escalera1= new ElementoEstatico(this.escalera1=new ImageIcon("escalera1.png"),xescalera1=100,yescalera1=177);
		//ElementoEstatico escalera2= new ElementoEstatico(this.escalera2=new ImageIcon("escalera2.png"),xescalera2=300,yescalera2=390);
		//ElementoEstatico vacuna= new ElementoEstatico(this.vacuna=new ImageIcon("vacuna.png"),xvacuna=240,yvacuna=150);

		//ElementoDinamico personaje= new ElementoDinamico(this.personaje=new ImageIcon("background.png"),xpersonaje=30,ypersonaje=253);
		//ElementoDinamico covid1= new ElementoDinamico(this.covid1=new ImageIcon("escalera1.png"),xcovid1=520,ycovid1=552);
		//ElementoDinamico covid2= new ElementoDinamico(this.covid2=new ImageIcon("escalera2.png"),xcovid2=520,ycovid2=301);
		//ElementoDinamico covid3= new ElementoDinamico(this.covid3=new ImageIcon("vacuna.png"),xcovid3=520,ycovid3=93);
		

		moveX1 =3;
		moveX2 =3;
		moveX3=4;
		
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
		
		addKeyListener(new DirectionListener());
		JUMP=7;
		
		
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.black);
		timer.start();
		setFocusable(true);
		
		


	}
	
	private class ReboundListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			

			xcovid1+= moveX1;
			xcovid2+=moveX2;
			xcovid3+=moveX3;

			if(xcovid1>=WIDTH-covid1.getIconWidth()+10 | xcovid1<100) moveX1 = moveX1 * -1;
			if(xcovid2>=WIDTH-covid2.getIconWidth()+10 | xcovid2<0) moveX2 = moveX2 * -1;
			if(xcovid3>=WIDTH-covid3.getIconWidth()+10 | xcovid3<0) moveX3 = moveX3 * -1;

			if(((xpersonaje<=(xcovid1)& (xcovid1)<=(xpersonaje+55))||((xpersonaje-69)<=(xcovid1)& (xcovid1)<=xpersonaje)) & ypersonaje==532 ) { 
				
				if(aux==0) {
					JOptionPane.showMessageDialog(null, "Game Over");
					playAgain=JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
				
					if(playAgain==1||playAgain==2) {				moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
				
						if(playAgain==0) {
							xcovid1=520;
							xcovid2=520;
							xcovid3=520;
							xpersonaje=30;
							ypersonaje=532;

						}
				}
				if(aux==1) {moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
			}
			if(((xpersonaje<=(xcovid1)& (xcovid1)<=(xpersonaje+35))||((xpersonaje-49)<=(xcovid1)& (xcovid1)<=xpersonaje)) & (ypersonaje<=525 & ypersonaje>=469)) { 
				
				if(aux==0) {
					JOptionPane.showMessageDialog(null, "Game Over");
					playAgain=JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
				
					if(playAgain==1||playAgain==2) {				moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
				
						if(playAgain==0) {
							xcovid1=520;
							xcovid2=520;
							xcovid3=520;
							xpersonaje=30;
							ypersonaje=532;

						}
				}
				if(aux==1) {moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
			}
			if(((xpersonaje<=(xcovid1)& (xcovid1)<=(xpersonaje+25))||((xpersonaje-39)<=(xcovid1)& (xcovid1)<=xpersonaje)) & (ypersonaje<=469 & ypersonaje>=455)) { 
				
				if(aux==0) {
					JOptionPane.showMessageDialog(null, "Game Over");
					playAgain=JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
				
					if(playAgain==1||playAgain==2) {				moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
				
						if(playAgain==0) {
							xcovid1=520;
							xcovid2=520;
							xcovid3=520;
							xpersonaje=30;
							ypersonaje=532;

						}
				}
				if(aux==1) {moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
			}
//SEGUNDA PLANTA ----------------------------------------------------------------------------------------------------------------------------------------
			//LAS ANCHURA EN ESTO SON DISTINTAS A LA PPRIMERA PLANTA PQ EL PERSONAJE NO ESTÁ A LA MISMA ALTURA DEL SUELO QUE ANTES
			
			if(((xpersonaje<=(xcovid2)& (xcovid2)<=(xpersonaje+55))||((xpersonaje-69)<=(xcovid2)& (xcovid2)<=xpersonaje)) & ypersonaje==280) { 
				
				if(aux==0) {
					JOptionPane.showMessageDialog(null, "Game Over");
					playAgain=JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
				
					if(playAgain==1||playAgain==2) {				moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
				
						if(playAgain==0) {
							xcovid1=520;
							xcovid2=520;
							xcovid3=520;
							xpersonaje=30;
							ypersonaje=532;

						}
				}
				if(aux==1) {moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
			}
			if(((xpersonaje<=(xcovid2)& (xcovid2)<=(xpersonaje+40))||((xpersonaje-54)<=(xcovid2)& (xcovid2)<=xpersonaje)) & (ypersonaje<=273 & ypersonaje>=216)) { 
				
				if(aux==0) {
					JOptionPane.showMessageDialog(null, "Game Over");
					playAgain=JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
				
					if(playAgain==1||playAgain==2) {				moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
				
						if(playAgain==0) {
							xcovid1=520;
							xcovid2=520;
							xcovid3=520;
							xpersonaje=30;
							ypersonaje=532;

						}
				}
				if(aux==1) {moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
			}
			
			if(((xpersonaje<=(xcovid2)& (xcovid2)<=(xpersonaje+25))||((xpersonaje-39)<=(xcovid2)& (xcovid2)<=xpersonaje)) & (ypersonaje<=216 & ypersonaje>=202)) { 
				
				if(aux==0) {
					JOptionPane.showMessageDialog(null, "Game Over");
					playAgain=JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
				
					if(playAgain==1||playAgain==2) {				moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
				
						if(playAgain==0) {
							xcovid1=520;
							xcovid2=520;
							xcovid3=520;
							xpersonaje=30;
							ypersonaje=532;

						}
				}
				if(aux==1) {moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
			}
			
			//Primera escalera-------------------------------------------------------------------------
			
			if(((xpersonaje<=(xcovid2)& (xcovid2)<=(xpersonaje+30))||((xpersonaje-44)<=(xcovid2)& (xcovid2)<=xpersonaje)) & (ypersonaje<=370 & ypersonaje>=344)) { 
				
				if(aux==0) {
					JOptionPane.showMessageDialog(null, "Game Over");
					playAgain=JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
				
					if(playAgain==1||playAgain==2) {				moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
				
						if(playAgain==0) {
							xcovid1=520;
							xcovid2=520;
							xcovid3=520;
							xpersonaje=30;
							ypersonaje=532;

						}
				}
				if(aux==1) {moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
			}
			
			if(((xpersonaje<=(xcovid2)& (xcovid2)<=(xpersonaje+45))||((xpersonaje-59)<=(xcovid2)& (xcovid2)<=xpersonaje)) & (ypersonaje<=344 & ypersonaje>=308)) { 
				
				if(aux==0) {
					JOptionPane.showMessageDialog(null, "Game Over");
					playAgain=JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
				
					if(playAgain==1||playAgain==2) {				moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
				
						if(playAgain==0) {
							xcovid1=520;
							xcovid2=520;
							xcovid3=520;
							xpersonaje=30;
							ypersonaje=532;

						}
				}
				if(aux==1) {moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
			}
			if(((xpersonaje<=(xcovid2)& (xcovid2)<=(xpersonaje+55))||((xpersonaje-69)<=(xcovid2)& (xcovid2)<=xpersonaje)) & (ypersonaje<=308 & ypersonaje>=280)) { 
				
				if(aux==0) {
					JOptionPane.showMessageDialog(null, "Game Over");
					playAgain=JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
				
					if(playAgain==1||playAgain==2) {				moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
				
						if(playAgain==0) {
							xcovid1=520;
							xcovid2=520;
							xcovid3=520;
							xpersonaje=30;
							ypersonaje=532;

						}
				}
				if(aux==1) {moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
			}
			
//TERCERA PLANTA ----------------------------------------------------------------------------------------------------------------------------------------

			if(((xpersonaje<=(xcovid3)& (xcovid3)<=(xpersonaje+55))||((xpersonaje-69)<=(xcovid3)& (xcovid3)<=xpersonaje)) & ypersonaje==70) { 
				
				if(aux==0) {
					JOptionPane.showMessageDialog(null, "Game Over");
					playAgain=JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
				
					if(playAgain==1||playAgain==2) {				moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
				
						if(playAgain==0) {
							xcovid1=520;
							xcovid2=520;
							xcovid3=520;
							xpersonaje=30;
							ypersonaje=532;

						}
				}
				if(aux==1) {moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
			}

//CUANDO SUBE ESCALERA------------------------------------------------------------------------------------------
if(((xpersonaje<=(xcovid3)& (xcovid3)<=(xpersonaje+15))||((xpersonaje-29)<=(xcovid3)& (xcovid3)<=xpersonaje)) & (ypersonaje<=161 & ypersonaje>=147)) { 
				
				if(aux==0) {
					JOptionPane.showMessageDialog(null, "Game Over");
					playAgain=JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
				
					if(playAgain==1||playAgain==2) {				moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
				
						if(playAgain==0) {
							xcovid1=520;
							xcovid2=520;
							xcovid3=520;
							xpersonaje=30;
							ypersonaje=532;

						}
				}
				if(aux==1) {moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
			}
			
			if(((xpersonaje<=(xcovid3)& (xcovid3)<=(xpersonaje+45))||((xpersonaje-59)<=(xcovid3)& (xcovid3)<=xpersonaje)) & (ypersonaje<=147 & ypersonaje>=110)) { 
				
				if(aux==0) {
					JOptionPane.showMessageDialog(null, "Game Over");
					playAgain=JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
				
					if(playAgain==1||playAgain==2) {				moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
				
						if(playAgain==0) {
							xcovid1=520;
							xcovid2=520;
							xcovid3=520;
							xpersonaje=30;
							ypersonaje=532;

						}
				}
				if(aux==1) {moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
			}
			if(((xpersonaje<=(xcovid3)& (xcovid3)<=(xpersonaje+55))||((xpersonaje-69)<=(xcovid3)& (xcovid3)<=xpersonaje)) & (ypersonaje<=110 & ypersonaje>=77)) { 
				
				if(aux==0) {
					JOptionPane.showMessageDialog(null, "Game Over");
					playAgain=JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
				
					if(playAgain==1||playAgain==2) {				moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
				
						if(playAgain==0) {
							xcovid1=520;
							xcovid2=520;
							xcovid3=520;
							xpersonaje=30;
							ypersonaje=532;

						}
				}
				if(aux==1) {moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
			}
			
			
//VACUNA----------------------------------------------------------------------------------------------------------------------------------------			
			if((xpersonaje<=(xvacuna)& (xvacuna)<=(xpersonaje+48)) & ypersonaje==70) { 
				
				if(aux==0) {
					JOptionPane.showMessageDialog(null, "Enhorabuena te has vacunado");
					playAgain=JOptionPane.showConfirmDialog(null, "¿Quieres jugar de nuevo?");
				
					if(playAgain==1||playAgain==2) {				moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
				
						if(playAgain==0) {
							xcovid1=520;
							xcovid2=520;
							xcovid3=520;
							xpersonaje=30;
							ypersonaje=532;

						}
				}
				if(aux==1) {moveX1=0;moveX2=0;moveX3=0;JUMP=0;aux=1;}
			}
			
			repaint();
			
		}	
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
	
	private class DirectionListener extends KeyAdapter{
		public void keyPressed(KeyEvent event){
			
			if((ypersonaje ==532 || ypersonaje==280 || ypersonaje==70||(xpersonaje >=280 & xpersonaje<=357)||(xpersonaje >=86 & xpersonaje<=151))&xpersonaje<=554 ) {
				switch(event.getKeyCode()){	
				case KeyEvent.VK_RIGHT:
					xpersonaje+=JUMP;break;
				
				}			
				repaint();
		}
			
			//Estos los he tenido que separar por que sino cuando subia por el borde de la escalera no podia moverme lateralmente por ella, y si le daba un poco mas de rango al movimiento en el eje x, si que podia moverme por la escalera, pero me salia un paso por la izquierda. Lo mismo por la derecha
			
			if((ypersonaje ==532 || ypersonaje==280 || ypersonaje==70||(xpersonaje >=287 & xpersonaje<=364)||(xpersonaje >=93 & xpersonaje<=158))& xpersonaje>=0) {
				switch(event.getKeyCode()){
				case KeyEvent.VK_LEFT:
					xpersonaje-=JUMP; break;
				
				}
				repaint();
			}
			
			//Estos los tuve que separar por que cuado terminaba de subir las escaleras, no podia volver a bajarlas
			if(((xpersonaje >=280 & xpersonaje<=364)& (ypersonaje <=532 & ypersonaje>=287))|| ((xpersonaje >=86 & xpersonaje<=158)& (ypersonaje <=287 & ypersonaje>=77))) {
				switch(event.getKeyCode()){
				case KeyEvent.VK_UP:
					ypersonaje-=JUMP; break;
					
				}
				repaint();
			}
			if(((xpersonaje >=280 & xpersonaje<=364)& (ypersonaje <=525 & ypersonaje>=280))|| ((xpersonaje >=86 & xpersonaje<=158)& (ypersonaje <=273 & ypersonaje>=70))) {
				switch(event.getKeyCode()){
				case KeyEvent.VK_DOWN:
					ypersonaje+=JUMP; break;
				
				}
				repaint();
			}
		}
	}



	
	}
















	
	
