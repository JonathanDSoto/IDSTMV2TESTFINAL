package controllers;

import java.util.ArrayList;

import models.UserModel;
import views.UserView;

public class UserController {

	public UserView uv;
	private UserModel um;
	
	public UserController() {
		uv = new UserView();
		um = new UserModel();
	}
	
	public void show()
	{
		//ArrayList<User> users = um.get();
		uv.index();
	}

}
