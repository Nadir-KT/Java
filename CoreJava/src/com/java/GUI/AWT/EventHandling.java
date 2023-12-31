package com.java.GUI.AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Event Classes & Listener Interface
public class EventHandling extends Frame implements ActionListener{
	//// Packages: java.awt.event.*
	//Create components and Register the Component with the Listener
	//Button: public void addActionListenener(ActionListener a)
	//TextField: public void addTextListner(TextListener a)
	//checkBox: public void addItemListener(ItemListener a)
	TextField t;
	Button b;
	public EventHandling() {
		//Create components
		t=new TextField();
		t.setBounds(60, 50, 180, 30);
		b=new Button("Click Here");
		b.setBounds(100, 120, 80, 50);
		//Register the Component with the Listener
		b.addActionListener(this); // this = this object
		add(b);//Appends the specified component to theFrame.
		add(t);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		t.setText("Embedded Application");
	}
	public static void main(String[] args) {
		new EventHandling();
	}
}
