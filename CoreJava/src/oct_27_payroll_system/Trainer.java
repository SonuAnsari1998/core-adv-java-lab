package oct_27_payroll_system;

public class Trainer {
	int trainerId;
	String trainerName;
	double basicSalary;
	double HRAPer;
	double DAPer;
	int batchCount;
	double perkPerBatch;
	
	public Trainer(int trainerId, String trainerName, double basicSalary, double hRAPer, double dAPer, int batchCount,
			double perkPerBatch) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.batchCount = batchCount;
		this.perkPerBatch = perkPerBatch;
	}
	
	public int getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
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

	public int getBatchCount() {
		return batchCount;
	}

	public void setBatchCount(int batchCount) {
		this.batchCount = batchCount;
	}

	public double getPerkPerBatch() {
		return perkPerBatch;
	}

	public void setPerkPerBatch(double perkPerBatch) {
		this.perkPerBatch = perkPerBatch;
	}

	public double calculateGrossSalary() {
		return basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch);
	}
}
