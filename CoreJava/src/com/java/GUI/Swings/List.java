package com.java.GUI.Swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class List implements ActionListener {
	JList<String> jl1;
	JList<String> jl2;
	JLabel lb;
	public List() {
		JFrame frame=new JFrame("JFrame");
		
		DefaultListModel<String> dlm1=new DefaultListModel<String>();
		dlm1.addElement("SniperGhost");
		dlm1.addElement("Engineer");
		dlm1.addElement("Cadet");
		dlm1.addElement("Commander");
		dlm1.addElement("WingMan");
		jl1=new JList<String>(dlm1);
		jl1.setBounds(100, 50, 50, 50);
		frame.add(jl1);
		
		DefaultListModel<String> dlm2=new DefaultListModel<String>();
		dlm2.addElement("Electrical");
		dlm2.addElement("Mechanical");
		dlm2.addElement("Civil");
		dlm2.addElement("Chemical");
		dlm2.addElement("Mechatronics");
		jl2=new JList<String>(dlm2);
		jl2.setBounds(100, 150, 50, 50);
		frame.add(jl2);
		
		JButton jb=new JButton("Select");
		jb.setBounds(200, 150, 150, 50);
		frame.add(jb);
		
		lb=new JLabel("JLabel");
		lb.setBounds(100, 350, 100, 50);
		frame.add(lb);
		
		jb.addActionListener(this);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLayout(null);
	}
	public static void main(String[] args) {
		// JList
		new List();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String var="";
		var=jl1.getSelectedValue();
		var+=jl2.getSelectedValue();
		lb.setText(var);
	}

}
