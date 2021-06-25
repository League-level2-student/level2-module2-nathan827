package individual_project;

import javax.swing.*;
import java.awt.Dimension;

import java.util.*;

public class Blocks{
	JButton[] buttons = new JButton [100];
	public void setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.add(panel);
		for(int i = 0; i < buttons.length; i++) {
			buttons [i] = new JButton();
			buttons [i].setPreferredSize(new Dimension(50,50));
			
			panel.add(buttons [i]);
		}
		
		Dimension size = new Dimension(550,600);
		panel.setPreferredSize(size);
		frame.setPreferredSize(size);;
		frame.pack();
		
		
	}
	
	
	
}
