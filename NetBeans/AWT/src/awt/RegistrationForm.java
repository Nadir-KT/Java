package awt;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends Frame implements ActionListener {
	Label lblTitle,lblName,lblFather,lblAge,lblGender,lblCourse,lblHobbies,lblAddress,lblPhone,lblPlace;
	TextField txtName,txtFather,txtAge,txtPhone,txtPlace;
	TextArea txtAddress, display_details;
	Checkbox checkMale, checkFemale,Hobbies1,Hobbies2,Hobbies3,Hobbies4;
	CheckboxGroup cbg;
	Choice Course;
	Button btnSave,btnClear;
	public RegistrationForm() {
		super("User Registration Form");
		setSize(600, 600);// w,h
		setLayout(null);
		setVisible(true);
		Color formColor = new Color(53, 59, 72);
		setBackground(formColor);
 
		Font titleFont = new Font("arial", Font.BOLD, 25);
		Font labelFont =new  Font("arial", Font.PLAIN, 18);
		Font textFont =new  Font("arial", Font.PLAIN, 15);
		
		lblTitle=new Label("Registration Form"); 
		lblTitle.setBounds(20, 40,300,50);
		lblTitle.setFont(titleFont); lblTitle.setForeground(Color.YELLOW);
		add(lblTitle);
 
		lblName=new Label("FirstName : ");  
		lblName.setBounds(20, 110, 100, 20);//setBounds(int x, int y, int width, int height)
		lblName.setFont(labelFont);  
		lblName.setForeground(Color.WHITE);
		add(lblName);
 
		txtName=new TextField();
		txtName.setBounds(140, 110, 150, 20);
		txtName.setFont(textFont);
		add(txtName);
 
		lblFather=new Label("Last-Name : ");  
		lblFather.setBounds(310, 110, 100, 20);
		lblFather.setFont(labelFont); 
		lblFather.setForeground(Color.WHITE);
		add(lblFather);
 
		txtFather=new TextField();
		txtFather.setBounds(420, 110, 150, 20);
		txtFather.setFont(textFont);
		add(txtFather);
 
		lblAge=new Label("Date Of Birth : ");  
		lblAge.setBounds(20, 150, 120, 20);
		lblAge.setFont(labelFont);
		lblAge.setForeground(Color.WHITE);
		add(lblAge);
 
		txtAge=new TextField();
		txtAge.setBounds(140, 150, 150, 20);
		txtAge.setFont(textFont);
		add(txtAge);
 
		lblGender=new Label("Gender");  
		lblGender.setBounds(310, 150, 80, 20);
		lblGender.setFont(labelFont);
		lblGender.setForeground(Color.WHITE);
		add(lblGender);
 
		cbg = new CheckboxGroup();
 
		checkMale = new Checkbox("Male",cbg,true);
		checkMale.setBounds(390, 150, 60, 20);
		checkMale.setFont(labelFont);
		checkMale.setForeground(Color.WHITE);
		add(checkMale);
 
		checkFemale = new Checkbox("Female",cbg,false);
		checkFemale.setBounds(460, 150, 80, 20);
		checkFemale.setFont(labelFont);
		checkFemale.setForeground(Color.WHITE);
		add(checkFemale);
		
		lblPlace=new Label("Place : ");  
		lblPlace.setBounds(20, 190, 100, 20);
		lblPlace.setFont(labelFont);  
		lblPlace.setForeground(Color.WHITE);
		add(lblPlace);
 
		txtPlace=new TextField();
		txtPlace.setBounds(140, 190, 150, 20);
		txtPlace.setFont(textFont);
		add(txtPlace);
 
		lblPhone=new Label("Phone : ");  
		lblPhone.setBounds(310, 190, 100, 20);
		lblPhone.setFont(labelFont); 
		lblPhone.setForeground(Color.WHITE);
		add(lblPhone);
 
		txtPhone=new TextField();
		txtPhone.setBounds(420, 190, 150, 20);
		txtPhone.setFont(textFont);
		add(txtPhone);
		
		lblAddress=new Label("Address : ");  
		lblAddress.setBounds(20, 230, 120, 20);
		lblAddress.setFont(labelFont);
		lblAddress.setForeground(Color.WHITE);
		add(lblAddress);
 
		txtAddress=new TextArea("", 2 , 100 , TextArea.SCROLLBARS_NONE);
		txtAddress.setBounds(140, 230, 380, 70);
		txtAddress.setFont(labelFont);
		add(txtAddress);
 
		lblCourse=new Label("Language : ");  
		lblCourse.setBounds(20,320,120,30);
		lblCourse.setFont(labelFont);
		lblCourse.setForeground(Color.WHITE);
		add(lblCourse);
 
		Course= new Choice();
		Course.setFont(labelFont);
		Course.setBounds(140, 320, 400, 50);
		Course.add("C");
		Course.add("C++");
		Course.add("Java");
		Course.add("C#");
		Course.add("Python");
		add(Course);
 
		lblHobbies=new Label("Skills : ");  
		lblHobbies.setBounds(20,360,120,20);
		lblHobbies.setFont(labelFont);
		lblHobbies.setForeground(Color.WHITE);
		add(lblHobbies);
 
		Hobbies1=new Checkbox("Logic");
		Hobbies1.setBounds(140, 360, 100, 20);
		Hobbies1.setFont(labelFont);
		Hobbies1.setForeground(Color.WHITE);
		add(Hobbies1);
 
		Hobbies2=new Checkbox("Quick");
		Hobbies2.setBounds(240, 360, 100, 20);
		Hobbies2.setFont(labelFont);
		Hobbies2.setForeground(Color.WHITE);
		add(Hobbies2);
 
		Hobbies3=new Checkbox("Self");
		Hobbies3.setBounds(340, 360, 100, 20);
		Hobbies3.setFont(labelFont);
		Hobbies3.setForeground(Color.WHITE);
		add(Hobbies3);
 
		Hobbies4=new Checkbox("Others");
		Hobbies4.setBounds(440, 360, 100, 20);
		Hobbies4.setFont(labelFont);
		Hobbies4.setForeground(Color.WHITE);
		add(Hobbies4);

		btnSave=new Button("Submit");
		btnSave.setBounds(20,400,150,30);
		btnSave.setFont(labelFont);
		btnSave.setBackground(Color.BLUE);
		btnSave.setForeground(Color.WHITE);
		add(btnSave);
 
		btnClear=new Button("Clear All");
		btnClear.setBounds(430,400,150,30);
		btnClear.setFont(labelFont);
		btnClear.setBackground(Color.RED);
		btnClear.setForeground(Color.WHITE);
		add(btnClear);
		
		display_details = new TextArea("", 2 , 100 , TextArea.SCROLLBARS_NONE);
		display_details.setEditable(false);
		display_details.setBounds(20, 450, 560, 130);//setBounds(int x, int y, int width, int height)
		add(display_details);
		
		btnSave.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
		{  
            public void windowClosing(WindowEvent e)
            {  
                dispose();  
            }  
        });
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegistrationForm frm = new RegistrationForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnSave)
		{
			String sk = Hobbies1.getState() ? "Intelligent Human" : "No Logic";

			String sdetails = " ***** Registration Details *****\n Name : " + txtName.getText() + "\n Phone No. :" + txtPhone.getText() + "\n Language : " + Course.getSelectedItem() + "\n Gender : " + cbg.getSelectedCheckbox().getLabel() + "\n Age : " + txtAge.getText() + "\n Skills : " + sk + "\n Address : " + txtAddress.getText();

			display_details.setText(sdetails);
		}
	}

}