package task;

//The Person class has two attributes: name and age.
//The constructor Person(String name, int age) initializes these attributes.
//The displayPerson() method is used to print the name and age of a Person.
//In the Main class, two Person objects are created and initialized with their respective names and ages,
//and then their information is printed.

class Person{
	
	String name;
	int age;

public Person(String name,int age) {
	
	this.name=name;
	this.age=age;
}

void DisplayPerson() {
	
//	System.out.println("Person Name: "+name+ " "+"Person Age: "+age);
	System.out.println("The person name is: "+name);
	System.out.println("The person age is: "+age);
}
}
public class Task4Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p=new Person("Basith",25);
		Person p1=new Person("Ahamed",26);
		
		p.DisplayPerson();
		System.out.println();
		p1.DisplayPerson();

	}

}
