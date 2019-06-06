package com.domain.dao;

import com.domain.bean.Domain;

public interface DAOInterface {
//	For users perspective
	public String getDomainName(String id);
	public String getSeatsAvailable(String id);
	
//	For admin perspective
	public boolean setDomain(Domain subject);
	public boolean removeDomain(String id);
	public boolean setSeatsAvialable(String id, String quantity);
}
