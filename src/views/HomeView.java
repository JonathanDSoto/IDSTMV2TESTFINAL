package views;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

import controllers.UsersController;

public class HomeView {

	public HomeView() {
		
	}
	
	public void showHome()
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
		
		JButton goToUsers = new JButton("Ir al panel de usuarios");
		goToUsers.setBounds(100, 100, 200, 100);
		goToUsers.addActionListener(e ->{
			
			UsersController uc = new UsersController();
			uc.showUsers();
			
			ventana.dispose();
			
		});
		ventana.add(goToUsers);
		
		ventana.setVisible(true);
	}

}






