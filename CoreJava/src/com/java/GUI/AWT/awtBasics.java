package com.java.GUI.AWT;

import java.awt.Button;
import java.awt.Frame;
//Abstract Window Toolkit (AWT)
// Platform(OS) Dependent
// Packages: java.awt.*
// Containers: Window, Panel, Frame, Dialog
public class awtBasics extends Frame{
//Frame object creation with Button, Position, View, Size, Title
	public awtBasics() {
		Button b1=new Button("Close");
		//setBounds(int x, int y, int width, int height)
		b1.setBounds(250, 250, 80, 30);//Boundary
		//public void add(Component arg)//Appends the specified component to the end of this container.
		add(b1);
		//public void setSize(int width, int height)
		setSize(350, 300);
		setTitle("Embedded Application");//Sets the title for this frame to the specified string.
		//public void setLayout(LayoutManager mgr)
		setLayout(null);
		//public void setVisible(boolean b)//Shows or hides this Window depending on the value of parameter b. 
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		awtBasics b1=new awtBasics();
	}

}
