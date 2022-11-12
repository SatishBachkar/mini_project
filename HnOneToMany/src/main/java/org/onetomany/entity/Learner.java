package org.onetomany.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Learner {
	
	@Id
	private int sId;
	
	@Column(length = 30, nullable = false, unique = true)
	private String sName;
	
	@Column(length = 30, nullable = false)
	private String education;
	
	@Column(length = 11, nullable = false, unique = true)
	private Long phoneNumber;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int i) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	

}
