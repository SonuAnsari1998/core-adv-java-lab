package oct_24;
/*Create another class CalculatePatientCondition which does not contain any field (Variable)

Methods:
Name of the Method : evaluateCondition()  [Factory Method]
return type : PatientCondition
Access Modifier : public, static
Argument : Patient

In evaluateCondition() method, task is to find the Patient Condition based on health index and
 create and return the PatientCondition
object on the following criteria:

Health Index             Condition Category
> 9.0                        Excellent
>= 8.0                       Very Good
>= 6.0                       Good
>= 4.0                       Fair
< 4.0                        Poor*/
public class CalculatePatientCondition {
	public static PatientCondition evaluateCondition(Patient p) {
		PatientCondition pc=null;
		double healthIndex=p.getHealthIndex();
		if(healthIndex>9.0) {
			pc=new PatientCondition(p,"Excellent");
		}else if(healthIndex>=8.0 && healthIndex<=9.0) {
			pc=new PatientCondition(p,"Very Good");
		}else if(healthIndex>=6.0 && healthIndex<=8.0) {
			pc=new PatientCondition(p,"Good");
		}else if(healthIndex>=4.0 && healthIndex<6.0) {
			pc=new PatientCondition(p,"Fair");
		}else {
			pc=new PatientCondition(p,"Poor");
		}
		return pc;
	}
}
