package com.java.GUI.Swings;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPane {
	/*JOptionPane makes it easy to pop up a standard dialog box that prompts users for a value or informs them of something.
	 * Method()           : NameDescription
	 * showConfirmDialog(): Asks a confirming question, like yes/no/cancel.
	 * showInputDialog()  : Prompt for some input.
	 * showMessageDialog(): Tell the user about something that has happened. 
	 * showOptionDialog() : The Grand Unification of the above three. 
	 */
	public OptionPane() {
		// TODO Auto-generated constructor stub
		JFrame frame=new JFrame("JFrame");
		//showMessageDialog(Component parentComponent, Object message) throws HeadlessException
		JOptionPane.showMessageDialog(frame, "MessageDialog");//Brings up an information-message dialog titled "Message".
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OptionPane();
	}

}
