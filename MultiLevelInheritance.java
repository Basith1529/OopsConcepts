package program;

//base class
class One2{ 
	
	void printone(){
		
		System.out.println("Print One");
	}
}

//Intermediatory class
//child class two inherits class one
class Two2 extends One2{ 
	
	void printtwo() {
		
		System.out.println("Print Two");
	}
}

//child class three inherits from class two
//Derived class
class Three2 extends Two2{
	
	void printthree() {
		
		System.out.println("Print Three");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Three2 th=new Three2();
		
		th.printone();
		th.printtwo();
		th.printthree();

	}

}
