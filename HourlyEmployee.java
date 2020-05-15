/**
 * HourlyEmployee class
 * 
 * This class will extend the employee class and specify a new variables
 * hourlyPay, hoursWorked, and earnings. There are 2 available constructors as
 * well as getter, and setter methods for every instance variable available. A
 * display message is also provided to print employee details with the new
 * variables included.
 * 
 * @author sDantzler
 */
public class HourlyEmployee extends Employee {
   // instance variables
   private double hourlyPay;
   private double hoursWorked;
   private double earnings;

   // default HourlyEmployee constructor
   public HourlyEmployee() {
      super();
      hourlyPay = -1;
      hoursWorked = -1;
      earnings = -1;
   }

   // parameterized HourlyEmployee constructor
   public HourlyEmployee(String n, String d, String a, double hpr, double h) {
      super(n, d, a);
      hourlyPay = hpr;
      hoursWorked = h;

      if (hoursWorked <= 40) {
         earnings = regularPay(hpr, h);
      } else {
         earnings = overtime(hpr, h);
      }

   }

   /**
    * getHourlyPay
    * 
    * This method will return the hourly pay
    */
   public double getHourlyPay() {
      return hourlyPay;
   }// end getHourlyPay method

   /**
    * setHourlyPay
    * 
    * This method will set the salary
    * 
    * @param hourlyPay
    */
   public void setHourlyPay(int hourlyPay) {
      this.hourlyPay = hourlyPay;
   }// end setHourlyPay method

   /**
    * getHoursWorked
    * 
    * This method will return the hourly pay
    */
   public double getHoursWorked() {
      return hoursWorked;
   }// end getHoursWorked method

   /**
    * setHoursWorked
    * 
    * This method will set the salary
    * 
    * @param hoursWorked
    */
   public void setHoursWorked(int hoursWorked) {
      this.hoursWorked = hoursWorked;
   }// end setHoursWorked method

   /**
    * getEarnings
    * 
    * This method will return the earnings
    */
   public double getEarnings() {
      return earnings;
   }// end getEarnings method

   /**
    * setEarnings
    * 
    * This method will set the salary
    * 
    * @param earnings
    */
   public void setEarnings(int earnings) {
      this.earnings = earnings;
   }// end setEarnings method

   /**
    * regularPay
    * 
    * This method will return the earnings for regular pay
    * equivalent to 40 hours or less
    * 
    * @param hpr, h (hourly rate, hours worked)
    */
   public double regularPay(double hpr, double h) {
      return hpr * h * 52;
   }// end regularPay method

   /**
    * overtime
    * 
    * This method will return the earnings for overtime pay
    * equivalent to 40 plus hours
    * 
    * @param hpr, h (hourly rate, hours worked)
    */
   public double overtime(double hpr, double h) {

      double regularPay = 40 * hpr;
      double hoursLeft = h - 40;
      double overtime = hoursLeft * (hpr * 1.5);
      double earnings = regularPay + overtime;
      return earnings * 52;
   }// end overtime method

   /**
    * display
    * 
    * This method will print the employee information now including
    * hourlyPay, hoursWorked, and earnings
    */
   public void display() {
      super.display();
      System.out.println(
            " $" + hourlyPay + "   " + hoursWorked + "    $" + earnings);
   }// end display method

}// end class HourlyEmployee
