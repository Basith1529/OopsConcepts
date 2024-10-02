package program;

public class AbstractSalary extends AbstractEmployee{

	private double salary; //Annual salary
	
	public AbstractSalary(String name,String address,int number,double salary) {
		
		super(name,address,number);
			
			setAbstractSalary(salary);
		}
		
		public void mailCheck() {
			
			System.out.println("Within mailCheck of Salary class ");
			System.out.println("Mailing chect to " + getName()+ " with salary " + salary);
		}
		
		public double getAbstractSalary() {
			
			return salary;
		}
		
		public void setAbstractSalary(double newSalary) {
			
			if(newSalary >= 0.0) {
				
				salary = newSalary;
			}
		}
		
		double computePay() {
			
			System.out.println("Computing salary pay for " + getName());
			return salary/52;
		}
	
  
public static void main(String[] args) {
	
	AbstractSalary AS=new AbstractSalary("Basith","Chennai",1234,91599);
	AS.mailCheck();
	
	double A=AS.getAbstractSalary();
	System.out.println(A);
	
	AS.setAbstractSalary(14);
	
	double num=AS.computePay();
	System.out.println(num);
}
}