package com.java.GUI.AWT;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Scrollbar;

public class Canva {
	public Canva() {
		Frame f=new Frame("Canvas");
		MenuBar mb=new MenuBar();
		Menu m1=new Menu("File");
		MenuItem mt1=new MenuItem("Open");
		MenuItem mt2=new MenuItem("Save");
		MenuItem mt3=new MenuItem("New");
		MenuItem mt4=new MenuItem("Undo");
		MenuItem mt5=new MenuItem("Save As");
		Menu sub1=new Menu("Zoom");
		MenuItem mt6=new MenuItem("Zoom In");
		MenuItem mt7=new MenuItem("Zoom Out");
		mb.add(m1);
		m1.add(mt1);
		m1.add(mt2);
		m1.add(mt3);
		m1.add(mt4);
		m1.add(mt5);
		m1.add(sub1);
		sub1.add(mt6);
		sub1.add(mt7);
		Canvas c=new MyCanv();
		Scrollbar s=new Scrollbar();
		s.setBounds(100, 100, 125, 125);
		f.setMenuBar(mb);//MenuBar, Menu & MenuItem
		f.add(c);//Canvas: Rectangular Area
		f.add(s);//ScrollBar
		f.setSize(600, 600);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Canva();
	}
}
class MyCanv extends Canvas {
	MyCanv(){
		setBackground(Color.blue);
		setSize(200, 300);
		setBounds(100, 300, 300, 200);
	}
	public void paint(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(75, 75, 150, 100);
	}
}