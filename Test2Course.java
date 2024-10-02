package task;

class Course{
	
	String cname;
	String ins;
	int credits;
	


public Course(String cname,String ins,int credits) {
	
	this.cname=cname;
	this.ins=ins;
	this.credits=credits;
}

void display() {
	
	System.out.println("Course : " +cname);
	System.out.println("Instructor :" +ins);
	System.out.println("Credits: " +credits);
}
}

class OnlineCourse extends Course{
	
	String platform;
	int duration;


public OnlineCourse(String cname,String ins,int credits,String platform,int duration) {
	
	super(cname,ins,credits);
	
	this.platform=platform;
	this.duration=duration;
}

void display() {
	
	super.display();
	
	System.out.println("Platform : "+platform);
	System.out.println("Duration :" +duration);
}

public void CheckCertificateEligibility() {

         if(duration>=5) {
        	 
        	 System.out.println("The course is eligible for you");
         }
         else {
        	 
        	 System.out.println("The course is not eligible for you");
         }
}

}

public class Test2Course {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		OnlineCourse course1=new OnlineCourse("Java Programming","Mohana Mam",4,"SLA",3);
		course1.display();
		course1.CheckCertificateEligibility();
		
		System.out.println();
		
		OnlineCourse course2=new OnlineCourse("HTML","Mohana Mam",5,"SOFTLOGIC",5);
		course2.display();
		course2.CheckCertificateEligibility();
		
	}

}
