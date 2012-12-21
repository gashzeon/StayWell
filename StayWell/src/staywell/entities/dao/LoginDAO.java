package staywell.entities.dao;

import staywell.entities.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDAO {

	static Connection currentCon = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs1 = null;
	static PreparedStatement pstmt1 = null;
	public static boolean successLogin = false;
	
	public static User Login(User user) {
		String userName = user.getUserName();
		Statement stmt = null;
		
        String searchQuery = "select * from user where userName ='"
                + userName + "' ";

        try {
            // connect to DB
            currentCon = DBConnectionManager.getConnection();
            stmt = currentCon.createStatement();
            rs = stmt.executeQuery(searchQuery);
            boolean more = rs.next();

            // if user does not exist set the isValid variable to false
            if (!more) {
              System.out.println("member with the User Name = " + userName + " does not exst");
            }

            // if user exists set the isValid variable to true
            else if (more) {
                String userName1 = rs.getString("userName");
                String password = rs.getString("password");
                String firstName = rs.getString("firstName");
                String lastName = rs.getString("lastName");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String dob = rs.getString("dob");
                String gender = rs.getString("gender");
                String nationality = rs.getString("nationality");
                
                user = new User();
                user.setUserName(userName1);
                user.setPassword(password);
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setEmail(email);
                user.setAddress(address);
                user.setDob(dob);
                user.setGender(gender);
                user.setNationality(nationality);
                successLogin = true;
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }

		return  user;
	}

	
}
