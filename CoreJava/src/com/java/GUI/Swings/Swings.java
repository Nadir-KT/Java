package com.java.GUI.Swings;

import javax.swing.*;
/*
Java Swing is a part of Java Foundation Classes (JFC) that is used to create window-based applications. 
It is built on the top of AWT (Abstract Windowing Toolkit) API and entirely written in java.

Unlike AWT, Java Swing provides platform-independent and lightweight components.

The javax.swing package provides classes for java swing API such as JButton, JTextField, JTextArea, 
JRadioButton, JCheckbox, JMenu, JColorChooser etc.

Swing (javax.swing.*): platform-independent, lightweight components, More components  , Follows MV (Model-View-Controller)
AWT   (java.awt.*)   : platform-dependent  , Heavyweight components, Lesser Components, Doesn't Follow MVC
*/
public class Swings {
	
	public static void main(String[] args) {
		//Methods of swing API (API: Group of classes & Interfaces)
		//public void add(Component c)
		//public void setSize(int width, int height)
		//public void setLayout(LayoutManager mgr)
		//public void setVisible(boolean b)
		JFrame f=new JFrame("JFrame");//Constructs a new frame that is initially invisible. 
		JButton b=new JButton("Click");//Creates a button with text.
		b.setBounds(120, 100, 120, 50);
		f.add(b);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
