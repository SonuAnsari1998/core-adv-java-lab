package Aug_26;

class College {
	int marksOfSubject1;
	int marksOfSubject2;
	int marksOfSubject3;
	int totalMarks;
	float avg;
	String resultStatus;

	public void calculateResult(int marksOfSubject1, int marksOfSubject2, int marksOfSubject3) {
		this.marksOfSubject1 = marksOfSubject1;
		this.marksOfSubject2 = marksOfSubject2;
		this.marksOfSubject3 = marksOfSubject3;
		this.totalMarks = totalMarks;
		this.avg = avg;
		this.resultStatus = resultStatus;

		totalMarks = (marksOfSubject1 + marksOfSubject2 + marksOfSubject3);
		avg = (totalMarks / 3);

		resultStatus = (avg >= 35) ? "Pass" : "Fail";
	}

	public void displayResult() {
		System.out.println("Subject 1: " + marksOfSubject1);
		System.out.println("Subject 2: " + marksOfSubject2);
		System.out.println("Subject 3: " + marksOfSubject3);
		System.out.println("Total: " + totalMarks);
		System.out.println("Average: " + avg);
		System.out.println("Result: " + resultStatus);
	}
}
