package Aug_22;

class Car{
String brandName;//Brandname varies from one car to another car
String color;//color varies from one car to another car
double mileage;//mileage for different car object is different
int noOfSeats;//no. of seats for different car object is different
static final int WHEELS = 4;//no. of wheels is fixed for every car
public static void main(String []args){
//create 2 cars
Car c1 = new Car();
Car c2 = new Car();

//accessing all the variable for 2 different cars without initialising them
System.out.println("Details of c1: ");
System.out.println("Brand name of Car c1: "+c1.brandName);//null
System.out.println("Color of Car c1: "+c1.color);//null
System.out.println("Mileage of Car c1: "+c1.mileage);//0.0
System.out.println("No. of seats of Car c1: "+c1.noOfSeats);//0
System.out.println("No. of Wheels of Car c1: "+WHEELS);//4
System.out.println("----------------------------------------------------");
c1.brandName = "TATA";
c1.mileage = 13.7;
c1.color = "Black";
c1.noOfSeats = 5;
System.out.println("Details of c1 after its assigned with values: ");
System.out.println("Brand name of Car c1: "+c1.brandName);//TATA
System.out.println("Color of Car c1: "+c1.color);//null
System.out.println("Mileage of Car c1: "+c1.mileage);//0.0
System.out.println("No. of seats of Car c1: "+c1.noOfSeats);//0
System.out.println("No. of Wheels of Car c1: "+WHEELS);//4
System.out.println("----------------------------------------------------");
System.out.println("Details of c2 before assigning values: ");
System.out.println("Brand name of Car c2: "+c2.brandName);//null
System.out.println("Color of Car c2: "+c2.color);//null
System.out.println("Mileage of Car c2: "+c2.mileage);//0.0
System.out.println("No. of seats of Car c2: "+c2.noOfSeats);//0
System.out.println("No. of Wheels of Car c2: "+WHEELS);//4


}
}