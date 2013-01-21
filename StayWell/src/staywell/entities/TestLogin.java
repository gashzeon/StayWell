package staywell.entities;

import staywell.entities.dao.LoginDAO;

public class TestLogin {
	public static void main(String[] args){
		UserEntities user = new UserEntities();
		user.setPassword("monkeysnsd");
		user.setUserName("monkylols");
		
		UserEntities user2 = new UserEntities();
		
		user2=LoginDAO.Login(user);
		System.out.println("Welcome " + user2.getFirstName()+" " + user2.getLastName());
		
	}
}
