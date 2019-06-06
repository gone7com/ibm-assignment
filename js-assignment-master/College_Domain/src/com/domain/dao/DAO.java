package com.domain.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimeZone;

import com.domain.bean.Domain;



public class DAO implements DAOInterface {
	
	private static Connection dbConnection = null;
	private static PreparedStatement stmt = null;
	
	public void createConnection(String dbName, String userName, String password)	{
		
		try	{
			String timeZoneCorrection = "?serverTimezone=" + TimeZone.getDefault().getID();
			
			Class.forName("com.mysql.jdbc.Driver");
			
			DAO.dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + dbName + timeZoneCorrection, userName, password);
			
		}
		catch(ClassNotFoundException | SQLException e)	{
			System.out.println("[createConnection]\n" + e.getMessage());
		}
		
	}

	@Override
	public boolean setSeatsAvialable(String id, String seats) {
		String query = "update training set seats_availability=? where domain_id=?";
		
		try	{
			DAO.stmt = DAO.dbConnection.prepareStatement(query);
			DAO.stmt.setString(1, seats);
			DAO.stmt.setString(2, id);
			
			if(DAO.stmt.executeUpdate() != 0)	{
//				System.out.println("seats: " + quantity + " on id: " + id);
				return true;
			}
			else	{
				return false;
			}
		}
		catch(SQLException e) {
			System.out.println("[setSeatsAvailable]\n" + e);
			return false;
		}
	}

	@Override
	public String getDomainName(String id) {
		String query = "select domain_name from training where domain_id=?";
		
		try	{
			DAO.stmt = DAO.dbConnection.prepareStatement(query);
			DAO.stmt.setString(1, id);
			
			ResultSet rs = DAO.stmt.executeQuery();
			String DomainName = null;
			while(rs.next())	{
				DomainName = rs.getString(1);
			}
			return DomainName;
		}
		catch(SQLException e)	{
			System.out.println("[getDomainName]\n" + e);
			return "[id not found]";
		}
	}

	@Override
	public String getSeatsAvailable(String id) {
		String query = "select seats_availability from training where domain_id=?";
		
		try	{
			DAO.stmt = DAO.dbConnection.prepareStatement(query);
			DAO.stmt.setString(1, id);
			
			ResultSet rs = DAO.stmt.executeQuery();
			String availableSeats = null;
			while(rs.next())	{
				availableSeats = rs.getString(1);
			}
			return availableSeats;
		}
		catch(SQLException e) {
			System.out.println("[getSeatsAvailable]\n" + e);
			return "[id not found]";
		}
	}

	@Override
	public boolean setDomain(Domain domain) {
		String query = "insert into training values(?, ?, ?)";
		
		try	{
			DAO.stmt =DAO.dbConnection.prepareStatement(query);
			DAO.stmt.setString(1, domain.getDomainId());
			DAO.stmt.setString(2, domain.getDomainName());
			DAO.stmt.setString(3, domain.getAvailableSeats());
			
			if(DAO.stmt.executeUpdate() != 0)	{
//				System.out.println("id:" + subject.getSubjectId() + " name: " + subject.getSubjectName() + " seats: " + subject.getAvailableSeats() + " added!");
				return true;
			}
			else	{
				return false;
			}
		}
		catch(SQLException e)	{
			System.out.println("[setDomain]\n" + e);
			return false;
		}
	}
	
	@Override
	public boolean removeDomain(String id)	{
		String query = "delete from training where domain_id=? limit 1";
		
		try	{
			DAO.stmt = DAO.dbConnection.prepareStatement(query);
			DAO.stmt.setString(1, id);
			
			if(DAO.stmt.executeUpdate() != 0)	{
				System.out.println("id: " + id + " removed");
				return true;
			}
			else	{
				return false;
			}
		}
		catch(SQLException e)	{
			System.out.println("[removeDomain]\n" + e);
			return false;
		}
	}
	
	public int countRows()	{
		String query = "select count(domain_id) from training";
		
		try	{
			DAO.stmt = DAO.dbConnection.prepareStatement(query);
			ResultSet rs = DAO.stmt.executeQuery();
			
			int returnIt = 0;
			while(rs.next())	returnIt = rs.getInt(1);
			
			return returnIt;
		}
		catch(SQLException e)	{
			System.out.println("[countRows]\n" + e);
			return 0;
		}
	}
	
	public String[] getRows()	{
		String query = "select domain_id,domain_name,seats_availability from training";
		
		try	{
			DAO.stmt = DAO.dbConnection.prepareStatement(query);
			ResultSet rs = DAO.stmt.executeQuery();
			
			String[] rows = new String[this.countRows()];
			int counter = 0;
			while(rs.next())	{
				rows[counter++] = rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3);
			}
			return rows;
		}
		catch(SQLException e)	{
			System.out.println("[getRows]\n" + e);
			return null;
		}
	}
}
