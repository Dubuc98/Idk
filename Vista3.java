package Stuff;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Vista3 extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	private JTextField nombre;
	private JTextField color;
	private JTextField peso;
	private JTextField altura;
	private JTextField tipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista3 frame = new Vista3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Vista3() {
		setTitle("Modificando");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modificar animal");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblNewLabel.setBounds(231, 24, 232, 33);
		contentPane.add(lblNewLabel);
		DefaultTableModel model = new DefaultTableModel();
		String[] columnNames = {"idanimal", "nombre", "color", "peso", "altura", "tipo"};
		model.setColumnIdentifiers(columnNames);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese la ID del animal a modificar:");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 83, 372, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nuevo Color:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(33, 178, 116, 19);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nuevo Nombre:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(33, 127, 116, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nuevo Peso:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(33, 222, 116, 23);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Nueva Altura:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(33, 264, 169, 23);
		contentPane.add(lblNewLabel_5);
		
		JButton modificar = new JButton("Modificar animal");
		modificar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		modificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Connection conn = DB.getConnection();
					 int I = Integer.parseInt(ID.getText());
					String query ="update animales set Nombre=?, Color= ?, Peso= ?, Altura=?,tipo=? WHERE idanimal="+I;
					 PreparedStatement pst = conn.prepareStatement(query);
					  pst.setString (1, nombre.getText());
				      pst.setString (2, color.getText());
				      Double P = Double.parseDouble(peso.getText());
				      pst.setDouble (3, P );
				      Double A = Double.parseDouble(altura.getText());
				      pst.setDouble (4, A);
				      pst.setString(5, tipo.getText());
				      pst.execute();
				      pst.close();
					JOptionPane.showMessageDialog(null, "Animal modificado");
				}catch (SQLException ex) {
				ex.printStackTrace();
				
				}
				
						
			}
			
		});
		modificar.setForeground(Color.CYAN);
		modificar.setBounds(525, 137, 176, 60);
		contentPane.add(modificar);
		
		JButton menu3 = new JButton("Volver al menu");
		menu3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		menu3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Menu frmZoo = new Menu();
				frmZoo.setvisible(true);
			}
		});
		menu3.setForeground(Color.BLUE);
		menu3.setBounds(525, 291, 176, 67);
		contentPane.add(menu3);
		
		ID = new JTextField();
		ID.setBounds(402, 86, 49, 25);
		contentPane.add(ID);
		ID.setColumns(10);
		
		nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setBounds(194, 130, 204, 20);
		contentPane.add(nombre);
		
		color = new JTextField();
		color.setColumns(10);
		color.setBounds(194, 179, 204, 20);
		contentPane.add(color);
		
		peso = new JTextField();
		peso.setColumns(10);
		peso.setBounds(194, 225, 204, 20);
		contentPane.add(peso);
		
		altura = new JTextField();
		altura.setColumns(10);
		altura.setBounds(194, 267, 204, 20);
		contentPane.add(altura);
		
		JLabel lblNewLabel_5_1 = new JLabel("Nuevo tipo:");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_1.setBounds(33, 313, 169, 23);
		contentPane.add(lblNewLabel_5_1);
		
		tipo = new JTextField();
		tipo.setColumns(10);
		tipo.setBounds(194, 316, 204, 20);
		contentPane.add(tipo);
	}
	}	

