package Sep_19;

/*6) Write a program to calculate the tax for a taxable income of Rs. 9,90,000, if the tax rate is fixed at 4.9%.*/



public class CalculateTaxIncome{
public static void main(String []args){

Long incomeRs=990000L;
double texRate=4.9;
double taxAmount= (texRate*incomeRs)/100;

System.out.println("----------------------------------");
System.out.println("Total Income is: "+incomeRs);
System.out.println("Tex Rate is "+texRate+" %");
System.out.println("Text Amount is : "+taxAmount);
}
}

