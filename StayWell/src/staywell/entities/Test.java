package staywell.entities;

import staywell.entities.dao.RegisterDAO;

public class Test {
	public static void main(String[] args){
		
		UserEntities user = new UserEntities();
		user.setUserName("monkylols");
		user.setPassword("monkeysnsd");
		user.setFirstName("Adrian");
		user.setLastName("Foo");
		user.setMembershipNo("adrianfoo94@gmail.com");
		user.setAddress("asdasdasdas");
		user.setGender("male");
		user.setNationality("Singaporean");
		user.setOccupation("programmer");
		user.setDob("5/12/1994");
		RegisterDAO.userRegister(user);
		
		GuestEntities guest = new GuestEntities();
		guest.getMembershipNo("adrianfoo@gmail.com");
		guest.setMembership("gold");
		guest.setPoint(1000);
		guest.setRoomNumber(200);
		RegisterDAO.guestRegister(guest);
		
	}
}
