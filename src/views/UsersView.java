package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.User;

public class UsersView {

	public UsersView() {
		
	}
	
	public void tableUsers(ArrayList<User> data_users)
	{  
		
		JFrame ventana = new JFrame();
		ventana.setSize(1000, 640);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(1200,800));
		ventana.setTitle("Hola"); 
		ventana.getContentPane().setBackground(Color.decode("#C8DEBD"));
		ventana.setLayout(null);
		
		JPanel users = new JPanel();
		users.setSize(1000, 500);
		users.setLocation(100, 50);
		users.setBackground(Color.white);
		users.setLayout(null);
		ventana.add(users);
		
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
		
		Object[] table_head = {"ID","Nombre","Apellidos","Correo","Teléfono","Acciones"};
		
		/*Object [][] table_content = {
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
		};*/
		
		DefaultTableModel model = new DefaultTableModel(table_head, 0);
		
		for (User user : data_users) {
			
	        Object[] row = { user.getId(), user.getName(), user.getLastname(), user.getEmail(), user.getPhone() };
	        model.addRow(row); 
	    }
		
		//JTable users_table = new JTable(table_content,table_head);
		
		JTable users_table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(users_table);
		
		scrollPane.setLocation(30, 180); 
		scrollPane.setSize(800, 100);
		
		
		users.add(scrollPane);
		
		ventana.setVisible(true);
	}
}
