package staywell.entities;

import staywell.entities.dao.RegisterDAO;

public class Test {
	public static void main(String[] args){
		
		User user = new User();
		user.setUserName("monkylols");
		user.setPassword("monkeysnsd");
		user.setFirstName("Adrian");
		user.setLastName("Foo");
		user.setEmail("adrianfoo94@gmail.com");
		user.setAddress("asdasdasdas");
		user.setGender("male");
		user.setNationality("Singaporean");
		user.setOccupation("programmer");
		user.setDob("5/12/1994");
		RegisterDAO.userRegister(user);
		
		Guest guest = new Guest();
		guest.setEmail("adrianfoo@gmail.com");
		guest.setMembership("gold");
		guest.setPoint(1000);
		guest.setRoomNumber(200);
		RegisterDAO.guestRegister(guest);
		
	}
}
