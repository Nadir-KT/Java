package Notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Notepad extends JFrame implements ActionListener {
	JMenuItem MenuItem;
	JMenu Menu;
	JTextArea TextArea;
	public Notepad() {
		MenuItem=new JMenuItem("Open File");
		MenuItem.addActionListener((ActionListener)this);
		
		Menu=new JMenu("File");
		Menu.add(MenuItem);
		
		JMenuBar MenuBar=new JMenuBar();
		MenuBar.setBounds(0, 0, 800, 20);
		MenuBar.add(Menu);
		
		TextArea=new JTextArea(800, 800);
		TextArea.setBounds(0, 20, 800, 800);
		
		add(MenuBar);
		add(TextArea);
	}
	
	public static void main(String[] args) {
		Notepad fc=new Notepad();
		fc.setSize(500, 500);//setSize(WIDTH, HEIGHT)
		fc.setLayout(null);
		fc.setVisible(true);
		fc.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==MenuItem);//The object on which the Event initially occurred.
		{   //JFileChooser provides a simple mechanism for the user to choose a file.
			JFileChooser Chooser=new JFileChooser();
			int i=Chooser.showOpenDialog(this);//Pops up an "Open File" file chooser dialog.
			if(i==JFileChooser.APPROVE_OPTION) {
				File f=Chooser.getSelectedFile();//Returns the selected file.. 
				String filePath=f.getPath();//Converts this abstract pathname into a pathname string.
				try {
					BufferedReader Buffer=new BufferedReader(new FileReader(filePath));//file to read from
					String s1="",s2="";
					while((s1=Buffer.readLine())!=null) {
						s2+=s1+"\n";
					}
					TextArea.setText(s2);
					Buffer.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

}
