package javaair;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cancel_ticket extends JFrame {

	private JPanel contentPane;
	private JTextField ticket_no_txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cancel_ticket frame = new cancel_ticket();
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
	public cancel_ticket() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 694, 475);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel cancel_ticket = new JLabel("CANCEL TICKET");
		cancel_ticket.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cancel_ticket.setForeground(new Color(204, 255, 102));
		cancel_ticket.setBounds(254, 34, 151, 29);
		contentPane.add(cancel_ticket);
		
		JLabel ticket_no_lbl = new JLabel("ticket_number");
		ticket_no_lbl.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		ticket_no_lbl.setBounds(67, 136, 101, 16);
		contentPane.add(ticket_no_lbl);
		
		ticket_no_txt = new JTextField();
		ticket_no_txt.setBounds(231, 134, 116, 22);
		contentPane.add(ticket_no_txt);
		ticket_no_txt.setColumns(10);
		
		JButton cancel_btn = new JButton("cancel ticket");
		cancel_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			String ticket_no=ticket_no_txt.getText();
			 try {
                 conn c = new conn();
                 String str = "delete from ticket1 where ticket_number='"+ticket_no+"'";
                 
                 c.s.executeUpdate(str);
                 JOptionPane.showMessageDialog(null,"ticket cancelled");
                 setVisible(false);
             
             } catch (Exception e) {
                 e.printStackTrace();
 	    }
			}
		});
		cancel_btn.setBounds(431, 257, 151, 25);
		contentPane.add(cancel_btn);
		setVisible(true);
		
	}

}
