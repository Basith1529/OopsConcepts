package task;

abstract class Vehicle{
	
	abstract void StartEngine();
	
	abstract void StopEngine();

    void displayinfo() {
	
}
}

class Car extends Vehicle{
	
	String make;
	String model;
	int year;
	
	public Car(String make,String model,int year) {
		
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	void displayinfo() {
		
		System.out.println("Car Information:");
		System.out.println("Make Car: " +make);
		System.out.println("Model Car: " +model);
		System.out.println("Year Car: " +year);
		
		
	}
	void StartEngine() {
		
		System.out.println("Start The Car Engine");
	}
	
	void StopEngine() {
		
		System.out.println("Stop the Car Engine");
	}
}

class MotorCycle extends Vehicle{
	
	String make;
	String model;
	int year;
	
	MotorCycle(String make,String model,int year){
		
	this.make=make;
	this.model=model;
	this.year=year;
}
	void displayinfo() {
		
		System.out.println("MotorCycle Information:");
		
		System.out.println("Make MotorCycle :" +make);
		System.out.println("MotorCycle Model :" +model);
		System.out.println("MotorCycle Year :" +year);
	}
	void StartEngine() {
		
		System.out.println("Start the MotorCycle Engine");
	}
	
	void StopEngine() {
		
		System.out.println("Stop the MotorCycle Engine");
	}
}

public class Task3AbstractVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle car=new Car("Hyundai","Venue",2024);
		car.displayinfo();
		car.StartEngine();
		car.StopEngine();
		
		System.out.println();
		
		Vehicle mc=new MotorCycle("Yamaha","R15 v4",2024);
		mc.displayinfo();
		mc.StartEngine();
		mc.StopEngine();

	}

}
