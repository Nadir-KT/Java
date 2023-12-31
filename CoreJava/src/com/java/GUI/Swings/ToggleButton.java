package com.java.GUI.Swings;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

public class ToggleButton extends JFrame implements ItemListener//, ActionListener 
{

	JToggleButton tb;//An implementation of a two-state button. 
	JButton bt;//An implementation of a "push" button. 
	public ToggleButton() {
		tb=new JToggleButton("ON");
		//bt=new JButton("ON");
		add(tb);
		//add(bt);
		tb.addItemListener(this);
		//tb.addActionListener(this);
		setTitle("Toggle Example");//Sets the title for this frame to the specified string.
		setLayout(new FlowLayout());
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ToggleButton();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(tb.isSelected())
			tb.setText("OFF");
		else
			tb.setText("ON");
	}
	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		if(tb.isSelected())
			tb.setText("OFF");
		else
			tb.setText("ON");
	}
	*/
}
