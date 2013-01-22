package staywell.entities.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import staywell.entities.*;

public class CleaningServicesDAO {
	static Connection currentCon = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs1 = null;
	static PreparedStatement pstmt1 = null;

	// added in another comment
	// added in another comment to test conflict2
	public static void insertTiming(CleaningServicesEntities cleaningServices) {
		
		Statement stmt = null;

		// get the last member ID 
		try {
			
            // query for inserting into the table
			currentCon = DBConnectionManager.getConnection();
            stmt = currentCon.createStatement();
            String query = "insert into cleaningservices(time,roomNumber,membershipNo) values(?,?,?)";
            pstmt = currentCon.prepareStatement(query);
            // inserting values
            
         
            pstmt.setString(1,cleaningServices.getTime());
            pstmt.setInt(2,cleaningServices.getRoomNo());
            pstmt.setString(3,cleaningServices.getMembershipNo());
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

	}
}
