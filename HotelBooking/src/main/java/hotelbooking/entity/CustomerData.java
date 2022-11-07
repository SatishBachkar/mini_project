package hotelbooking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HotelCustomerData")
public class CustomerData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private int custId;
	
	@Column(length = 30, nullable = false, unique = true)
	private String name;
	
	@Column(length = 30, nullable = false)
	private String adreass;
	
	@Column(length = 15, nullable = false, unique = true)
	private Long aadharNumber;
	
	@Column(length = 11, nullable = false, unique = true)
	private Long contactNumber;
	
	@Column(length = 3, nullable = false)
	private int noOfRooms;
	
	@Column(length = 3, nullable = false)
	private int noOfDays;

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdreass() {
		return adreass;
	}

	public void setAdreass(String adreass) {
		this.adreass = adreass;
	}

	public Long getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public Long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	
	
	
	

}
