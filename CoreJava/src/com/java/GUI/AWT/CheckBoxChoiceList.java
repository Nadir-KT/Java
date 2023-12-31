package com.java.GUI.AWT;//33:50

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.List;

public class CheckBoxChoiceList implements ActionListener{
	Choice ch;//The Choice class presents a pop-up menu of choices.
	Label l;//A Label object is a component for placing text in a container.
	List ls;//The List component presents the user with a scrolling list of text items.
	public CheckBoxChoiceList() {
		Frame f=new Frame("CheckBoxChoiceList");
		
		CheckboxGroup cg=new CheckboxGroup();
		Checkbox cb1=new Checkbox("Choice 1", false, cg);//Checkbox(String label, boolean state, CheckboxGroup group)
		cb1.setBounds(100, 100, 70, 50);//setBounds(int x, int y, int width, int height)
		Checkbox cb2=new Checkbox("Choice 2", false, cg);//false: Unchecked by default
		cb2.setBounds(100, 150, 70, 50);
		Checkbox cb3=new Checkbox("Choice 3", true, cg);//true: Checked by default
		cb3.setBounds(100, 200, 70, 50);
		
		ch=new Choice();//Creates a new choice menu. The menu initially has no items in it. 
		ch.setBounds(100, 250, 100, 25);
		ch.add("Java");
		ch.add("Spring");
		ch.add("Hibernate");
		ch.add("SpringBoot");
		ch.add("Maven");
		Button b1=new Button("Select");
		b1.setBounds(250, 250, 50, 25);
		b1.addActionListener(this);
		
		//java.awt.List ls=new java.awt.List(5);//use full address if there is an issue with import
		ls=new List(5);//java.awt.List.List(int rows)//Creates a new scrolling list initialized with the specified number of visible lines.
		ls.setBounds(100, 300, 100, 100);//setBounds(int x, int y, int width, int height)
		ls.add("Java");
		ls.add("Spring");
		ls.add("Hibernate");
		ls.add("SpringBoot");
		ls.add("Maven");
		Button b2=new Button("Select");
		b2.setBounds(250, 350, 50, 25);
		b2.addActionListener(this);
		
		l=new Label();
		l.setAlignment(Label.RIGHT);
		//l.setBounds(150, 350, 200, 25);//setBounds(int x, int y, int width, int height)
		l.setSize(200, 100);//setSize(int width, int height)
		l.setText("Label");
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(l);
		f.add(ch);
		f.add(b1);
		f.add(ls);
		f.add(b2);
		f.setSize(650, 650);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBoxChoiceList();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//getItem(): Gets the string at the specified index in this Choice menu.
		//getSelectedIndex(): Returns the index of the currently selected item.If nothing is selected, returns -1.
		String item=ch.getItem(ch.getSelectedIndex());
		String SI="Selected Item = "+item;
		//l.setText(SI);
		String List="Selected Item = "+ls.getItem(ls.getSelectedIndex());
		l.setText("Selected Item = "+ls.getItem(ls.getSelectedIndex()));
	}

}
