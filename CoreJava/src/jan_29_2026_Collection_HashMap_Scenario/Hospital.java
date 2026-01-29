package jan_29_2026_Collection_HashMap_Scenario;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	private int hospitalCode;
	private String hospitalName;
	List<String> listOfTreatments;
	private String contactPerson;
	private String contactNumber;
	private String location;

	public Hospital(int hospitalCode, String hospitalName, List<String> listOfTreatments, String contactPerson,
			String contactNumber, String location) {
		this.hospitalCode = hospitalCode;
		this.hospitalName = hospitalName;
		this.listOfTreatments = listOfTreatments;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;
	}

	public int getHospitalCode() {
		return hospitalCode;
	}

	public void setHospitalCode(int hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public List<String> getListOfTreatments() {
		return listOfTreatments;
	}

	public void setListOfTreatments(List<String> listOfTreatments) {
		this.listOfTreatments = listOfTreatments;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalCode=" + this.hospitalCode + ", hospitalName=" + this.hospitalName
				+ ", listOfTreatments=" + this.listOfTreatments + ", contactPerson=" + this.contactPerson
				+ ", contactNumber=" + this.contactNumber + ", location=" + this.location + "]";
	}

}
