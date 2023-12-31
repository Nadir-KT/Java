package com.java.GUI.Swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Components2 {
	static JLabel l,usr,pwd;
	public static void main(String[] args) {
		// JPasswordField JCheckBox JRadioButton JComboBox 
		JFrame f=new JFrame("JFrame");//Constructs a new frame that is initially invisible. 
		
		usr=new JLabel("User Name");
		usr.setBounds(50, 75, 100, 20);
		f.add(usr);
		
		JTextField tf=new JTextField();
		tf.setBounds(150, 75, 100, 20);
		f.add(tf);
		
		pwd=new JLabel("Password");
		pwd.setBounds(50, 100, 100, 20);
		f.add(pwd);
		
		JPasswordField pf=new JPasswordField();
		pf.setBounds(150, 100, 100, 20);
		f.add(pf);
		
		JButton b=new JButton("Login");//Creates a button with text.
		b.setBounds(100, 130, 100, 30);
		f.add(b);
		
		l=new JLabel();
		l.setBounds(20, 170, 300, 20);//setBounds(int x, int y, int width, int height)
		f.add(l);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String usr=tf.getText();
				String pwd=new String(pf.getPassword());
				l.setText("User Name="+usr+",  Password="+pwd);
			}
		});
		
		String arr[]= {"USA","China","India","Russia"};
		JComboBox<String> cb=new JComboBox<String>(arr);
		cb.setBounds(20, 250, 300, 20);
		f.add(cb);
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
