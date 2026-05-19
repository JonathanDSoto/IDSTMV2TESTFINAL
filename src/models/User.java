package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class User {

	private int id;
    private String name;
    private String email;
    private String password;
    private String lastname;
    private String phone;
    
    public User() {
        
    }
    
    public User(int id, String name, String email, String password, String lastname, String phone)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.lastname = lastname;
        this.phone = phone;
    }
    
    public ArrayList<User> get()
    {
    	ArrayList<User> users = new ArrayList<>();
    	
    	String query = "SELECT * FROM `users`";
    	
    	Connection conn = null; 
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/aimep3tm",
					"root",
					""
			);
			
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				User tmp = new User();
				
				tmp.setId(rs.getInt("id"));
				tmp.setEmail(rs.getString("email"));
				tmp.setPhone(rs.getString("phone"));
				tmp.setName(rs.getString("name"));
				tmp.setLastname(rs.getString("lastname"));
				
				users.add(tmp);
			}
			
			rs.close();
			ps.close();
			conn.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	return users;
    }

    public boolean make(String email, String password, String name)
    {
    	
    	String query = "INSERT INTO `users` (`id`, `email`, `password`, `name`, `lastname`, `phone`) VALUES (NULL, ?, ?, ?, NULL, NULL);";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aimep3tm","root","");
		
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setString(1, email);
			ps.setString(2, password);
			ps.setString(3, name);
			
			int rowsAffected = ps.executeUpdate();
			
			if (rowsAffected > 0)
			{
				
				ps.close();
				conn.close();
				
				return true;
			}
		
		} catch (Exception e) { 
			e.printStackTrace();
		}
		
		return false; 
    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
    
    

}









