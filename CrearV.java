package zoo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CrearV extends JFrame {
	private JPanel contentPane;
	private JTextField Nombre;
	private JTextField Color;
	private JTextField Altura;
	private JTextField Peso;
	public ArrayList <Object> AnimalesT = new ArrayList<>();
	public ArrayList <Object> AnimalesV = new ArrayList<>();
	public ArrayList <Object> Animales = new ArrayList<>();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CrearV frame = new CrearV();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 * @param string 
	 */
	public CrearV() {
		Terrestre A1 = new Terrestre(190.0,(float) 1.2, "Leon", "Marron");
		Terrestre A2 = new Terrestre(300.0, (float)1.5, "Oso Pardo", "Marron");
		Terrestre A3 = new Terrestre(730.0, (float)4.2, "Jirafa", "Amarillo");
		Terrestre A4 = new Terrestre(300.0, (float)1.3, "Cebra", "Blanco y Negro");
		Terrestre A5 = new Terrestre(200.0, (float)1.1, "Tigre", "Naranja y Negro");
		Volador A6 = new Volador(3.1, (float) 1.3, "Flamenco", "Rosado");
		Volador A7 = new Volador(3.2,(float) 0.7, "Búho", "Gris");
		Volador A8 = new Volador(4.3,(float) 0.8, "Águila", "Blanco y Negro");
		Volador A9 = new Volador(1.1, (float)0.6, "Halcon", "Azul");
		Volador A10 = new Volador(0.7, (float)0.5, "Loro", "Variado");
		AnimalesT.add(A1);
		AnimalesT.add(A2);
		AnimalesT.add(A3);
		AnimalesT.add(A4);
		AnimalesT.add(A5);
		
		AnimalesV.add(A6);
		AnimalesV.add(A7);
		AnimalesV.add(A8);
		AnimalesV.add(A9);
		AnimalesV.add(A10);
	
		Animales.add(A1);
		Animales.add(A2);
		Animales.add(A3);
		Animales.add(A4);
		Animales.add(A5);
		Animales.add(A6);
		Animales.add(A7);
		Animales.add(A8);
		Animales.add(A9);
		Animales.add(A10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A\u00F1adir animal volador");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(164, 11, 238, 52);
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
		
		Nombre = new JTextField();
		Nombre.setBounds(174, 95, 209, 20);
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		Color = new JTextField();
		Color.setBounds(174, 145, 209, 20);
		contentPane.add(Color);
		Color.setColumns(10);
		
		Altura = new JTextField();
		Altura.setBounds(174, 195, 209, 20);
		contentPane.add(Altura);
		Altura.setColumns(10);
		
		Peso = new JTextField();
		Peso.setBounds(174, 248, 209, 20);
		contentPane.add(Peso);
		Peso.setColumns(10);
		Volador B[] = new Volador[10];
		for (int i = 0; i < B.length; i++) {
            B[i] = new Volador();
            }
		JButton btnNewButton = new JButton("Crear animal");
		btnNewButton.addActionListener(new ActionListener() {
			int b=0;
			public void actionPerformed(ActionEvent e) {
				try {
					B[b].setname(Nombre.getText());
					B[b].setname(Color.getText());
					float F = Float.parseFloat(Altura.getText());
					B[b].setHeight(F);
					double D = Double.parseDouble(Peso.getText());
					B[b].setWeight(D);
					b++;
					Animales.add(B[b]);
					AnimalesV.add(B[b]);
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
				UI frmZoo = new UI();
				frmZoo.setvisible(true);
			}
		});
		btnNewButton_1.setBounds(380, 320, 113, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
}
