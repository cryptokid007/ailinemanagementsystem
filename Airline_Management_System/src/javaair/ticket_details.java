package javaair;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class ticket_details extends JFrame {

	private JPanel contentPane;
	private JTextField f_name_txt;
	private JTextField l_name_txt;
	private JTextField ticket_no_txt;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticket_details frame = new ticket_details();
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
	public ticket_details() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 713, 583);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 153, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel ticket_details = new JLabel("TICKET DETAILS");
		ticket_details.setForeground(new Color(0, 102, 102));
		ticket_details.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		ticket_details.setBounds(354, 25, 173, 35);
		contentPane.add(ticket_details);
		
		JLabel f_name = new JLabel("f_name");
		f_name.setBounds(46, 117, 49, 23);
		contentPane.add(f_name);
		
		f_name_txt = new JTextField();
		f_name_txt.setBounds(107, 117, 116, 22);
		contentPane.add(f_name_txt);
		f_name_txt.setColumns(10);
		
		JLabel l_name = new JLabel("l_name");
		l_name.setBounds(46, 167, 56, 16);
		contentPane.add(l_name);
		
		l_name_txt = new JTextField();
		l_name_txt.setBounds(107, 164, 116, 22);
		contentPane.add(l_name_txt);
		l_name_txt.setColumns(10);
		
		JLabel ticket_no = new JLabel("ticket number");
		ticket_no.setBounds(309, 145, 86, 16);
		contentPane.add(ticket_no);
		
		ticket_no_txt = new JTextField();
		ticket_no_txt.setBounds(407, 142, 116, 22);
		contentPane.add(ticket_no_txt);
		ticket_no_txt.setColumns(10);
		
		JButton searchbtn = new JButton("search");
		searchbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try{
					String f_name=f_name_txt.getText();
					String l_name=l_name_txt.getText();
					String ticket_number=ticket_no_txt.getText();
                    
                    conn c = new conn();
                    
                    String str = "select passport_no,f_name,l_name,ticket_number,date_of_booking,source,destination,date_of_travel,seatno from passenger2 natural inner join ticket1 where ticket_number='"+ticket_number+"' and f_name='"+f_name+"' and l_name='"+l_name+"'";
                    ResultSet rs=c.s.executeQuery(str);
	                
	                	 table.setModel(DbUtils.resultSetToTableModel(rs));
	                            
	                            
	            }catch(Exception e){}
	            
                 
            }
	});
		searchbtn.setBounds(677, 198, 97, 25);
		contentPane.add(searchbtn);
		
		table = new JTable();
		table.setForeground(new Color(255, 204, 51));
		table.setBackground(new Color(204, 204, 255));
		table.setBounds(12, 268, 671, 228);
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(12, 268, 974, 264);
		contentPane.add(scrollPane);
		
		 setSize(1103,698);
         setVisible(true);
         setLocation(400,200);
	}

}
	              