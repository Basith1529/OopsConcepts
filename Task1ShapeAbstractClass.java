package task;

//The Shape class is declared as abstract, containing two abstract methods calculateArea() and calculatePerimeter().
//The Circle class extends Shape and provides implementations for calculating the area and perimeter of a circle.
//The Triangle class extends Shape and calculates the area using Heron's formula and the perimeter by
//summing up the sides.
//In the Main class, both shapes are instantiated, and their respective area and perimeter are printed.

abstract class Shape{
	
	abstract double calculateArea();
	
	abstract double calculatePerimeter();
	
}

//Circle
class Circle extends Shape{

double radius;

public Circle(double radius) {
	
	this.radius=radius;
}

@Override
double calculateArea() {
	
	return Math.PI*radius*radius;
}

@Override
double calculatePerimeter() {
	
	return 2*Math.PI*radius;
}
}

//Triangle
class Triangle extends Shape{
	 private double side1,side2,side3;
	
	 public Triangle(double side1,double side2,double side3) {
		 
		 this.side1=side1;
		 this.side2=side2;
		 this.side3=side3;
		 
	 }
	 
	 double calculateArea() {
		 
		 double s=(side1+side2+side3)/2;
		 return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	 }
	 
	 double calculatePerimeter() {
		 
		 return (side1+side2+side3);
	 }
}



public class Task1ShapeAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Circle
		Shape circle=new Circle(5);
		double Circle=circle.calculateArea();
		double Circle1=circle.calculatePerimeter();
		
		System.out.println("Calculate the Area and Perimeter of Circle:");
		System.out.println("Area of Circle: "+Circle);
		System.out.println("Perimeter of Circle: "+Circle1);
		
		System.out.println();
		//Triangle
		
		Shape Triangle=new Triangle(4,5,6);
		double triangle=Triangle.calculateArea();
		double triangle1=Triangle.calculatePerimeter();
		
		System.out.println("Calculate the Area and Perimeter of Triangle:");
		System.out.println("Area of Triangle: "+triangle);
		System.out.println("Perimeter of Triangle: "+triangle1);
		
	}

}
