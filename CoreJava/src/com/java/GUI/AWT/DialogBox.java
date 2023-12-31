package com.java.GUI.AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogBox implements ActionListener {
	Frame f;
	Dialog d;
	public DialogBox() {
		f=new Frame("DialogBox");
		d=new Dialog(f, "Confirmation", true);//Dialog(Frame owner, String title, boolean modal)
		//Dialog() Constructs an initially invisible Dialog with the specified owner Frame, title and modality.
		d.setLayout(new FlowLayout());
		Button b1=new Button("Yes");
		b1.setBackground(Color.green);
		Button b2=new Button("No");
		b2.setBackground(Color.red);
		b1.addActionListener(this);
		d.add(new Label("Do you want to overwrite existing files?"));
		d.add(b1);
		d.add(b2);
		d.setSize(400, 100);
		d.setVisible(true);
	}
	public static void main(String[] args) {
		new DialogBox();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		d.setVisible(false);
	}

}
