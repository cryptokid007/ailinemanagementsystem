package javaair;

import java.awt.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;


public class flight_info extends JFrame {

	private JPanel contentPane;
	private JTextField flight_info_txt;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					flight_info frame = new flight_info();
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
	public flight_info() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 771, 635);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JLabel flight_info = new JLabel("FLIGHT_INFO");
		flight_info.setForeground(new Color(255, 204, 102));
		flight_info.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		flight_info.setBounds(321, 29, 152, 35);
		contentPane.add(flight_info);
		
		JLabel flight_code = new JLabel("FLIGHT_CODE");
		flight_code.setForeground(new Color(255, 153, 153));
		flight_code.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		flight_code.setBounds(33, 120, 152, 23);
		contentPane.add(flight_code);
		
		
		JButton searchbtn = new JButton("Search");
		searchbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
                
                try {
                	String code = flight_info_txt.getText();
                    conn c = new conn();
                    String str = "select flight_code,source,destination,arrival,departure,flighttype,airline_id,seating_capacity from flight where flight_code = '"+code+"'";
      
                    ResultSet rs = c.s.executeQuery(str);
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                   
                }catch(SQLException e) {  }
			}
		});  
                    
              
		 setSize(917,700);
         setVisible(true);
         setLocation(400,200);
         
		searchbtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		searchbtn.setBounds(480, 178, 97, 25);
		contentPane.add(searchbtn);
        
		flight_info_txt = new JTextField();
		flight_info_txt.setBounds(209, 122, 190, 22);
		contentPane.add(flight_info_txt);
		flight_info_txt.setColumns(10);
		
		table = new JTable();
		table.setBackground(new Color(255, 204, 255));
		table.setBounds(23, 250, 800, 300);
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(23, 250, 800, 300);
		contentPane.add(scrollPane);

		
		
	}
}
