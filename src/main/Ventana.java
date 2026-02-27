package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
		
		this.setVisible(true);
		this.setSize(1200, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(1200,800));
		this.setTitle("Hola"); 
		this.getContentPane().setBackground(Color.decode("#C8DEBD"));
		this.setLayout(null);
		
		this.users();
	}
	
	public void login()
	{
		//contenedor de login
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.black);
		contenedor.setSize(500, 500);
		contenedor.setLocation(50, 50);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		JLabel title_login = new JLabel();
		title_login.setText("Bienvenido");
		title_login.setSize(200, 30);
		title_login.setOpaque(true);
		title_login.setLocation(150, 10);
		title_login.setBackground(Color.white);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JTextField username = new JTextField();
		username.setSize(300,30);
		username.setLocation(30, 150);
		username.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(username);
		
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(200, 400);
		acceder.setSize(120, 50);
		acceder.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(acceder);
		
		contenedor.repaint();
		contenedor.revalidate();
	}
	
	public void registro()
	{
		//contenedor para el registro
		
		JPanel register_container = new JPanel();
		register_container.setSize(500, 500);
		register_container.setLocation(650,50);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#66B0A8"));
		register_container.setLayout(null);
		this.add(register_container);
		
		
		JLabel bio_tag = new JLabel("Biografía");
		bio_tag.setBounds(100, 100, 250, 40);
		bio_tag.setBackground(Color.white);
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setOpaque(true);
		bio_tag.setFont(new Font("Arial",Font.BOLD,22));
		register_container.add(bio_tag);
		
		JTextArea bio = new JTextArea();
		bio.setBounds(120, 160, 250, 120);
		register_container.add(bio);
		
		JCheckBox sweet_option = new JCheckBox("Dulce");
		sweet_option.setBounds(120, 330, 100, 50);
		register_container.add(sweet_option);
		
		JCheckBox salty_option = new JCheckBox("Salado");
		salty_option.setBounds(220, 330, 100, 50);
		register_container.add(salty_option);
		
		JCheckBox healthy = new JCheckBox("Saludable");
		healthy.setBounds(320, 330, 100, 50);
		healthy.setBorderPainted(true);
		healthy.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
		register_container.add(healthy);
		
		
		JRadioButton accept_terms = new JRadioButton("Acepto los términos");
		accept_terms.setBounds(120, 400, 150, 50);
		register_container.add(accept_terms);
		
		JRadioButton reject_terms = new JRadioButton("Rechazo los términos");
		reject_terms.setBounds(290, 400, 150, 50);
		register_container.add(reject_terms);
		
		ButtonGroup terms = new ButtonGroup(); 
		terms.add(reject_terms);
		terms.add(accept_terms); 
		
		String [] colonias = {"Camino real","La fuente","Villas del encanto"};
		
		JComboBox list = new JComboBox(colonias);
		list.setBounds(50, 50, 200, 60);
		register_container.add(list);
		
		
		register_container.repaint();
	}
	
	public void users() {
		
		JPanel users = new JPanel();
		users.setSize(1000, 500);
		users.setLocation(100, 50);
		users.setBackground(Color.white);
		users.setLayout(null);
		this.add(users);
		
		JLabel users_title = new JLabel("USUARIOS");
		users_title.setBounds(400, 30, 200, 40);
		users_title.setHorizontalAlignment(JLabel.CENTER);
		users_title.setOpaque(true);
		users_title.setFont(new Font("Arial",Font.BOLD,22));
		users_title.setBackground(Color.decode("#F27A61"));
		users.add(users_title);
		
		JButton export = new JButton("Exportar");
		export.setBounds(30, 120, 100, 40);
		users.add(export);
		
		JButton add = new JButton("Añadir");
		add.setBounds(130, 120, 100, 40);
		users.add(add);
		
		Object[] table_head = {"No. control","Nombre","Apellidos","Semestre","Promedio","Acciones"};
		
		Object [][] table_content = {
		    {"20231001","Juan","Pérez García","3","8.7","Editar"},
		    {"20231002","María","López Hernández","5","9.2","Editar"},
		    {"20231003","Carlos","Ramírez Torres","2","7.9","Editar"},
		    {"20231004","Ana","Gómez Sánchez","6","9.5","Editar"},
		    {"20231001","Juan","Pérez García","3","8.7","Editar"},
		    {"20231002","María","López Hernández","5","9.2","Editar"},
		    {"20231003","Carlos","Ramírez Torres","2","7.9","Editar"},
		    {"20231004","Ana","Gómez Sánchez","6","9.5","Editar"},
		    {"20231001","Juan","Pérez García","3","8.7","Editar"},
		    {"20231002","María","López Hernández","5","9.2","Editar"},
		    {"20231003","Carlos","Ramírez Torres","2","7.9","Editar"},
		    {"20231004","Ana","Gómez Sánchez","6","9.5","Editar"},
		    {"20231001","Juan","Pérez García","3","8.7","Editar"},
		    {"20231002","María","López Hernández","5","9.2","Editar"},
		    {"20231003","Carlos","Ramírez Torres","2","7.9","Editar"},
		    {"20231004","Ana","Gómez Sánchez","6","9.5","Editar"}
		};
		
		JTable users_table = new JTable(table_content,table_head);
		JScrollPane scrollPane = new JScrollPane(users_table);
		
		scrollPane.setLocation(30, 180); 
		scrollPane.setSize(800, 100);
		
		
		users.add(scrollPane);
	}
}








