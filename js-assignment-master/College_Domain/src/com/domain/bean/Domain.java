package com.domain.bean;

public class Domain {
	String domainId, domainName, SeatsAvialable;

	public Domain(String domainId, String domainName, String SeatsAvialabele) {
		this.domainId = domainId;
		this.domainName = domainName;
		this.SeatsAvialable = SeatsAvialabele;
	}

	public String getDomainId() {
		return domainId;
	}

	public void setDomainId(String domainId) {
		this.domainId = domainId;
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getAvailableSeats() {
		return SeatsAvialable;
	}

	public void setAvailableSeats(String SeatsAvialable) {
		this.SeatsAvialable = SeatsAvialable;
	}

}
