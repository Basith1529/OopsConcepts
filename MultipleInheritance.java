package program;

interface One1{ //interface
	
	public void printone();
}

interface Two1{ //interface
	
	public void printtwo(); 
	
}

interface Three1 extends One1,Two1{
	
	public void printthree();
}

class Child implements Three1{ //class inherits interface (implements)
	

	@Override
	public void printone() {
		
		System.out.println("Print one from class one");
		
	}
	
	public void printtwo() {
		
		System.out.println("Print two from class two");	
	}
	
	public void printthree() {
		
		System.out.println("Print three from class three");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child C=new Child();
	
		C.printone();
		C.printtwo();
		C.printthree();
		

	}

}
