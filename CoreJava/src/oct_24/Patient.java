package oct_24;
/*BLC Class: Patient

Instance Variables:
patientName : String : private
healthIndex : double : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the patient from this method.*/
public class Patient {
	private String patientName;
	private double healthIndex;
	public Patient(String patientName, double healthIndex) {
		super();
		this.patientName = patientName;
		this.healthIndex = healthIndex;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public double getHealthIndex() {
		return healthIndex;
	}
	public void setHealthIndex(double healthIndex) {
		this.healthIndex = healthIndex;
	}
	public String toString() {
		return "[Patient: "+this.patientName;
	}
}
