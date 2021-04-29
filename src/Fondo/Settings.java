package Fondo;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;


public class Settings  extends JPanel{
private JPanel controls;
public JSlider Slider1, Slider2, Slider3;
private JLabel Label1, Label2, Label3;

	public Settings(){
		
		
		
		Slider1 = new JSlider(JSlider.HORIZONTAL, 0, 10, 3);
		Slider1.setMajorTickSpacing(1);
		Slider1.setPaintTicks(true);
		Slider1.setPaintLabels(true);
		Slider1.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		Slider2 = new JSlider(JSlider.HORIZONTAL, 0, 10, 3);
		Slider2.setMajorTickSpacing(1);
		Slider2.setPaintTicks(true);
		Slider2.setPaintLabels(true);
		Slider2.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		Slider3 = new JSlider(JSlider.HORIZONTAL, 0, 10, 4);
		Slider3.setMajorTickSpacing(1);
		Slider3.setPaintTicks(true);
		Slider3.setPaintLabels(true);
		Slider3.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		SliderListener listener = new SliderListener();
		Slider1.addChangeListener(listener);
		Slider2.addChangeListener(listener);
		Slider3.addChangeListener(listener);
		
		Label1 = new JLabel("velocidad del Covid1: 3");
		Label1.setAlignmentX(Component.LEFT_ALIGNMENT);
		Label2 = new JLabel("velocidad del Covid2: 3");
		Label2.setAlignmentX(Component.LEFT_ALIGNMENT);
		Label3 = new JLabel("velocidad del Covid3: 4");
		Label3.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		controls = new JPanel();
		BoxLayout layout = new BoxLayout(controls, BoxLayout.Y_AXIS);
		controls.setLayout(layout);
		controls.add(Label1);
		controls.add(Slider1);
		controls.add(Box.createRigidArea(new Dimension(0, 20)));
		controls.add(Label2);
		controls.add(Slider2);
		controls.add(Box.createRigidArea(new Dimension(0, 20)));
		controls.add(Label3);
		controls.add(Slider3);
		
		
		
		add(controls);
	}
	public class SliderListener implements ChangeListener{
		public int velo1, velo2, velo3;
		public void stateChanged(ChangeEvent event){
			velo1 = Slider1.getValue();
			velo2 = Slider2.getValue();
			velo3 = Slider3.getValue();
			
			
			
			
			Label1.setText("velocidad del Covid1: " + velo1);
			Label2.setText("velocidad del Covid2: "+ velo2);
			Label3.setText("velocidad del Covid3: " + velo3);
			
		}
	}
}