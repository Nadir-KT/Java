package com.java.GUI.Swings;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table {
	
	public static void main(String[] args) {
		// JTable JList JOptionPane
		JFrame frame=new JFrame("JFrame");
		
		String head[]= {"ID","Name","Rank"};
		String s1[][]= {{"#12","Micky","SniperGhost"},
						{"#07","Issac","Engineer"},
						{"#04","Britas","Cadet"},
						{"#01","Bruce","Commander"},
						{"#05","Shaan","WingMan"}};
		JTable table=new JTable(s1,head);//JTable(Object[][] rowData, Object[] columnNames)
		table.setBounds(30, 50, 300, 200);
		JScrollPane sp=new JScrollPane(table);//Creates a JScrollPane that displays the contents of the specified component, where both horizontal and vertical scrollbars appear whenever the component's contents are larger than the view.
		frame.add(sp);
		
		DefaultListModel<String> dlm=new DefaultListModel<String>();
		dlm.addElement("SniperGhost");
		dlm.addElement("Engineer");
		dlm.addElement("Cadet");
		dlm.addElement("Commander");
		dlm.addElement("WingMan");
		JList<String> jl=new JList<String>(dlm);
		frame.add(jl);
		
		frame.setSize(400, 400);
		//frame.setLayout(null);
		frame.setVisible(true);
	}

}
