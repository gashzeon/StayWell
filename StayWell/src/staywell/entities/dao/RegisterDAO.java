package staywell.entities.dao;

import staywell.entities.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegisterDAO {

	static Connection currentCon = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs1 = null;
	static PreparedStatement pstmt1 = null;

	public static UserEntities userRegister(UserEntities user) {
		
		Statement stmt = null;
		
		// get the last member ID 
		try {
			
			currentCon = DBConnectionManager.getConnection();
			stmt = currentCon.createStatement();
            // query for inserting into the table
            String query = "insert into user(userName, password, firstName, lastName, email, gender, nationality, dob, address, occupation) values(?,?,?,?,?,?,?,?,?,?)";
            pstmt = currentCon.prepareStatement(query);
            // inserting values
            pstmt.setString(1,user.getUserName());
            pstmt.setString(2,user.getPassword());
            pstmt.setString(3, user.getFirstName());
            pstmt.setString(4, user.getLastName());
            pstmt.setString(5, user.getEmail());  
            pstmt.setString(6, user.getGender());
            pstmt.setString(7, user.getNationality());
            pstmt.setString(8, user.getDob());
            pstmt.setString(9, user.getAddress());
            pstmt.setString(10, user.getOccupation());
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
		return user;

	}
	public static GuestEntities guestRegister(GuestEntities guest) {
		
		Statement stmt = null;
		
		// get the last member ID 
		try {
			
			currentCon = DBConnectionManager.getConnection();
			stmt = currentCon.createStatement();
            // query for inserting into the table
            String query = "insert into guest(membership, points, roomNumber, cost, email) values(?, ?, ?, ?, ?)";
            pstmt = currentCon.prepareStatement(query);
            // inserting values
            pstmt.setString(1,guest.getMembership());
            pstmt.setInt(2,guest.getPoints());
            pstmt.setInt(3, guest.getRoomNumber());
            pstmt.setDouble(4, guest.getCost());
            pstmt.setString(5, guest.getEmail());  
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
		return guest;

	}
	
	
}
