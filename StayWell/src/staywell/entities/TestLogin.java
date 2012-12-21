package staywell.entities;

import staywell.entities.dao.LoginDAO;

public class TestLogin {
	public static void main(String[] args){
		User user = new User();
		user.setPassword("monkeysnsd");
		user.setUserName("monkylols");
		
		User user2 = new User();
		
		user2=LoginDAO.Login(user);
		System.out.println("Welcome " + user2.getFirstName()+" " + user2.getLastName());
		
	}
}
