package com.domain.service;

import com.domain.bean.Domain;


public interface ServiceInterface {
//	For users perspective	
	public String getDomainName(String id);
	public String getSeatsAvailable(String id);
	
//	For admin perspective
	public boolean setDomain(Domain subject);
	public boolean removeDomain(String id);
	public boolean setSeatsAvailable(String id, String seats);
}
