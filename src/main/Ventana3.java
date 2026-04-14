package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ventana3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana3 window = new Ventana3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton_9 = new JButton("Reiniciar");
		panel.add(btnNewButton_9);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("0:00");
		panel_3.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(1, 2, 0, 50));
		
		JLabel lblNewLabel_1 = new JLabel("X:0");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("O:0");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("New button");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_6 = new JButton("New button");
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("New button");
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		panel_2.add(btnNewButton_8);
	}

}
