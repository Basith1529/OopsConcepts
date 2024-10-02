package task;

abstract class Person5{
	
	abstract void eat();
	
	abstract void exercise();
	
	void display() {
		
		
	}
}

class Athlete extends Person5{
	
	String name;
	String category;
	int age;
	
	Athlete(String name,String category,int age){
		
		this.name=name;
		this.category=category;
		this.age=age;
	}
	
	void display() {
		
		System.out.println("Person 1:Athlete");
		System.out.println("Person Name :" +name);
		System.out.println("Person Ctegory :" +category);
		System.out.println("Person Age :" +age);
	}
	void eat() {
		
		System.out.println("Athlete eats a balanced diet with high protein and carbohydrates.");
	}
	
	void exercise() {
		
		System.out.println("Athlete trains rigorously every day.");
	}
}

class LazyPerson extends Person5{
	
	String name;
	String category;
	int age;
	
	LazyPerson(String name,String category,int age){
		
		this.name=name;
		this.category=category;
		this.age=age;
	}
	
	void display() {
		
		System.out.println("Person 2:LazyPerson");
		
		System.out.println("Person Name :" +name);
		System.out.println("Person Name :" +category);
		System.out.println("Person Name :" +age);
		
	}
	
	void eat() {
		
		System.out.println("Lazy person prefers fast food and snacks.");
	}
	
	void exercise() {
		
		System.out.println("Lazy person rarely exercises.");
	}
}

public class Task4AbstractPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Athlete Person
		Person5 Athlete=new  Athlete("Basith","Athlete",24);
		
		Athlete.display();
		Athlete.eat();
		Athlete.exercise();
		
		System.out.println();
        
		Person5 Lp=new LazyPerson("Ahamed","Lazy",25);
		
		Lp.display();
		Lp.eat();
		Lp.exercise();
	}

}
