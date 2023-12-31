package com.java.GUI.AWT;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Popup implements MouseListener {
	Frame f;
	PopupMenu pMenu;
	public Popup() {
		f=new Frame("PopupMenu, Panel & Dialog");
		
		pMenu=new PopupMenu("Click");//PopupMenu
		MenuItem m1=new MenuItem("Edit");
		m1.setActionCommand("Edit");//Sets the command name of the action event that is fired by this menu item.
		MenuItem m2=new MenuItem("Cut");
		m2.setActionCommand("Cut");
		MenuItem m3=new MenuItem("Copy");
		m3.setActionCommand("Copy");
		MenuItem m4=new MenuItem("Paste");
		m4.setActionCommand("Paste");
		pMenu.add(m1);//Adds the specified menu item to this menu.
		pMenu.add(m2);
		pMenu.add(m3);
		pMenu.add(m4);
		f.add(pMenu);//Adds the specified popup menu to the component.
		f.addMouseListener(this);//Adds the specified mouse listener to receive mouse events from this component.
		
		Panel p=new Panel();
		p.setBounds(40, 80, 200, 200);
		p.setBackground(Color.gray);//Sets the background color of this component. 
		Button b1=new Button("Save");//Constructs a button with the specified label.
		b1.setBounds(50, 100, 50, 50);
		b1.setBackground(Color.green);
		Button b2=new Button("Cancel");
		b2.setBounds(50, 100, 50, 50);
		b2.setBackground(Color.red);
		p.add(b1);
		p.add(b2);
		f.add(p);
		
		f.setSize(400, 400);//Resizes this component so that it has width width and height height
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Popup();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		pMenu.show(f, e.getX(), e.getY());//Shows the popup menu at the x, y position of the event relative to the source component.
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
