package program;

class One { //Base class or parent class or superclass
	  
	void printone() {
		
		System.out.println("Print one");
	}
}

class Two extends One{ //Derived class or child class or subclass
	
	void printtwo() {
		
		System.out.println("Print Two");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Two t=new Two();
		
		t.printone();
		t.printtwo();

	}

}
