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
		this.setLayout(null);
		
		this.registro();
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
		
	}
}








