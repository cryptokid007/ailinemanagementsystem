package javaair;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Font;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField usernametxt;
	private JTextField passwordtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	public login() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 665, 429);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel username = new JLabel("username");
		username.setBounds(177, 99, 70, 16);
		contentPane.add(username);
		
		usernametxt = new JTextField();
		usernametxt.setBounds(274, 96, 116, 22);
		contentPane.add(usernametxt);
		usernametxt.setColumns(10);
		
		JLabel password = new JLabel("password");
		password.setBounds(177, 182, 70, 16);
		contentPane.add(password);
		
		JButton loginbtn = new JButton("login");
		loginbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try{
	                conn c1 = new conn();
	                
	                String username = usernametxt.getText();
	                String password = passwordtxt.getText();
	               
	            
	                String str = "select * from login where username = '"+username+"' and password = '"+password+"'";
	                ResultSet rs = c1.s.executeQuery(str);  
	                
	                if(rs.next()){
	                    new adminmenu();
	                    setVisible(false);
	                }else{
	                    JOptionPane.showMessageDialog(null,"Invalid Login");
	                    setVisible(false); 
	                }
	            
	            }catch(Exception e){}
	            
		}
	    
			
		});
		loginbtn.setBounds(331, 267, 97, 25);
		contentPane.add(loginbtn);
		
		JButton backbtn = new JButton("back");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				  try {
	                    new entry();
			} catch (Exception e) {
	                    e.printStackTrace();
			} 
			}
		});
		backbtn.setBounds(152, 267, 97, 25);
		contentPane.add(backbtn);
		
		passwordtxt = new JTextField();
		passwordtxt.setFont(new Font("Webdings", Font.PLAIN, 13));
		passwordtxt.setBounds(274, 182, 116, 22);
		contentPane.add(passwordtxt);
		passwordtxt.setColumns(10);
		
		  setVisible(true);     
	      setLocation(400,200);  
	}
}
