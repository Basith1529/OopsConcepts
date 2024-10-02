package task;

public class Task1EmpDetailsConstructor {
	int id;
	String name;
	int salary;
	int age;
	String designation;
	
	Task1EmpDetailsConstructor(int i,String n,int s,int a,String d){
		
		id=i;
		name=n;
		salary=s;
		age=a;
		designation=d;
		
	}
	
	public void displaydetails()
	{
		
		System.out.println("Employee ID :"+id);
		System.out.println("Employee Name :"+name);
		System.out.println("Employee Salary :"+salary);
		System.out.println("Employee Age :"+age);
		System.out.println("Employee Desgination :"+designation);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task1EmpDetailsConstructor det=new Task1EmpDetailsConstructor(2906,"Basith",20000,25,"Manager");
		
		det.displaydetails();
		

	}

}
