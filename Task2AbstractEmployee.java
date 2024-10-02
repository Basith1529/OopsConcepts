package task;

//Abstract class 
abstract class Employee1 {
 // Abstract method 
 abstract double calculateSalary();

 // Abstract method 
 abstract void displayInfo();
}

//Subclass Manager that extends Employee
class Manager extends Employee1 {
 private String name;
 private int id;
 private double baseSalary;
 private double bonus;

 // Constructor
 public Manager(String name, int id, double baseSalary, double bonus) {
     this.name = name;
     this.id = id;
     this.baseSalary = baseSalary;
     this.bonus = bonus;
 }

 // Implement calculateSalary method
 @Override
 double calculateSalary() {
     return baseSalary + bonus;
 }

 // Implement displayInfo method
 @Override
 void displayInfo() {
     System.out.println("Manager Information:");
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
     System.out.println("Salary: " + calculateSalary());
 }
}

//Subclass Programmer that extends Employee
class Programmer extends Employee1 {
 private String name;
 private int id;
 private double baseSalary;
 private double overtimeHours;
 private double overtimeamt;

 // Constructor
 public Programmer(String name, int id, double baseSalary, double overtimeHours, double overtimeamt) {
     this.name = name;
     this.id = id;
     this.baseSalary = baseSalary;
     this.overtimeHours = overtimeHours;
     this.overtimeamt = overtimeamt;
 }

 
 @Override
 double calculateSalary() {
     return baseSalary + (overtimeHours * overtimeamt);
 }


 @Override
 void displayInfo() {
     System.out.println("Programmer Information:");
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
     System.out.println("Salary: " + calculateSalary());
 }

}
public class Task2AbstractEmployee {
 public static void main(String[] args) {
     
     Employee1 manager = new Manager("Ahamed Basith", 12, 50000, 10000);
     manager.displayInfo();

     System.out.println();
     
     Employee1 programmer = new Programmer("Abdul Majeed", 14, 40000, 20, 50);
     programmer.displayInfo();
 }
}

