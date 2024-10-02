package task;


class vehicle{
	
	String make;
	String model;
	int year;
	
	public vehicle(String make,String model,int year) {
		
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	void displaydetails() {
		
		System.out.println("Make :" +make);
		System.out.println("Model :" +model);
		System.out.println("Year :" +year);
	}
}

class  Car extends vehicle{
	
	int trunksize;
	
	public Car(String make,String model,int year,int trunksize) {
		
		super(make,model,year);
		this.trunksize=trunksize;
	}
	
	void displaydetails() {
		
		super.displaydetails();
		
		System.out.println("Trunk Size: " +trunksize);
	}
}

class Truck extends vehicle{
	
	int payload;
	
	public Truck(String make,String model,int year,int payload) {
		
		super(make,model,year);
		
		this.payload=payload;
	}
	
	void display() {
		
		super.displaydetails();
		
		System.out.println("Payload Capacity :" +payload);
		
		
	}
}

public class Test1Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a Car Details");
		
		Car mycar= new Car("Hyndai","Venue",2023,15);
		
		mycar.displaydetails();
		
		System.out.println();
		
		System.out.println("This is a Truck Details");
		
		Truck mytruck=new Truck("Ford","F-150",2023,1200);
		mytruck.display();

	}

}
