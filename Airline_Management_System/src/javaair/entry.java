package javaair;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class entry extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					entry frame = new entry();
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
	public entry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 610);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel hlolbl = new JLabel("HELLO,WELCOME TO OUR AIRWAYS");
		hlolbl.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		hlolbl.setForeground(new Color(255, 102, 204));
		hlolbl.setBounds(228, 59, 374, 25);
		contentPane.add(hlolbl);
		
		JButton adminbtn = new JButton("ADMIN");
		adminbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				 try {
	                    new login();
			} catch (Exception e) {
	                    e.printStackTrace();
			} 
			}
		});
		adminbtn.setBounds(336, 225, 97, 25);
		contentPane.add(adminbtn);
		
		JButton customerbtn = new JButton("CUSTOMER");
		customerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				 
	                    try {
							new menu();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			
			}});
		customerbtn.setBounds(325, 327, 108, 25);
		contentPane.add(customerbtn);
		
		JLabel adminlbl = new JLabel("if you are admin");
		adminlbl.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		adminlbl.setBounds(336, 162, 108, 27);
		contentPane.add(adminlbl);
		
		JLabel customerlbl = new JLabel("customer login");
		customerlbl.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		customerlbl.setBounds(336, 289, 97, 16);
		contentPane.add(customerlbl);
		
		JLabel clicklbl = new JLabel("click here");
		clicklbl.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		clicklbl.setBounds(358, 196, 63, 16);
		contentPane.add(clicklbl);
		
		setVisible(true);
	}

}
