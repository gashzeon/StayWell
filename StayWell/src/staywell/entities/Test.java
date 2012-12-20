package staywell.entities;

import staywell.entities.dao.MemberDAO;

public class Test {
	public static void main(String[] args){
		
		Member member = new Member();
		member.setUserName("monkylols");
		member.setPassword("monkeysnsd");
		member.setFirstName("Adrian");
		member.setLastName("Foo");
		member.setEmail("adrianfoo94@gmail.com");
		MemberDAO.register(member);
		
	}
}
