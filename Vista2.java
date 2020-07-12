package Stuff;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Vista2 extends JFrame {

	private JPanel contentPane;
	private JTextField eliminar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista2 frame = new Vista2();
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
	public Vista2() {
		
		setTitle("Eliminando");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eliminar animal");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Old English Text MT", Font.BOLD, 34));
		lblNewLabel.setBounds(217, 35, 267, 59);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese la id del animal a eliminar:");
		lblNewLabel_1.setFont(new Font("NSimSun", Font.BOLD, 20));
		lblNewLabel_1.setBounds(25, 177, 363, 44);
		contentPane.add(lblNewLabel_1);
		
		eliminar = new JTextField();
		eliminar.setBounds(419, 189, 162, 20);
		contentPane.add(eliminar);
		eliminar.setColumns(10);
		
		JButton eliminar2 = new JButton("Eliminar animal");
		eliminar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Connection conn = DB.getConnection();
					int I= Integer.parseInt(eliminar.getText());
					String query ="delete from animales where idanimal="+I;
					 PreparedStatement pst = conn.prepareStatement(query);
				      pst.execute();
				      pst.close();
					JOptionPane.showMessageDialog(null, "Animal eliminado");
				}catch (SQLException ex) {
				ex.printStackTrace();
				
				}	
			}	
		});
		eliminar2.setForeground(Color.RED);
		eliminar2.setBounds(126, 299, 147, 68);
		contentPane.add(eliminar2);
		
		JButton menu2 = new JButton("Volver al menu");
		menu2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Menu frmZoo = new Menu();
				frmZoo.setvisible(true);
			}
		});
		menu2.setForeground(Color.BLUE);
		menu2.setBounds(434, 299, 147, 68);
		contentPane.add(menu2);
	}
}
