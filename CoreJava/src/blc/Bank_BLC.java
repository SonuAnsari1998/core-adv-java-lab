package blc;

public class Bank_BLC {
	int customerId;
	String customerName;
	long customerMobileNo;
	double depositAmount;
	double totalDepositAmount;
	public void setCustomerDetails(int id,String name,long mobileNo,double dAmount,double totalDAmount){
		customerId=id;
		customerName=name;
		customerMobileNo=mobileNo;
		depositAmount=dAmount;
		totalDepositAmount=totalDAmount;
		
	}
	public void getCustomerDetails(){
		System.out.println("-----Customer Transiction Details-------");
		System.out.println("----------State Bank Of India---------");
		System.out.println("Customer Id: "+customerId);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Customer Mobile Number: "+customerMobileNo);
		System.out.println("Deposit Amount: "+depositAmount);
		System.out.println("Total Deposite Amount: "+totalDepositAmount);
	}
	
}
