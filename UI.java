package zoo;

import java.awt.EventQueue;

import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class UI {

	private JFrame frmZoo;
	private JPanel Panel;
	private JTextField textfield;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frmZoo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmZoo = new JFrame();
		frmZoo.setTitle("Zoo");
		frmZoo.setBounds(100, 100, 452, 400);
		frmZoo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmZoo.getContentPane().setLayout(null);
		this.textfield = new JTextField();  
		this.textfield.setBounds(198,321, 0,7); 
		this.frmZoo.getContentPane().add(textfield);
		
		JLabel lblNewLabel = new JLabel("Welcome to the zoo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(104, 11, 231, 89);
		frmZoo.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ver lista de animales");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmZoo.setVisible(false);
				Mostrar lista = new Mostrar();
				lista.setVisible(true);
			}
		});
		btnNewButton.setBounds(104, 96, 231, 23);
		frmZoo.getContentPane().add(btnNewButton);
		JButton btnNewButton_1 = new JButton("Agregar nuevo Animal terrestre");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmZoo.setVisible(false);
				CrearT ter = new CrearT();
				ter.setVisible(true);
				}
		});
		btnNewButton_1.setBounds(104, 142, 231, 23);
		frmZoo.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Agregar nuevo animal volador");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmZoo.setVisible(false);
				CrearV Vol = new CrearV();
				Vol.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(104, 190, 231, 23);
		frmZoo.getContentPane().add(btnNewButton_2);

	}

	public void setvisible(boolean b) {
		frmZoo.setVisible(true);
		// TODO Auto-generated method stub
		
	}
	}

