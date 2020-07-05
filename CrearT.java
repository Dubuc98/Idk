package zoo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CrearT extends JFrame {

	private JPanel contentPane;
	private JTextField Nombre;
	private JTextField Color;
	private JTextField Altura;
	private JTextField Peso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearT frame = new CrearT();
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
	public CrearT() {
		CrearV ins = new CrearV();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 431);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("A\u00F1adir animal Terrestre");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(164, 11, 286, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(59, 91, 94, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Color:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(59, 141, 73, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Altura:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(59, 191, 60, 24);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Peso:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(59, 249, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Ningun animal creado");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(195, 279, 160, 24);
		contentPane.add(lblNewLabel_5);	
		
		
		JButton btnNewButton = new JButton("Crear animal");
		btnNewButton.addActionListener(new ActionListener() {
			int b=0;
			public void actionPerformed(ActionEvent e) {
				try {
					Terrestre B[] = new Terrestre[10];
					for (int i = 0; i < B.length; i++) {
			            B[i] = new Terrestre();
			            }
					B[b].setname(Nombre.getText());
					B[b].setname(Color.getText());
					float F = Float.parseFloat(Altura.getText());
					B[b].setHeight(F);
					double D = Double.parseDouble(Peso.getText());
					B[b].setWeight(D);
					b++;
					ins.Animales.add(B[b]);
					ins.AnimalesT.add(B[b]);
					lblNewLabel_5.setText(b +" Animal creado");
					
				}catch(Exception e1) {
					 
				}
			}
		});
		btnNewButton.setBounds(83, 320, 120, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Volver al menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UI fmrZoo = new UI();
				fmrZoo.setvisible(true);
			
			}
		});
		btnNewButton_1.setBounds(380, 320, 113, 23);
		contentPane.add(btnNewButton_1);
		
		Nombre = new JTextField();
		Nombre.setBounds(155, 95, 295, 20);
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		Color = new JTextField();
		Color.setBounds(155, 145, 295, 20);
		contentPane.add(Color);
		Color.setColumns(10);
		
		Altura = new JTextField();
		Altura.setBounds(155, 195, 295, 20);
		contentPane.add(Altura);
		Altura.setColumns(10);
		
		Peso = new JTextField();
		Peso.setBounds(155, 248, 295, 20);
		contentPane.add(Peso);
		Peso.setColumns(10);
		
	}

}
