package com.java.GUI.Swings;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("ToolTip");
		JLabel Label=new JLabel("Password");
		Label.setBounds(20, 100, 100, 30);//setBounds(int x, int y, int width, int height)
		JPasswordField pwfd=new JPasswordField();
		pwfd.setBounds(100, 100, 200, 30);//setBounds(int x, int y, int width, int height)
		pwfd.setToolTipText("Enter the Password");//Registers the text to display in a tool tip.The text displays when the cursor lingers over the component. 
		frame.add(pwfd);
		frame.add(Label);
		frame.add(Label);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
