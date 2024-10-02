package program;

abstract class Shape{ //abstract class
	
	abstract void draw(); //abstract method
	
	public void info() { //concrete method
		
		
	}
}

//In real scenario, implementation is provided by others i.e,unknown
class Rectangle extends Shape{
	
	void draw() //method overriding
	{
		System.out.println("Rectangle shape");
	}
	
	public void info() {
		
		System.out.println("Info Details");
	}
}
	class Circle extends Shape{
		
		void draw() {
			
			System.out.println("Circle Shape");
		}
		
		public void info() {
			
			System.out.println("Info details");
		}
	}

//In real scenerio , method is called programmer or user	
public class AbstractClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//First call to object
		Shape s1=new Rectangle();
		s1.draw();
		s1.info();
		
		//second call to object
		Shape s2=new Circle();
		s2.draw();
		s2.info();

	}

}
