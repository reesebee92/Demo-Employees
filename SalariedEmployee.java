/**
 * SalariedEmployee class
 * 
 * This class will extend the employee class and specify a new variable salary.
 * There are 2 available constructors as well as getter, and setter methods for
 * the added instance variable. A display message is also provided to print
 * employee details with salary included.
 * 
 * @author sDantzler
 */
public class SalariedEmployee extends Employee {
   // instance variables
   private double salary;

   // default SalariedEmployee constructor
   public SalariedEmployee() {
      super();
      salary = -1;
   }

   // parameterized SalariedEmployee constructor
   public SalariedEmployee(String n, String d, String a, double s) {
      super(n, d, a);
      salary = s;
   }

   /**
    * getSalary
    * 
    * This method will return the salary
    */
   public double getSalary() {
      return salary;
   }// end getSalary method

   /**
    * setSalary
    * 
    * This method will set the salary
    * 
    * @param salary
    */
   public void setSalary(int salary) {
      this.salary = salary;
   }// end setSalary method

   /**
    * display
    * 
    * This method will print the employee information now including salary
    */
   public void display() {
      super.display();
      System.out.println("   $" + salary);
   }// end display method

}// end SalariedEmployee method
