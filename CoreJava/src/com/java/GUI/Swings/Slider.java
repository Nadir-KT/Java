package com.java.GUI.Swings;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		//JSlider(int orientation, int min, int max, int value)
		JPanel panel=new JPanel();
		JSlider slider=new JSlider(JSlider.HORIZONTAL, 0 ,100, 50);
		panel.add(slider);
		frame.add(panel);
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

}
