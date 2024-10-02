package task;

//The Rectangle class has two attributes: width and height.
//The constructor Rectangle(double width, double height) initializes these attributes.
//The calculateArea() method returns the area of the rectangle, which is calculated as width * height.
//The calculatePerimeter() method returns the perimeter, which is calculated as 2 * (width + height).
//In the Main class, a Rectangle object is created with a width of 5.0 and height of 3.0, 
//and its area and perimeter are calculated and printed.

class Rectangle{
	
	double width;
	double height;
	
	public Rectangle(double width,double height) {
		
		this.width=width;
		this.height=height;
	}
	
	 double calculatearea() {
		 
		 return (width*height);
		 
	 }
	 
	 double calculateperimeter() {
		 
		 return ((width+height)*2);
	 }
	 
	
}



public class Task5Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle R=new Rectangle(5.0,3.0);
		
		double Area=R.calculatearea();
		double Perimeter=R.calculateperimeter();
		
		System.out.println("The Area of Rectangle is: "+Area);
		System.out.println("The Perimer of Rectangle is: "+Perimeter);

	}

}
