package org.onetomany.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Teacher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tId;
	
	@Column(length = 30, nullable = false ,unique = true)
	private String tName;
	
	@Column(length = 30, nullable = false ,unique = true)
	private String eMail;
	
	@Column(length = 30, nullable = false)
	private String batchCode;
	
	@OneToMany(targetEntity = Learner.class)
	private List <Learner> learner;

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getBatchCode() {
		return batchCode;
	}

	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}

	public List<Learner> getLearner() {
		return learner;
	}

	public void setLearner(List<Learner> learner) {
		this.learner = learner;
	}
	
	
	
	

}
