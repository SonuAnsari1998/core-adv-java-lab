package Aug_26;

class Feedback {
String studentName;
String courseName;
float rating;
String feedback;
public void collectFeedback(String studentName,String courseName, float rating,String feedback){
	this.studentName=studentName;
	this.courseName=courseName;
	this.rating=rating;
	this.feedback=feedback;
}
	
	void displayFeedback() {
		System.out.println("Thank You "+studentName+"!");
		System.out.println("Course: "+courseName);
		System.out.println("Rating: "+rating);
		System.out.println("Feedback: "+feedback);
	}
	

}
