package com.domain.service;


import com.domain.bean.Domain;
import com.domain.dao.DAO;

public class Service implements ServiceInterface	{
	private static DAO db = null;
	
	public Service()	{
		try	{
			Service.db = new DAO();
			Service.db.createConnection("Domain", "root", "");
		}
		catch(NullPointerException npe)	{
			System.out.println("database is not connected!");
		}
	}

	@Override
	public String getDomainName(String id) {
		return Service.db.getDomainName(id);
	}

	@Override
	public String getSeatsAvailable(String id) {
		return Service.db.getSeatsAvailable(id);
	}

	@Override
	public boolean setDomain(Domain domain) {
		return Service.db.setDomain(domain);
	}

	@Override
	public boolean removeDomain(String id) {
		return Service.db.removeDomain(id);
	}

	@Override
	public boolean setSeatsAvailable(String id, String seats) {
		return Service.db.setSeatsAvialable(id, seats);
	}
	
	public boolean reduceSeatByOne(String id)	{
		String currentSeats = this.getSeatsAvailable(id);
		if(currentSeats.equals("0"))	{
			return false;
		}
		else	{
			this.setSeatsAvailable(id, new Integer((Integer.parseInt(currentSeats)-1)).toString());
			return true;
		}
	}
	
	public int countRows()	{
		return Service.db.countRows();
	}
	
	public String[] getRows()	{
		return Service.db.getRows();
	}
}
