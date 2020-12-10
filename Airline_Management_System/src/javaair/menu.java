package javaair;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import airlinemanagementsystem.book_ticket;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class menu extends JFrame {

	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public menu() throws IOException {
		 super("AIRLINE MANAGEMENT SYSTEM");
		 setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\kosgi\\Desktop\\i2.png"));
	       
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 671);
		
		ImageIcon image=new ImageIcon("logo.png");
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu customer = new JMenu("customer");
		menuBar.add(customer);
		
		JMenuItem add_customer = new JMenuItem("add customer");
		add_customer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
                    new add_customer();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
			}
		});
		customer.add(add_customer);
		
		JMenuItem view_customer_details = new JMenuItem("view customer details");
		view_customer_details.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
                    new view_customer_details();
		} catch (Exception e) {
                    e.printStackTrace();
		} 
			}
		});
		customer.add(view_customer_details);
		
		JMenu flight = new JMenu("flight");
		menuBar.add(flight);
		
		JMenuItem flight_info = new JMenuItem("flight info");
		flight_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new flight_info();
			}
		});
		
		JMenuItem flight_src_destination = new JMenuItem("flight src_destination");
		flight_src_destination.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				 try {
	                    new flight_src_destination();
	                } catch (Exception e) {
	                    e.printStackTrace();
			}
	            }
			}
		);
		flight.add(flight_src_destination);
		flight.add(flight_info);
		
		JMenu ticket = new JMenu("ticket");
		menuBar.add(ticket);
		
		JMenuItem ticket_details = new JMenuItem("ticket details");
		ticket_details.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				 try {
	                    new ticket_details();
	                } catch (Exception e) {
	                    e.printStackTrace();
			}
			}
		});
		ticket.add(ticket_details);
		
		JMenuItem book_ticket = new JMenuItem("book ticket");
		book_ticket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			    try {
                    new book_ticket();
                } catch (Exception e) {
                    e.printStackTrace();
		}
			}
		});
		ticket.add(book_ticket);
		
		JMenuItem cancel_ticket = new JMenuItem("cancel ticket");
		cancel_ticket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			    try {
                    new cancel_ticket();
                } catch (Exception e) {
                    e.printStackTrace();
		}
			}
		});
		ticket.add(cancel_ticket);
		

	

		
		contentPane = new JPanel();
		contentPane.setForeground(Color.ORANGE);
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1340, 649);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\kosgi\\Desktop\\i2.png"));
		lblNewLabel.setBounds(0, 48, 1173, 601);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 102));
		panel_1.setBounds(0, 0, 1173, 46);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO AIRWAYS");
		lblNewLabel_1.setForeground(new Color(102, 153, 204));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel_1.setBounds(431, 13, 254, 33);
		panel_1.add(lblNewLabel_1);
	
		
	
		
		 setSize(1191,722);
		 setVisible(true);
	}
}
