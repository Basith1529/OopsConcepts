package program;

class DataField{
	
	float salary =60000; //Base class data variable
}

class Program extends DataField{
	
	int bonus=30000;  //Derived class data variable
	
}
public class SingleInheritanceData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program P=new Program();
		
		System.out.println("The program salary is :"+P.salary);
		System.out.println("The program bonus is :"+P.bonus);


	}

}
