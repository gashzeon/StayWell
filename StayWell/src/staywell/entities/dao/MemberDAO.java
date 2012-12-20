package staywell.entities.dao;

import staywell.entities.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class MemberDAO {

	static Connection currentCon = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs1 = null;
	static PreparedStatement pstmt1 = null;

	public static Member register(Member member) {
		
		Statement stmt = null;
		
		// get the last member ID 
		try {
			
			currentCon = DBConnectionManager.getConnection();
			stmt = currentCon.createStatement();
            // query for inserting into the table
            String query = "insert into user(userName,password, firstName, lastName, email) values(?,?,?,?,?)";
            pstmt = currentCon.prepareStatement(query);
            // inserting values
            pstmt.setString(1,member.getUserName());
            pstmt.setString(2,member.getPassword());
            pstmt.setString(3, member.getFirstName());
            pstmt.setString(4, member.getLastName());
            pstmt.setString(5, member.getEmail());  
            pstmt.executeUpdate();
            
		} catch (Exception ex) {

			System.out.println("Registration failed: An Exception has occurred! "
					+ ex);
		}

		// exception handling
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
				rs = null;
			}

			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
				stmt = null;
			}

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return member;

	}
	
	public static Member searchByUserName(String userName) {
		Member member = null;
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
                String secondName = rs.getString("lastName");
                String email = rs.getString("email");
                
                member = new Member();
                member.setUserName(userName1);
                member.setPassword(password);
                member.setFirstName(firstName);
                member.setLastName(secondName);
                member.setEmail(email);
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }

		return  member;
	}
	
}
