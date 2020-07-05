package zoo;

import java.awt.BorderLayout;
import java.io.PrintStream;
import java.util.*;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextArea;
import java.io.IOException;
import java.io.OutputStream;
import javax.swing.JTextArea;
import javax.swing.DropMode;



public class Mostrar extends JFrame {

	private JPanel contentPane;
	private JTextArea Vola;
	private JTextArea Terre;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mostrar frame = new Mostrar();
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
	public Mostrar() {
		CrearV idk = new CrearV();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JButton btnNewButton = new JButton("Ver animales voladores");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Vola.setText(idk.AnimalesV.toString());
			}
		});
		btnNewButton.setBounds(59, 11, 150, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ver animales terrestres");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Terre.setText(idk.AnimalesT.toString());
				
			}
		});
		btnNewButton_1.setBounds(386, 11, 143, 23);
		contentPane.add(btnNewButton_1);
		
		 Vola = new JTextArea();
		Vola.setBounds(30, 45, 238, 416);
		contentPane.add(Vola);
		
		 Terre = new JTextArea();
		Terre.setBounds(312, 45, 260, 416);
		contentPane.add(Terre);
		
		JButton btnNewButton_2 = new JButton("Volver al menu");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				UI dude = new UI();
				dude.setvisible(true);
			}
		});
		btnNewButton_2.setBounds(245, 11, 108, 23);
		contentPane.add(btnNewButton_2);
		
	}
}
