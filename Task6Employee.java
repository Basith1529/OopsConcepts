package task;

//The Employee class has three attributes: name, jobTitle, and salary.
//The constructor Employee(String name, String jobTitle, int salary) initializes these attributes.
//The calculateSalary(int percentage) method calculates the new salary based on a given percentage raise.
//The updateSalary(int newSalary) method updates the salary to the new value.
//The displayInfo() method prints the employee's details (name, job title, and salary).
//In the Main class, an Employee object is created and initialized. 
//A 10% raise is calculated, the salary is updated, and the details are printed before and after the raise.

class Employee{
	
	String name;
	String jobtitle;
	int salary;
	
	public Employee(String name,String jobtitle,int salary) {
		
		this.name=name;
		this.jobtitle=jobtitle;
		this.salary=salary;
		
	}
	
	 int calculatesalary(int percentage) {
		
		return salary+(salary*percentage/100);
	}
	
	 void updatesalary(int newsalary) {
		
		salary=newsalary;
	}
	
	void displaydetails() {
		
		System.out.println("Employee Name :"+name);
		System.out.println("Employee Job Title :"+jobtitle);
		System.out.println("Employee Salary :"+"Rs."+salary);
	}
}

public class Task6Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp=new Employee("Basith","Software Engineer",75000);
		emp.displaydetails();
		
		int newsalary=emp.calculatesalary(10);
		emp.updatesalary(newsalary);
		
		System.out.println("Employee Details after 10% raise salary");
		emp.displaydetails();
		
		

	}

}
