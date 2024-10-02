package program;

abstract class Bank{ //abstract class
	
	abstract int getRateOfInterest(); //abstract method
}
class SBI extends Bank{
	
	int getRateOfInterest() { //method overriding
		
		return 7;
	}
}

class PNB extends Bank{
	
	int getRateOfInterest() { //method overriding
		
		return 8;
	}
}

public class AbstractClassBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b;
		b=new SBI();
		
		System.out.println("Rate of Interest (SBI) is: "+b.getRateOfInterest()+"%");
		
		b=new PNB();
		
		System.out.println("Rate of Interest (PNB) is: "+b.getRateOfInterest()+"%");

	}

}
