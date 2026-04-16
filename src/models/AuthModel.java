package models;

import javax.swing.JOptionPane;

public class AuthModel {

	public AuthModel() {
		
	}
	
	public boolean login(String email,String password) {
		
		if(email.equals("fake@mail.com") ) {
			if(password.equals("12345")) {
				
				return true; 
				
			}else {
				return false; 
			}
		}else {
			return false; 
		}
		
		 
	}

}
