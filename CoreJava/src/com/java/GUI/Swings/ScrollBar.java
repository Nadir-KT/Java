package com.java.GUI.Swings;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
//JScrollBar JMenuItem JPopupMenu
public class ScrollBar implements ActionListener {
	JDialog diag;
	public ScrollBar() {
		JFrame frame=new JFrame();
		//JScrollBar//Creates a vertical ScrollBar
		JScrollBar sb=new JScrollBar(); 
		sb.setBounds(100, 100, 50, 80);
		frame.add(sb);
		//JSpinner//Constructs a spinner for the given model. The spinner has a set of previous/next buttons, and an editor appropriate for the model.
		SpinnerNumberModel model=new SpinnerNumberModel(5, 0, 15, 1);//SpinnerNumberModel(int value, int minimum, int maximum, int stepSize)
		JSpinner spinner=new JSpinner(model);
		spinner.setBounds(100, 200, 50, 50);
		frame.add(spinner);
		//JDialog(Frame owner, String title, boolean modal)
		diag=new JDialog(frame, "Dialog Title", true);
		//diag.setLayout(new FlowLayout());
		//diag.setVisible(true);
		JButton button=new JButton("Click Here");
		button.setBounds(50, 270, 100, 50);
		button.addActionListener(this);
		frame.add(button);
		
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new ScrollBar();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		diag.setVisible(true);
	}
}
