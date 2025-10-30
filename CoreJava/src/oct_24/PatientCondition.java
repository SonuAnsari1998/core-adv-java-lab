package oct_24;
/*Create another BLC class PatientCondition.

Instance Variables:
patient : Patient : private
conditionCategory : String : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method to print the following details:

[Patient "Ravi Kumar" is in "Excellent" Health Condition]*/
public class PatientCondition {
	private Patient patient;
	private String conditionCategory;
	public PatientCondition(Patient patient, String conditionCategory) {
		super();
		this.patient = patient;
		this.conditionCategory = conditionCategory;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public String getConditionCategory() {
		return conditionCategory;
	}
	public void setConditionCategory(String conditionCategory) {
		this.conditionCategory = conditionCategory;
	}
	@Override
	public String toString() {
		return "PatientCondition [" + (patient != null ? "patient=" + patient + ", " : "")
				+ (conditionCategory != null ? "conditionCategory=" + conditionCategory : "") + "]";
	}
	
}
