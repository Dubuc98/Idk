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
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class vista1 extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField color_1;
	private JTextField altura;
	private JTextField peso_1;
	private JTextField tipo_1;
	
	private JTextField Idanimal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vista1 frame = new vista1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public vista1() {
		
		
		setTitle("A\u00F1adiendo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 643, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setForeground(Color.BLACK);
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 623, 475);
		contentPane.add(contentPane_1);
		
		JLabel lblAadirUnAnimal = new JLabel("A\u00F1adir un animal");
		lblAadirUnAnimal.setForeground(Color.BLUE);
		lblAadirUnAnimal.setFont(new Font("Stencil", Font.BOLD, 25));
		lblAadirUnAnimal.setBounds(185, 11, 254, 52);
		contentPane_1.add(lblAadirUnAnimal);
		
		JLabel Nombre = new JLabel("Nombre:");
		Nombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		Nombre.setBounds(59, 91, 94, 24);
		contentPane_1.add(Nombre);
		
		JLabel color = new JLabel("Color:");
		color.setFont(new Font("Tahoma", Font.BOLD, 15));
		color.setBounds(59, 141, 73, 24);
		contentPane_1.add(color);
		
		JLabel Altura = new JLabel("Altura en mts:");
		Altura.setFont(new Font("Tahoma", Font.BOLD, 15));
		Altura.setBounds(59, 191, 104, 29);
		contentPane_1.add(Altura);
		
		JLabel peso = new JLabel("Peso en kg:");
		peso.setFont(new Font("Tahoma", Font.BOLD, 15));
		peso.setBounds(59, 249, 94, 19);
		contentPane_1.add(peso);
		
		nombre = new JTextField();
		nombre.setColumns(10);
		nombre.setBounds(205, 95, 209, 20);
		contentPane_1.add(nombre);
		
		color_1 = new JTextField();
		color_1.setColumns(10);
		color_1.setBounds(205, 145, 209, 20);
		contentPane_1.add(color_1);
		
		altura = new JTextField();
		altura.setColumns(10);
		altura.setBounds(205, 195, 209, 20);
		contentPane_1.add(altura);
		
		peso_1 = new JTextField();
		peso_1.setColumns(10);
		peso_1.setBounds(205, 248, 209, 20);
		contentPane_1.add(peso_1);
		
		JButton Anadir = new JButton("A\u00F1adir animal");
		Anadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				try{
					Connection conn = DB.getConnection();
					String query ="INSERT INTO animales (Idanimal, Nombre, Color, Peso, Altura, Tipo)"
							+"VALUES (?, ?, ?, ?, ?, ?)";
					 PreparedStatement pst = conn.prepareStatement(query);
					  int I = Integer.parseInt(Idanimal.getText());
				      pst.setInt (6, I);
				      pst.setString (1, nombre.getText());
				      pst.setString (2, color_1.getText());
				      Double P = Double.parseDouble(peso_1.getText());
				      pst.setDouble (3, P );
				      Double A = Double.parseDouble(altura.getText());
				      pst.setDouble (4, A);
				      pst.setString(5, tipo_1.getText());
				      pst.execute();
				      pst.close();
					JOptionPane.showMessageDialog(null, "Animal añadido");
				}catch (SQLException ex) {
				ex.printStackTrace();
				
				}	
			}
		
		});
		Anadir.setForeground(Color.GREEN);
		Anadir.setBounds(60, 421, 136, 23);
		contentPane_1.add(Anadir);
		
		JButton menu1 = new JButton("Volver al menu");
		menu1.setForeground(Color.BLUE);
		menu1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Menu frmZoo = new Menu();
				frmZoo.setvisible(true);
			}
		});
		menu1.setBounds(427, 421, 136, 23);
		contentPane_1.add(menu1);
		
		JLabel tipo = new JLabel("Tipo de animal:");
		tipo.setFont(new Font("Tahoma", Font.BOLD, 15));
		tipo.setBounds(59, 302, 120, 19);
		contentPane_1.add(tipo);
		
		tipo_1 = new JTextField();
		tipo_1.setColumns(10);
		tipo_1.setBounds(205, 303, 209, 20);
		contentPane_1.add(tipo_1);
		
		JLabel lblNewLabel_6 = new JLabel("(Volador, Terrestre, Acuatico)");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_6.setBounds(420, 298, 193, 29);
		contentPane_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("(Leon, Mono, etc..)");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_7.setBounds(424, 90, 139, 29);
		contentPane_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel = new JLabel("IDanimal:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(59, 354, 120, 29);
		contentPane_1.add(lblNewLabel);
		
		Idanimal = new JTextField();
		Idanimal.setBounds(206, 358, 209, 20);
		contentPane_1.add(Idanimal);
		Idanimal.setColumns(10);
		
		}
}
