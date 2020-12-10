package javaair;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class add_customer extends JFrame {

	private JPanel contentPane;
	private JTextField passport_no_txt;
	private JTextField f_name_txt;
	private JTextField l_name_txt;
	private JTextField address_txt;
	private JTextField phone_no_txt;
	private JTextField age_txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					add_customer frame = new add_customer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public add_customer() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 953, 644);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 204));
		panel.setBounds(12, 86, 630, 478);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel passport_no = new JLabel("passport_no");
		passport_no.setBounds(12, 57, 90, 16);
		panel.add(passport_no);
		
		JLabel f_name = new JLabel("f_name");
		f_name.setBounds(12, 103, 56, 16);
		panel.add(f_name);
		
		JLabel l_name = new JLabel("l_name");
		l_name.setBounds(12, 157, 56, 16);
		panel.add(l_name);
		
		JLabel address = new JLabel("address");
		address.setBounds(12, 209, 56, 16);
		panel.add(address);
		
		JLabel phone_no = new JLabel("phone_no");
		phone_no.setBounds(12, 260, 56, 16);
		panel.add(phone_no);
		
		JLabel age = new JLabel("age");
		age.setBounds(12, 307, 56, 16);
		panel.add(age);
		
		JLabel gender = new JLabel("gender");
		gender.setBounds(12, 364, 56, 16);
		panel.add(gender);
		
		passport_no_txt = new JTextField();
		passport_no_txt.setBounds(114, 54, 116, 22);
		panel.add(passport_no_txt);
		passport_no_txt.setColumns(10);
		
		f_name_txt = new JTextField();
		f_name_txt.setBounds(114, 100, 116, 22);
		panel.add(f_name_txt);
		f_name_txt.setColumns(10);
		
		l_name_txt = new JTextField();
		l_name_txt.setBounds(114, 154, 116, 22);
		panel.add(l_name_txt);
		l_name_txt.setColumns(10);
		
		address_txt = new JTextField();
		address_txt.setBounds(114, 206, 116, 22);
		panel.add(address_txt);
		address_txt.setColumns(10);
		
		phone_no_txt = new JTextField();
		phone_no_txt.setBounds(114, 257, 116, 22);
		panel.add(phone_no_txt);
		phone_no_txt.setColumns(10);
		
		age_txt = new JTextField();
		age_txt.setBounds(114, 304, 116, 22);
		panel.add(age_txt);
		age_txt.setColumns(10);
		
		final JRadioButton malebtn = new JRadioButton("male");
		malebtn.setBounds(119, 360, 66, 25);
		panel.add(malebtn);
		
		final JRadioButton femalebtn = new JRadioButton("female");
		femalebtn.setBounds(189, 360, 67, 25);
		panel.add(femalebtn);
		
		JButton btnNewButton = new JButton("save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				 String passport_no = passport_no_txt.getText();
                 String l_name =  l_name_txt.getText();
                 String address = address_txt.getText();
                 String phone_no = phone_no_txt.getText();
                 String  f_name = f_name_txt.getText();
                 String gender = null;
                 String age = age_txt.getText();
                 
                 if(malebtn.isSelected()){
                     gender = "m";
                 
                 }else if(femalebtn.isSelected()){
                     gender = "f";
                 }
                 
                 try {
                     conn c = new conn();
                     String str = "INSERT INTO passenger2 values('"+passport_no+"','"+f_name+"','"+l_name+"','"+address+"', '"+phone_no+"', '"+age+"','"+gender+"')";
                     
                     c.s.executeUpdate(str);
                     JOptionPane.showMessageDialog(null,"Customer Added");
                     setVisible(true);
                 
                 } catch (Exception e) {
                     e.printStackTrace();
     	    }
			}
		});
		
		 setSize(900,600);
         setVisible(true);
         setLocation(400,200);
         
		btnNewButton.setBounds(393, 406, 97, 25);
		panel.add(btnNewButton);
		
		JLabel add_customer_details = new JLabel("ADD CUSTOMER DETAILS");
		add_customer_details.setForeground(new Color(102, 153, 0));
		add_customer_details.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		add_customer_details.setBounds(391, 32, 263, 41);
		contentPane.add(add_customer_details);
	}
}
