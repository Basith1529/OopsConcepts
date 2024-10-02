package program;
//We can inherit the properties of Emplyee class just like concrete method

public abstract class AbstractEmployee{
	
	private String name;
	private String address;
	private int number;
	
public AbstractEmployee(String name,String address,int number) {
	
	System.out.println("Constructing an Employee");
	
	this.name=name;
	this.address=address;
	this.number=number;
}
public double computepay() {
	
	System.out.println("Inside Employee Compute Pay");
	return 0.0;
}

public void mailcheck() {
	
	System.out.println("Mailing a Check to" + this.name + " " + this.address);
}

public String toString() {
	
	return name + " " + address + " " + number;
}

public String getName() {
	
	return name;
}

public String getAddress() {
	
	return address;
}

public void setAddress(String newAddress) {
	
	address=newAddress;
}

public int getNumber() {
	
	return number;
}
	
}


	
