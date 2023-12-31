package com.java.GUI.AWT;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

//Label CheckBox
public class Components extends Frame implements ActionListener, ItemListener {
	Label l1;
	Label l2;
	public Components() {
		l1=new Label("First name");
		l2=new Label("Second name");
		l1.setBounds(50, 100, 100, 50);
		//l1.setAlignment(Label.LEFT);//Possible alignments are Label.LEFT, Label.RIGHT, and Label.CENTER.
		l2.setBounds(50, 150, 100, 50);
		TextField t=new TextField();
		t.setBounds(60, 50, 180, 30);//Component.setBounds(int x, int y, int width, int height)
		Button b=new Button("Click Here");
		b.setBounds(200, 120, 80, 20);
		Checkbox c1=new Checkbox("C++");
		c1.setBounds(100, 200, 50, 50);
		//Checkbox(String label, boolean state) throws HeadlessException
		//Parameter:label a string label for this check box,or null for no label
		//          state the initial state of this check box
		Checkbox c2=new Checkbox("Java", true);
		
		c2.setBounds(100, 250, 50, 50);
		b.addActionListener(this);
		c1.addItemListener(this);
		c2.addItemListener(this);
		add(l1);
		add(l2);
		add(b);
		add(c1);
		add(c2);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Components();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		l2.setText("actionPerformed");
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String var;
		if(e.getStateChange()==1)
			var="Checked";
		else
			var="Unchecked";
		l1.setText("itemStateChanged: "+var);
	}

}
