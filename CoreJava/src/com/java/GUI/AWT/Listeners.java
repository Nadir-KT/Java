package com.java.GUI.AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Listeners implements MouseMotionListener, KeyListener, WindowListener {
	Frame f;
	Label l;
	TextArea t;
	public Listeners( ) {
		f=new Frame("MouseMotion KeyListner WindowListner");
		
		f.addMouseMotionListener(this);
		
		l=new Label();
		l.setBounds(20, 50, 100, 25);
		t=new TextArea();//TextField: Single Line, TextArea: Multiple Lines
		t.setBounds(25, 80, 200, 100);
		t.addKeyListener(this);//Adds the specified key listener to receive key events from this component.
		f.add(l);
		f.add(t);
		
		f.addWindowListener(this);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Listeners();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g=f.getGraphics();
		g.setColor(Color.green);
		g.fillOval(e.getX(), e.getY(), 15, 15);//fillOval(int x, int y, int width, int height)
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouseMoved");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		l.setText("Typing");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		l.setText("Pressing");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		l.setText("Idle");
	}
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		f.dispose();
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}
}