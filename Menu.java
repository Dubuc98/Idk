package Stuff;
import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class Menu {

	private JFrame frmZoo;
	private JTable table;
	private JTable table_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frmZoo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Menu() {
		initialize();
	}
	public ArrayList<animales>animallsit() {
		ArrayList<animales> animal = new ArrayList<>();
		
		try {
			Connection conn = DB.getConnection();
			String query = "SELECT * FROM animales";
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			animales dude;
			
			while(rs.next()) {
				dude = new animales(rs.getInt("idanimal"),rs.getString("nombre"),rs.getString("color"),rs.getString("tipo"),rs.getDouble("peso"),rs.getDouble("altura"));
			animal.add(dude);
			}
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		return animal;
	}
	public void showtable(){
		ArrayList<animales> list = animallsit();
		DefaultTableModel model = (DefaultTableModel) table_1.getModel();//java.lang.NullPointerException 
		Object[] row = new Object[6];									//damn spoiler alert didn't worked
		for (int i=0;i<list.size();i++) {
			row[0]= list.get(i).getid();
			row[1]= list.get(i).getname();
			row[2]= list.get(i).getcolor();
			row[3]= list.get(i).gettipo();
			row[4]= list.get(i).getpeso();
			row[5]= list.get(i).getaltura();
			model.addRow(row);
		}
	}
	private void initialize() {
		//showtable()error :/
		frmZoo = new JFrame();
		frmZoo.setTitle("Zoo");
		frmZoo.setBounds(100, 100, 565, 442);
		frmZoo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmZoo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido al zoologico");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(143, 21, 263, 45);
		frmZoo.getContentPane().add(lblNewLabel);
		
		
		JButton AñadirM = new JButton("A\u00F1adir animal");
		AñadirM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmZoo.setVisible(false);
				vista1 V1 = new vista1();
				V1.setVisible(true);
			}
		});
		AñadirM.setForeground(Color.GREEN);
		AñadirM.setBounds(21, 342, 138, 32);
		frmZoo.getContentPane().add(AñadirM);
		
		JButton EliminarM = new JButton("Eliminar animal");
		EliminarM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmZoo.setVisible(false);
				Vista2 V2 = new Vista2();
				V2.setVisible(true);
			}
		});
		EliminarM.setForeground(Color.RED);
		EliminarM.setBounds(210, 342, 138, 32);
		frmZoo.getContentPane().add(EliminarM);
		
		JButton ModificarM = new JButton("Modificar animal");
		ModificarM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmZoo.setVisible(false);
				Vista3 V3 = new Vista3();
				V3.setVisible(true);
			}
		});
		ModificarM.setForeground(Color.BLUE);
		ModificarM.setBounds(392, 342, 138, 32);
		frmZoo.getContentPane().add(ModificarM);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(57, 87, 425, 220);
		frmZoo.getContentPane().add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"tipo", "altura", "peso", "color", "nombre", "idanimal"
			}
			
		));
		table_1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}
		public void setvisible(boolean b) {
			frmZoo.setVisible(true);
	}
}
