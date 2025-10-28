package oct_27_payroll_system;

public class Sourcing {
	int sourceId;
	String sourcaName;
	double basicSalary;
	double HRAPer;
	double DAPer;
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;
	
	public Sourcing(int sourceId, String sourcaName, double basicSalary, double hRAPer, double dAPer,
			int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		this.sourceId = sourceId;
		this.sourcaName = sourcaName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}

	public int getSourceId() {
		return sourceId;
	}

	public void setSourceId(int sourceId) {
		this.sourceId = sourceId;
	}

	public String getSourcaName() {
		return sourcaName;
	}

	public void setSourcaName(String sourcaName) {
		this.sourcaName = sourcaName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getHRAPer() {
		return HRAPer;
	}

	public void setHRAPer(double hRAPer) {
		HRAPer = hRAPer;
	}

	public double getDAPer() {
		return DAPer;
	}

	public void setDAPer(double dAPer) {
		DAPer = dAPer;
	}

	public int getEnrollmentTarget() {
		return enrollmentTarget;
	}

	public void setEnrollmentTarget(int enrollmentTarget) {
		this.enrollmentTarget = enrollmentTarget;
	}

	public int getEnrollmentReached() {
		return enrollmentReached;
	}

	public void setEnrollmentReached(int enrollmentReached) {
		this.enrollmentReached = enrollmentReached;
	}

	public double getPerkPerEnrollment() {
		return perkPerEnrollment;
	}

	public void setPerkPerEnrollment(double perkPerEnrollment) {
		this.perkPerEnrollment = perkPerEnrollment;
	}

	public double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment);
	}
}
